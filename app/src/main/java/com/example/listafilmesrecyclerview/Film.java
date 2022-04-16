package com.example.listafilmesrecyclerview;

public class Film {
    private int id;
    private String name;
    private int dateOfLaunch;
    private String ImageURL;

    public Film(int id, String name, int dateOfLaunch, String imageURL) {
        this.id = id;
        this.name = name;
        this.dateOfLaunch = dateOfLaunch;
        ImageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfLaunch=" + dateOfLaunch +
                ", ImageURL='" + ImageURL + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfLaunch() {
        return dateOfLaunch;
    }

    public void setDateOfLaunch(int dateOfLaunch) {
        this.dateOfLaunch = dateOfLaunch;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }
}
