package com.sts.crud.opn;

import org.springframework.data.jpa.repository.JpaRepository;
@repository

public interface UserRepo extends JpaRepository<User, integer> {
	User findById(int id);

}
