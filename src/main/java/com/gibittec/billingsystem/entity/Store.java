package com.gibittec.billingsystem.entity;

import com.gibittec.billingsystem.auxiliar.Status;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String urlLogo;
    private String slogan;
    private String shortDescription;

    @OneToOne
    private Address address;

    @OneToMany(fetch = FetchType.LAZY)
    private List<PhoneNumber> phones;

    @OneToMany
    private List<User> user;

    private Date createdAt;
    private Status status;

}
