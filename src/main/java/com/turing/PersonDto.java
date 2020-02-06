package com.turing;

import java.util.Optional;

public class PersonDto {
  private final String name;
  private final String email;

  private PersonDto(final String name, final String email) {
    this.name = Optional.ofNullable(name).orElseThrow(PersonDto::nameIsNull);
    this.email = Optional.ofNullable(email).orElseThrow(PersonDto::emailIsNull);
  }

  public static PersonDto of(final String name, final String email) {
    return new PersonDto(name, email);
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  private static IllegalArgumentException nameIsNull() {
    return new IllegalArgumentException("Name is null");
  }

  private static IllegalArgumentException emailIsNull() {
    return new IllegalArgumentException("email is null");
  }
}