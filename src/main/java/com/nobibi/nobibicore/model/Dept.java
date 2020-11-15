package com.nobibi.nobibicore.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "dept")
@Data
public class Dept {

    @Id
    private String dept_id;

    @Column(nullable = false)
    @NotNull
    private String dept_name;

    @Column(nullable = false)
    @NotNull
    private String dept_owner;

    @Column(nullable = false)
    @NotNull
    private String dept_parent; // "0" for root, dept id for it's parent dept

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(name = "user_dept",
            joinColumns = {@JoinColumn(name = "dept_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private List<User> userList;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(name = "dept_access",
            joinColumns = {@JoinColumn(name = "dept_id")},
            inverseJoinColumns = {@JoinColumn(name = "access_id")})
    private List<Access> accessList;
}
