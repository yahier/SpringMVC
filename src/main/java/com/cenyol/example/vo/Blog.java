package com.cenyol.example.vo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ttta")
public class Blog {

    @javax.persistence.Id
    private long id;
    private String content;
    private String date;

    public Blog() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
