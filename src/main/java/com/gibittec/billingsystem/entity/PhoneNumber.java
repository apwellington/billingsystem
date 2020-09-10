package com.gibittec.billingsystem.entity;

import com.gibittec.billingsystem.auxiliar.SocialNetwork;
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
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String phone;
    private String isSocialNetwork;
    private SocialNetwork socialNetwork;

    @ManyToOne
    private User createdBy;

    private Status status;
    private Date createAt;


}
