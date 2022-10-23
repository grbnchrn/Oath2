package com.bank.api.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CardDetailsDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    public String issuer;
    public String cardNumber;
    public String exp;
    public Integer cvv;
    public String name;
    public String address;
    public String country;
    public String zipcode;
}
