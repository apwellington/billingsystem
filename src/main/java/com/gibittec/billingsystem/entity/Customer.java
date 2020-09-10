package com.gibittec.billingsystem.entity;

import com.gibittec.billingsystem.auxiliar.Status;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastName;
    private String email;

    @OneToOne
    private Address address;

    @OneToMany
    private List<PhoneNumber> phones;

    @OneToOne
    private User user;

    private Status status;
    private Date createAt;


}
