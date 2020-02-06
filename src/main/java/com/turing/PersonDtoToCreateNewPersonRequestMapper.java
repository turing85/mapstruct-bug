package com.turing;

import java.util.Optional;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(imports = {Optional.class},
    implementationPackage = "<PACKAGE_NAME>.impl",
    unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface PersonDtoToCreateNewPersonRequestMapper extends
    CorrelatedMapper<CreateNewPersonRequest, PersonDto> {
}