package com.training.org.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.training.org.entities.User;

 
@Repository
public interface  UserRepository extends JpaRepository<User, Long> {

	 
}
