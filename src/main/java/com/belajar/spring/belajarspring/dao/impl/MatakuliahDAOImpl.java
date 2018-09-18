package com.belajar.spring.belajarspring.dao.impl;

import com.belajar.spring.belajarspring.common.Table;
import com.belajar.spring.belajarspring.dao.MatakuliahDAO;
import com.belajar.spring.belajarspring.entity.Matakuliah;
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
public class MatakuliahDAOImpl implements MatakuliahDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Matakuliah save(Matakuliah param){
        String sql = "INSERT INTO " + Table.TABLE_MATAKULIAH + " (nama, sks) VALUES (?, ?)";

        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, param.getNama());
            ps.setInt(2, param.getSks());
            return ps;
        }, keyHolder);

        param.setId(Objects.requireNonNull(keyHolder.getKey()).intValue());
        return param;
    }

    @Override
    public Matakuliah update(Matakuliah param) {
        return null;
    }

    @Override
    public int delete(Matakuliah param) {
        return 0;
    }

    @Override
    public List<Matakuliah> find() {
        String sql = "SELECT * FROM " + Table.TABLE_MATAKULIAH;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Matakuliah.class));

    }

    @Override
    public Matakuliah findById(int id) {
        return null;
    }
}
