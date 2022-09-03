package com.example.apache.entities;

import javax.persistence.*;

@Entity
@Table(name = "RoleName")
public class RoleName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RoleName")
    private String RoleName;

    public RoleName(Long id, String roleName) {
        this.id = id;
        RoleName = roleName;
    }

    public RoleName() {

    }

    public Long getId() {
        return id;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }
}
