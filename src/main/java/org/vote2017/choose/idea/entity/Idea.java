package org.vote2017.choose.idea.entity;

import java.io.Serializable;

/**
 * Represent an idea to vote for.
 * Created by SQLI on 31/10/16.
 */
public class Idea implements Serializable {

    private Integer id;

    private String title;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
