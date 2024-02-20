package com.training.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.training.org.VO.Department;
import com.training.org.VO.ResponseTemplateVO;
import com.training.org.VO.Technology;
import com.training.org.entities.User;
import com.training.org.repositories.UserRepository;

import lombok.extern.slf4j.Slf4j;

	@Service
	@Slf4j
	public class UserService {

	    @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private RestTemplate restTemplate;

	    public User saveUser(User user) {
	        log.info("Inside saveUser of UserService");
	        return userRepository.save(user);
	    }

	    public ResponseTemplateVO getUserWithDepartment(Long userId) {
	        log.info("Inside getUserWithDepartment of UserService");
	        ResponseTemplateVO vo = new ResponseTemplateVO();
	        User user = userRepository.findById(userId).get();

	        Department department =
	                restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId()
	                        ,Department.class);

//	        List<Technology> technologies =
//	                restTemplate.getForObject("http://localhost:9003/technologies/getAllTech/" + user.getTechnologyIdList()
//			        ,List.class);
	        
	        vo.setUser(user);
	        vo.setDepartment(department);
//	        vo.setTechnologies(technologies);

	        return  vo;
	    }


	}
