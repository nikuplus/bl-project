package com.example.application.resource;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
  private String name;
  private String age;
  private String sex;
}
