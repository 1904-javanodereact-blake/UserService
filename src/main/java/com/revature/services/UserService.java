package com.revature.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.revature.models.User;

@Service
public interface UserService {
	//
	 public Page<User> findAll(Pageable pageable);
	//
	 public User findOneById(int id);
	//
	 public List<User> findAllByCohortId(int id);
	//
	 public User saveUser(User u);
	//
	 public User updateProfile(User u);
	//
	 public User findOneByEmail(String email);
	//
	 public Page<User> findUserByPartialEmail(String email, Pageable pageable);
	//
	 public Page<User> findListByEmail(List<String> emailList, Pageable pageable);
  
	//
	// public CohortUserListOutputDto saveUsers(UserListInputDto userList, int id)
	// throws IOException;
}
