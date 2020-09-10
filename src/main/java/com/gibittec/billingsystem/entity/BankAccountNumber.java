package com.gibittec.billingsystem.entity;

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
public class BankAccountNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String bank;
    private String number;
    private String decription;

    @OneToOne
    private User createdBy;

    private Status status;
    private Date createAt;

}
