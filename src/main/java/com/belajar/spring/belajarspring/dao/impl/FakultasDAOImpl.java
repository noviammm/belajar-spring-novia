package com.belajar.spring.belajarspring.dao.impl;

import com.belajar.spring.belajarspring.common.Table;
import com.belajar.spring.belajarspring.dao.FakultasDAO;
import com.belajar.spring.belajarspring.entity.Fakultas;
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
public class FakultasDAOImpl implements FakultasDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
//    INSERT INTO tbl_fakultas (nama_fakultas) VALUES ("FT")
    @Override
    public Fakultas save(Fakultas param){
        String sql = "INSERT INTO " + Table.TABLE_FAKULTAS + " (nama) VALUES (?)";

        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, param.getNama());
            return ps;
        }, keyHolder);

        param.setId(Objects.requireNonNull(keyHolder.getKey()).intValue());
        return param;
    }
//    UPDATE tbl_fakultas SET nama_fakultas ="FIPPS" WHERE id_fakultas = "3"
    @Override
    public Fakultas update(Fakultas param) {
        String sql = "UPDATE " + Table.TABLE_FAKULTAS + " SET (nama_fakultas)= ? WHERE (id_fakultas)= ? ";

        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update (con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, param.getNama());
            ps.setInt(2, param.getId());
            return ps;
        }, keyHolder);

        param.setId(Objects.requireNonNull(keyHolder.getKey()).intValue());
        return param;
    }

    @Override
    public int delete(Fakultas param) {
        return 0;
    }

    @Override
    public List<Fakultas> find() {
        String sql = "SELECT * FROM " + Table.TABLE_FAKULTAS;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Fakultas.class));
    }

    @Override
    public Fakultas findById(int id) {
        return null;
    }




}
