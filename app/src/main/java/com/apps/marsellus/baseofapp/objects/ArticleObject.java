package com.apps.marsellus.baseofapp.objects;

public class ArticleObject {

    private String title;
    private String description;
    private int avatar;

    public ArticleObject() {
    }

    public ArticleObject(String title, String description, int avatar) {
        this.title = title;
        this.description = description;
        this.avatar = avatar;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
