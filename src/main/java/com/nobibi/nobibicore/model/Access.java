package com.nobibi.nobibicore.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "access")
@Data
public class Access {

    @Id
    private String access_id;

    @Column(nullable = false)
    @NotNull
    private String access_name;

    @Column(nullable = false)
    @NotNull
    private String access_url;

    @Column(nullable = false)
    @NotNull
    private boolean access_access;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(name = "dept_access",
            joinColumns = {@JoinColumn(name = "access_id")},
            inverseJoinColumns = {@JoinColumn(name = "dept_id")})
    private List<Dept> deptList;
}
