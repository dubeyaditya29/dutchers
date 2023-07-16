package com.project.dutch.controllers;

import com.project.dutch.entity.NewGroup;
import com.project.dutch.models.ApiResponse;
import com.project.dutch.services.CreateUserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.project.dutch.constants.Constants.BASE_URL;

@RestController
@RequestMapping(BASE_URL)
public class RestApiController {

    @Autowired
    private CreateUserGroupService createUserGroupService;

    public ApiResponse crateGroup(@RequestBody NewGroup newGroup){
        createUserGroupService.crateGroup(newGroup);
        return ApiResponse.builder().message("user group created!").build();
    }
}
