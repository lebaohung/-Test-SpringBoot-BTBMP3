package com.codegym.btb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    private Long idRoles;

    private String role;

    public Role() {
    }

    public Role(Long idRoles, String role) {
        this.idRoles = idRoles;
        this.role = role;
    }

    public Long getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(Long idRoles) {
        this.idRoles = idRoles;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
