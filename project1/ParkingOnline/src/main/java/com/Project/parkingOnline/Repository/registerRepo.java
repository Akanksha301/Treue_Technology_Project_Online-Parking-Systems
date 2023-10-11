package com.Project.parkingOnline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.parkingOnline.Entity.RegisterUser;


@Repository
public interface registerRepo extends JpaRepository<RegisterUser ,String> {

}
