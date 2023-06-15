package com.dataflair.myapplication;

public class Model {

    String cityname;
    String name;
    String discription;
    String image;
    String image2;
    String image3;
    String image4;
    String info_image;


    public Model() {
    }

    public Model(String cityname, String name, String discription, String image,String image2,String image3,String image4,String info_image) {
        this.cityname = cityname;
        this.name = name;
        this.discription = discription;
        this.image = image;
        this.image2 = image2;
        this.image3 = image3;
        this.image4=image4;
        this.info_image=info_image;

    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public String getInfo_image() {
        return info_image;
    }

    public void setInfo_image(String info_image) {
        this.info_image = info_image;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
}
