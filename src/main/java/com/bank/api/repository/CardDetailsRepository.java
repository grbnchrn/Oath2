package com.bank.api.repository;


import com.bank.api.dao.CardDetailsDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardDetailsRepository extends CrudRepository<CardDetailsDao, Long> {
    List<CardDetailsDao> findByName(String username);
}
