package com.example.chatapplication.Model;

public class User {
    private String id;
    private String username;
    private String imageURL;
    private String status;
    private String search;




    public User(String id, String username, String imageUrl, String status, String s)
    {
        this.id = id;
        this.username = username;
        this.imageURL = imageUrl;
        this.status = status;
        this.search = s;
    }
    public User()
    {

    }
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setImageUrl(String imageUrl) {
        this.imageURL = imageUrl;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getImageUrl() {
        return imageURL;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
