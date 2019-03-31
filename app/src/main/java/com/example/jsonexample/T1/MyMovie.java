package com.example.jsonexample.T1;

class MyMovie {

    public MyMovie(String name, String rating, String poster) {
        this.name=name;
        this.rating=rating;
        this.url=poster;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    private String name;
    private String url;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    private String rating;


}
