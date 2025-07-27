package dev.scastillo.identity.role.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "roles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "title", length = 50, nullable = false, unique = true)
    private String title;

    @Column(name = "description", length = 255, nullable = true)
    private String description;

}
