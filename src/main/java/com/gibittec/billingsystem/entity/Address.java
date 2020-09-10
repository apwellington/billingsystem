package com.gibittec.billingsystem.entity;


import com.gibittec.billingsystem.auxiliar.Status;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String addressOne;
    private String addressTwo;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    @OneToMany
    private List<PhoneNumber> phones;

    private Status status;
    private Date createAt;

}
