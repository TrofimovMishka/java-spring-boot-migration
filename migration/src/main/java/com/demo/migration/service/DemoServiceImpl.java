package com.demo.migration.service;

import com.demo.migration.dto.HelloDto;
//import org.springframework.boot.jdbc.DataSourceInitializationMode;
//import org.springframework.boot.sql.init.DataSourceInitializationMode;
import jakarta.annotation.Priority;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Priority(Integer.MAX_VALUE)
@Service
public class DemoServiceImpl implements DemoService {

    public HelloDto getInfo() {

//        DatabaseDriver gae = DatabaseDriver.GAE;
//        DataSourceInitializationMode embedded = DataSourceInitializationMode.EMBEDDED;

        return HelloDto
                .builder()
                .message("Hello from demo")
                .name("Demo name")
                .dateTime(OffsetDateTime.now())
                .build();
    }

}
