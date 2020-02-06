package com.turing;

import org.mapstruct.factory.Mappers;

public class Main {
  public static void main(final String... args) {
    for (int i = 0; i < 10; ++i) {
      final PersonDto personDto = PersonDto.of("Alice", "alice@wonder.land");
      final PersonDtoToCreateNewPersonRequestMapper mapper = Mappers.getMapper(PersonDtoToCreateNewPersonRequestMapper.class);
      final CreateNewPersonRequest request = mapper.map(personDto, null);
      System.out.println(request.getCorrelationId());
    }
  }
}