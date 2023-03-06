package com.mmg.moremagic.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    //TODO How to let the DB decide on Id?
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
