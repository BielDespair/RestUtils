package com.leonel.RestUtils.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name = "roles")
@Entity
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;
    private String name;

    @Override
    public String toString() {
        return "Role [role_id=" + role_id + ", name=" + name + "]";
    }
}