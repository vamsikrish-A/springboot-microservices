package com.bridgelabz.user.service;

import com.bridgelabz.user.VO.Department;
import com.bridgelabz.user.VO.ResponseTemplateVO;
import com.bridgelabz.user.entity.User;
import com.bridgelabz.user.repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside save User of User service");
        return userRepo.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside save User of User service");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepo.findByUserId(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"
                +user.getDepartmentId(), Department.class);
        vo.setUser(user);
        vo.setDepartment(department);

        return vo;


    }
}
