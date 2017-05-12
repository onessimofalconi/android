package com.example.sala01.aula05;

/**
 * Created by sala01 on 12/05/2017.
 */

public class item {
    int avatarID, imgID;
    String name, local, likes;

    public item(int avatarID, int imgID, String name, String local, String likes) {
        this.avatarID = avatarID;
        this.imgID = imgID;
        this.name = name;
        this.local = local;
        this.likes = likes;
    }

    public int getAvatarID() {
        return avatarID;
    }

    public void setAvatarID(int avatarID) {
        this.avatarID = avatarID;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
