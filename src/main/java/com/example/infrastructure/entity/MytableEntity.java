package com.example.infrastructure.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Entity
@Table(name = "mytable")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MytableEntity {
  @Id private Integer id;
  private String name;
}
