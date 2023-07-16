package com.project.dutch.entity;


import com.project.dutch.models.KindOfGroup;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(value = "newGroup")
public class NewGroup {

    @Id
    private Integer newGroupID;
    private String newGroupName;
    private KindOfGroup newGroupType;
}
