package com.demo.migration.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Builder
public class HelloDto {

    private String name;
    private String message;
    private OffsetDateTime dateTime;
}
