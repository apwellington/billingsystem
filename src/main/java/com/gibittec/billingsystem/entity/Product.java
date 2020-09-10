package com.gibittec.billingsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gibittec.billingsystem.auxiliar.Status;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private Double price;
    private Double stock;

    private Long categoryID;

    private Status status;
    private Date createAt;

}
