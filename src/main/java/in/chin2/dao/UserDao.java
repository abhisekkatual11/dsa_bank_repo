package in.chin2.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}
	
	public void saveRecord() {
		System.out.println("Now ecord Saved Successfully");
	}
}
