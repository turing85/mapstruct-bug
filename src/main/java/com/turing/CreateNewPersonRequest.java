package com.turing;

import java.util.Objects;
import java.util.UUID;

public class CreateNewPersonRequest {
  private final String name;
  private final String email;
  private final UUID correlationId;

  public CreateNewPersonRequest(String name, String email, UUID correlationId) {
    this.name = name;
    this.email = email;
    this.correlationId = correlationId;
  }

  public static Builder builder() {
    return new Builder();
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public UUID getCorrelationId() {
    return correlationId;
  }

  public static class Builder {
    private String name;
    private String email;
    private UUID correlationId;

    public String getName() {
      return name;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public String getEmail() {
      return email;
    }

    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    public UUID getCorrelationId() {
      if (Objects.isNull(correlationId)) {
        correlationId = UUID.randomUUID();
      }
      return correlationId;
    }

    public Builder setCorrelationId(UUID correlationId) {
      this.correlationId = correlationId;
      return this;
    }

    public CreateNewPersonRequest build() {
      return new CreateNewPersonRequest(getName(), getEmail(), getCorrelationId());
    }
  }

}
