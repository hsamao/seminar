package com.samao.seminar.service;

import com.samao.seminar.domain.Seminar;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hsamao on 10/1/15.
 */

@Component
@Transactional
public class SeminarService {

    @Autowired
    private SessionFactory sessionFactory;

    public void addSeminar (Seminar seminar) {

    }
}
