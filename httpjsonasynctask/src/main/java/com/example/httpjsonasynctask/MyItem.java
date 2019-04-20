package com.example.httpjsonasynctask;

public class MyItem {


    private String userId;
    private String title;
    private String body;

    public MyItem(String user, String title, String body) {
        this.userId=user;
        this.title=title;
        this.body=body;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
