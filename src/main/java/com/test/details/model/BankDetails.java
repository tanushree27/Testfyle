package com.test.details.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "bankdetails") @Getter @Setter
public class BankDetails{

    @Id
    private String ifsc;

    @Column(name = "bank_id")
    private String bankId;

    @Column
    private String branch;
    private String address;
    private String city;
    private String state;
    private String district;

    @Column(name = "bank_name")
    private String bankname;
}
