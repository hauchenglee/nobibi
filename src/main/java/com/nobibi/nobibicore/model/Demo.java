package com.nobibi.nobibicore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Demo {
    @Id
    private String id;

    private String name;
}
