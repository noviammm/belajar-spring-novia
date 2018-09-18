package com.belajar.spring.belajarspring.dao.impl;

import com.belajar.spring.belajarspring.common.Table;
import com.belajar.spring.belajarspring.dao.MahasiswaDAO;
import com.belajar.spring.belajarspring.entity.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;

@Repository
public class MahasiswaDAOImpl implements MahasiswaDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Mahasiswa save(Mahasiswa param){
        String sql = "INSERT INTO " + Table.TABLE_MAHASISWA + " (nama_mhs, tempatlahir_mhs, tgllahir_mhs, " +
                "alamat_mhs, ayah_mhs, ibu_mhs, id_jurusan) VALUES (?, ?, ?, ?, ?, ?, ?)";

        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, param.getNamaMhs());
            ps.setString(2, param.getTempatLahir());
            ps.setDate(3, param.getTglLahir());
            ps.setString(4, param.getAlamatMhs());
            ps.setString(5, param.getAyahMhs());
            ps.setString(6, param.getIbuMhs());
            ps.setInt(7, param.getIdJurusan());
            return ps;
        }, keyHolder);

        param.setNpmMhs(Objects.requireNonNull(keyHolder.getKey()).intValue());
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

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Mahasiswa.class));

    }

    @Override
    public Mahasiswa findByIdFakultas(int idFakultas) {
        return null;
    }

    @Override
    public Mahasiswa findByIdJurusan(int idJurusan) {
        return null;
    }

    @Override
    public Mahasiswa findByIdMatakuliah(int idMatkul) {
        return null;
    }

    @Override
    public Mahasiswa findByIdMahasiswa(int npmMhs) {
        return null;
    }

    @Override
    public Mahasiswa findByIdKrs(int idkrs) {
        return null;
    }
}
