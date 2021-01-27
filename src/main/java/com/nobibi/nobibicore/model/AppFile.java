package com.nobibi.nobibicore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appfile")
@Data
public class AppFile {

    @Id
    private String appfile_id;
}
