package com.practice.makerChecker.Repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MakerRepositoryImpl implements MakerRepository {

    @PersistenceContext
    private EntityManager entityManager;

}
