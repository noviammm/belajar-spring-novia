package com.belajar.spring.belajarspring.dao.impl;

import com.belajar.spring.belajarspring.common.Table;
import com.belajar.spring.belajarspring.dao.JurusanDAO;
import com.belajar.spring.belajarspring.entity.Fakultas;
import com.belajar.spring.belajarspring.entity.Jurusan;
import org.springframework.beans.factory.annotation.Autowired;
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
public class JurusanDAOImpl implements JurusanDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Jurusan save(Jurusan param){
        String sql = "INSERT INTO " + Table.TABLE_JURUSAN + " (id_fakultas, nama) VALUES (?, ?)";

        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, param.getIdFakultas());
            ps.setString(2, param.getNama());
            return ps;
        }, keyHolder);

        param.setId(Objects.requireNonNull(keyHolder.getKey()).intValue());
        return param;
    }

    @Override
    public Jurusan update(Jurusan param) {
        return null;
    }

    @Override
    public int delete(Jurusan param) {
        return 0;
    }

    @Override
    public List<Jurusan> find() {
        String sql = "SELECT * FROM " + Table.TABLE_JURUSAN ;

        //tambahin ini juga buat join
        return jdbcTemplate.query(sql, new RowMapper<Jurusan>() {
            @Override
            public Jurusan mapRow(ResultSet rs, int rowNum) throws SQLException {
                Jurusan jurusan= new Jurusan();

                Fakultas fakultas = new Fakultas();
                fakultas.setId(rs.getInt("idJurusan"));

                jurusan.setFakultas(fakultas);

                return jurusan;
            }
            //sampesini
        });

    }

    @Override
    public Jurusan findById(int id) {
        return null;
    }

//    @Override
//    public Jurusan findByIdFakultas(int idFakultas) {
//        return null;
//    }
//
//    @Override
//    public Jurusan findByIdJurusan(int idJurusan) {
//        return null;
//    }
//
//    @Override
//    public Jurusan findByIdMatakuliah(int idMatkul) {
//        return null;
//    }
//
//    @Override
//    public Jurusan findByIdMahasiswa(int npmMhs) {
//        return null;
//    }
//
//    @Override
//    public Jurusan findByIdKrs(int idkrs) {
//        return null;
//    }
}
