package com.bank.api.controller;

import com.bank.api.dao.CardDetailsDao;
import com.bank.api.repository.CardDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    CardDetailsRepository cardDetailsRepository;
    @GetMapping("/{userName}")
    public List<CardDetailsDao> getAccountDetails(@PathVariable String userName){
        return cardDetailsRepository.findByName(userName);
    }
}
