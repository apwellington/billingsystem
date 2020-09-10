package com.gibittec.billingsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gibittec.billingsystem.auxiliar.Status;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Status status;
    private Date createAt;
}
