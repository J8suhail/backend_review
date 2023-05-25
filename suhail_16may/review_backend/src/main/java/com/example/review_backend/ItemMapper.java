package com.example.review_backend;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;




public class ItemMapper implements RowMapper {
    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException{
        Item item = new Item();
        item.setidmovie(rs.getString("idmovie"));
        item.setname(rs.getString("name"));
        item.setdescription(rs.getString("description"));
        item.setduration(rs.getString("duration"));
        item.settype(rs.getString("type"));
        item.setdirector(rs.getString("director"));
        item.setwriter(rs.getString("writer"));
        item.setcimageLink(rs.getString("imageLink"));

        return item;
    }


}