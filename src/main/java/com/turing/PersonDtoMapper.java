package com.turing;

import java.util.UUID;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PersonDtoMapper {
  @Mapping(
      source = "correlationId",
      target = "correlationId",
      defaultExpression = "java(UUID.randomUUID())")
  CreateNewPersonRequest toRequest(final PersonDto person, final UUID correlationId);
}
