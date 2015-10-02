package com.samao.seminar.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by hsamao on 10/1/15.
 */
public class Seminar implements Serializable {
    private Long id;
    private String name;
    private Date start;

    Set<SeminarEvent> seminarEventSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Set<SeminarEvent> getSeminarEventSet() {
        return seminarEventSet;
    }

    public void setSeminarEventSet(Set<SeminarEvent> seminarEventSet) {
        this.seminarEventSet = seminarEventSet;
    }
}
