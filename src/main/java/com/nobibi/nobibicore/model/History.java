package com.nobibi.nobibicore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "history")
@Data
public class History {

    @Id
    private String history_id;
}
