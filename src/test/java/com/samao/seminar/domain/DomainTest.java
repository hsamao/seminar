package com.samao.seminar.domain;

import com.samao.seminar.service.SeminarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by hsamao on 10/1/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations ={"/service-config.xml"})

@Transactional
public class DomainTest {
    @Autowired
    private SeminarService seminarService;

    @Test
    @Rollback(false)
    public void testSeminar () {seminarService.addSeminar(new Seminar());}
}
