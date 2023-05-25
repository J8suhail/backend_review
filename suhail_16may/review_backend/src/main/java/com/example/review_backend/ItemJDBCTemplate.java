package com.example.review_backend;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ItemJDBCTemplate implements ItemDAO{

    DataSource dataSource;
    JdbcTemplate myTemplate;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.myTemplate = new JdbcTemplate((dataSource));
    }

    public List<Item> allItems(){
        String fetchItems = "SELECT * FROM `sys`.`movie`";
        List<Item> items = myTemplate.query(fetchItems, new ItemMapper());
        return items;
    }
}