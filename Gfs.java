package com.example.pawel.projekt_appmob;

public class Gfs {
    private String type, description, Url;


    public Gfs(){};

    public Gfs(String type, String description, String Url){
        this.type=type;
        this.description=description;
        this.Url=Url;
    }


    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return Url;
    }

    public void setType(String name){
        this.type=name;
    }
    public void setDescription(String description){
        this.type=description;
    }

}
