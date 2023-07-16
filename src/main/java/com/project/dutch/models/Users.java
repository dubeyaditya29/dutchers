package com.project.dutch.models;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
public class Users {
    @Id
    private Integer userID;
    private String userName;
}
