package com.project.dutch.models;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
@Builder
public class NewGroup {

    @Id
    private Integer newGroupID;
    private String newGroupName;
    private KindOfGroup newGroupType;
}
