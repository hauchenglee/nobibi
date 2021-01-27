package com.nobibi.nobibicore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "project_child")
@Data
public class ProjectChild {

    @Id
    private String project_child_id;

    private String project_child_title;

    private String project_child_content;

    private String image_url;

    private String doc_url;

    private Date create_date;

    private Date update_date;
}
