package com.example.LearnLink.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Seller_person")
@PrimaryKeyJoinColumn(name = "id")
public class Seller extends User {

    private String type;
    private Date dateOfCreate;

    public Seller(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    public Seller(String firstName, String lastName, String email, String type, Date dateOfCreate) {
        super(firstName, lastName, email);
        this.type = type;
        this.dateOfCreate = dateOfCreate;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "type='" + type + '\'' +
                ", dateOfCreate=" + dateOfCreate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Seller that = (Seller) o;
        return Objects.equals(type, that.type) && Objects.equals(dateOfCreate, that.dateOfCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, dateOfCreate);
    }

    public Seller() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(Date dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }
}
