package com.samao.seminar.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hsamao on 10/1/15.
 */
public class SeminarEvent implements Serializable{
    private Long id;
    private Seminar seminar;
    private Date startDate;
    private Date endDate;
    private String speaker;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }
}
