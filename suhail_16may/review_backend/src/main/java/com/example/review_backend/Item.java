package com.example.review_backend;

public class Item {
String idmovie;
String name;
String description;
String duration;
String type;
String director;
String writer;
String imageLink; 

// 1
public String getidmovie(){
    return idmovie;
}
public void setidmovie(String idmovie){
    this.idmovie = idmovie;;
}

// 2
public String getname(){
    return name;
}
public void setname(String name){
    this.name = name;
}
// 3
public String getdescription(){
    return description;
}
public void setdescription(String description){
    this.description = description;
}
// 4
public String getduration(){
    return duration;
}
public void setduration(String duration){
    this.duration = duration;
}
// 5
public String gettype(){
    return type;
}
public void settype(String type){
    this.type = type;
}
// 6
public String getdirector(){
    return director;
}
public void setdirector(String director){
    this.director = director;
}
// 7
public String getwriter(){
    return writer;
}
public void setwriter(String writer){
    this.writer = writer;
}

// 8
public String getimageLink(){
    return imageLink;
}
public void setcimageLink(String imageLink){
    this.imageLink = imageLink;
}


    
}