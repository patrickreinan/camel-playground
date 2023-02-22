package com.patrickreinan;

import java.util.Date;

public class TransformationResult {
    private Date datetime;
    private String value;

    public TransformationResult( String value) {
        this.datetime = new Date();
        this.value = value;
    }


    public Date getDatetime() {
        return datetime;
    }


    public String getValue() {
        return value;
    }

}
