package com.nobibi.nobibicore.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Demo {
    @Id
    private String id;

    private String name;
}
