package com.turing;

public class PersonDto {
  private final String name;
  private final String email;

  public PersonDto(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}
