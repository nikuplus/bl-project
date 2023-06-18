package com.example.infrastructure.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mytable")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MytableEntity {
    @Id
    private Integer id;
    private String name;
}
