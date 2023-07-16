package com.project.dutch.services;

import com.project.dutch.entity.NewGroup;
import com.project.dutch.repository.NewGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserGroupService {

    @Autowired
    private NewGroupRepository newGroupRepository;
    public NewGroup crateGroup(NewGroup newGroup){

        newGroupRepository.save(newGroup);
        return newGroup;


    }
}
