package com.gibittec.billingsystem.entity;

import com.gibittec.billingsystem.auxiliar.Status;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastName;
    private String email;
    private String username;
    private String password;

    @OneToMany
    private List<PhoneNumber> phones;

    @OneToOne
    private Address address;

    private Status status;

    @ManyToOne
    private BankAccountNumber bankAccountNumber;

}
