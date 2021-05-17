package edu.unbosque.Workshop5.servlets.pojos;

import edu.unbosque.Workshop5.jpa.entities.Edition;

import javax.persistence.criteria.CriteriaBuilder;

public class EditionPOJO {

    private Integer editionId;
    private String description;
    private String date;

    public EditionPOJO() {

    }

    public EditionPOJO(Integer editionId, String description, String date) {
        this.editionId = editionId;
        this.description = description;
        this.date = date;
    }

    public Integer getEditionId() {
        return editionId;
    }

    public void setEditionId(Integer editionId) {
        this.editionId = editionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}