package com.nobibi.nobibicore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
@Data
public class Project {

    @Id
    private String project_id;
}
