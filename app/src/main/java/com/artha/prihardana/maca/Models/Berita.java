package com.artha.prihardana.maca.Models;

import java.util.Date;

/**
 * Created by redbuzz on 14/03/18.
 */

public class Berita {
//    private Object source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
//    private Date publishedAt;

    public Berita() {}

    public Berita(Object source, String author, String title, String description, String url, String urlToImage, Date publishedAt) {
//        this.source = source;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
//        this.publishedAt = publishedAt;
    }

//    public Object getSource() {
//        return source;
//    }
//
//    public void setSource(Object source) {
//        this.source = source;
//    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

//    public Date getPublishedAt() {
//        return publishedAt;
//    }
//
//    public void setPublishedAt(Date publishedAt) {
//        this.publishedAt = publishedAt;
//    }
}
