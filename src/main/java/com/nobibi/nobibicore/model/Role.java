package com.nobibi.nobibicore.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    private String role_id;

    @Column(nullable = false)
    @NotNull
    private String role_name;

    @Column(nullable = false)
    @NotNull
    private int role_level;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private List<User> userList;
}
