package com.rpicloud.models;

/**
 * Created by kaspernissen on 01/03/2016.
 */
public class Cat {

    public Cat(String name, String image_url, String age, String nickname) {
        this.name = name;
        this.image_url = image_url;
        this.age = age;
        this.nickname = nickname;
    }

    private String name;
    private String image_url;
    private String age;
    private String nickname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
