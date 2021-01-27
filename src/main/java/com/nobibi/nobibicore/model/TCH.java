package com.nobibi.nobibicore.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tch")
@Data
public class TCH {

    @Id
    private String tch_id;

    @Column(nullable = false)
    @NotNull
    private String tch_code;

    @Column(nullable = false)
    @NotNull
    private String tch_name;

    private String value1;

    private String value2;

    private String value3;

    private String value4;

    private String value5;

    private int tch_order_seq;

    private Date tch_expire_date;
}
