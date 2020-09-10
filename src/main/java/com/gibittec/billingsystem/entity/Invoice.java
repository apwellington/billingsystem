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
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private Double totalAmountWOTax;
    private Double totalAmountWTax;
    private Double totalAmountTax;
    private Integer totalImpression;
    private Status status;
    private Date createAt;

    private Long storeId;
    private Long userId;

    @OneToMany
    private List<InvoiceItem> items;
}
