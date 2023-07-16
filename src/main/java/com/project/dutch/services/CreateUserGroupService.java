package com.project.dutch.services;

import com.project.dutch.entity.NewGroup;
import com.project.dutch.repository.NewGroupRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserGroupService {

    private static final Logger logger = LogManager.getLogger(CreateUserGroupService.class);
    @Autowired
    private NewGroupRepository newGroupRepository;
    public NewGroup crateGroup(NewGroup newGroup){
        logger.info("new Group details before saving.."+newGroup);
        newGroupRepository.save(newGroup);

        return newGroup;


    }
}
