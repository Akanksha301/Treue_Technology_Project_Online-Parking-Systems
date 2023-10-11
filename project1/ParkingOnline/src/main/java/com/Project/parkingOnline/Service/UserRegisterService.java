package com.Project.parkingOnline.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.parkingOnline.Entity.RegisterUser;
import com.Project.parkingOnline.Repository.registerRepo;

@Service
public class UserRegisterService implements RegisterService{

	@Autowired
	private registerRepo rep ;
	
	@Override
	public void register(RegisterUser user) {
		// TODO Auto-generated method stub
		rep.save(user);
	}

}
