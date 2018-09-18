package com.belajar.spring.belajarspring.dao.impl;

import com.belajar.spring.belajarspring.common.Table;
import com.belajar.spring.belajarspring.dao.MahasiswaDAO;
import com.belajar.spring.belajarspring.entity.Jurusan;
import com.belajar.spring.belajarspring.entity.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;

@Repository
public class MahasiswaDAOImpl implements MahasiswaDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Mahasiswa save(Mahasiswa param){
        String sql = "INSERT INTO " + Table.TABLE_MAHASISWA + " (nama, tempat, tgl, " +
                "alamat, ayah, ibu, id_jurusan) VALUES (?, ?, ?, ?, ?, ?, ?)";

        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, param.getNama());
            ps.setString(2, param.getTempat());
            ps.setDate(3, param.getTgl());
            ps.setString(4, param.getAlamat());
            ps.setString(5, param.getAyah());
            ps.setString(6, param.getIbu());
            ps.setInt(7, param.getIdJurusan());
            return ps;
        }, keyHolder);

        param.setId(Objects.requireNonNull(keyHolder.getKey()).intValue());
        return param;
    }

    @Override
    public Mahasiswa update(Mahasiswa param) {
        return null;
    }

    @Override
    public int delete(Mahasiswa param) {
        return 0;
    }

    @Override
    public List<Mahasiswa> find() {
        String sql = "SELECT * FROM " + Table.TABLE_MAHASISWA;

        return jdbcTemplate.query(sql, new RowMapper<Mahasiswa>() {
            @Override
            public Mahasiswa mapRow(ResultSet rs, int rowNum) throws SQLException {
                Mahasiswa mahasiswa = new Mahasiswa();

                Jurusan jurusan = new Jurusan();
                jurusan.setId(rs.getInt("idJurusan"));

                mahasiswa.setJurusan(jurusan);

                return mahasiswa;
            }
        });

    }

    @Override
    public Mahasiswa findById(int id) {
        return null;
    }


}
