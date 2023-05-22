package com.example.review_backend;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController 
@CrossOrigin(origins = "*")  
public class SpringBootJdbcController { 

    @Autowired  
            JdbcTemplate jdbc; 
    
    @RequestMapping( path="/addReview", method = RequestMethod.POST)
    public String storeData(@RequestBody String request) throws IOException{
            ObjectMapper myMapper = new ObjectMapper();
            JsonNode extractedData = myMapper.readTree(request);

            String username = extractedData.get("username").asText();
            String reviewRate = extractedData.get("reviewRate").asText();
            String reviewComment = extractedData.get("reviewComment").asText();
            
            jdbc.execute("INSERT INTO `sys`.`review` (`comment`, `rate`, `name`) VALUES ('"+reviewComment+"','"+reviewRate+"','"+username+"');");

            return"data inserted Successfully";  
        }
    

    // @Autowired
    // JdbcTemplate jdbc;

    // @RequestMapping("/insert")
    // public String index(){
    //     jdbc.execute("INSERT INTO `sys`.`movie` (`idmovie`, `name`, `description`, `duration`, `type`, `director`, `writer`) VALUES ('6', 'test22', 'fgdkrfgnwejrgwertgjoew', '2h 22m', 'Romance ', 'Robert Zemeckis', 'Eric Roth'); ");
    //     return "Insertion successful";
    // }
}


// http://localhost:7000/