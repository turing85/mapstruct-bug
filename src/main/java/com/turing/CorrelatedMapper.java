package com.turing;

import java.util.UUID;
import org.mapstruct.Mapping;

public interface CorrelatedMapper<T extends Correlated, U> {
  @Mapping(
      target = "correlationId",
      expression = "java(Optional.ofNullable(correlationId).orElseGet(UUID::randomUUID))")
  T map(final U u, final UUID correlationId);
}