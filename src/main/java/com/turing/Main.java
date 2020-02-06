package com.turing;

import org.mapstruct.factory.Mappers;

public class Main {
  public static void main(final String... args) {
    final PersonDto personDto = new PersonDto("Alice", "alice@wonder.land");
    final PersonDtoMapper mapper = Mappers.getMapper(PersonDtoMapper.class);
    final CreateNewPersonRequest request = mapper.toRequest(personDto, null);
    System.out.println(request.getCorrelationId());
  }
}
