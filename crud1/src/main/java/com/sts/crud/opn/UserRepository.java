package com.sts.crud.opn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, integer> {
	User findById(int id);

}

//public class UserRepository {

	//public List<Use> findAll() {
		// TODO Auto-generated method stub
		//return null;
	//}

	//public User save() {
		// TODO Auto-generated method stub
		//return null;
	//}

//}
