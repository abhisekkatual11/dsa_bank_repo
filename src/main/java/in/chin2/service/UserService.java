package in.chin2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.chin2.dao.UserDao;
import in.chin2.utils.EmailUtils;
import in.chin2.utils.PwdUtils;

@Service
public class UserService {
	
	public UserService() {
		System.out.println("UserService :: Constructor");
	}
	
	private PwdUtils pwdUtils;
	private UserDao userDao;
	private EmailUtils emailUtils;
	
	@Autowired
	public void setPwdUtils(PwdUtils pwdUtils) {
		this.pwdUtils = pwdUtils;
	}
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Autowired
	public void setEmailUtils(EmailUtils emailUtils) {
		this.emailUtils = emailUtils;
	}
	
	public void busniessLogic() {
		pwdUtils.generatePwd();
		userDao.saveRecord();
		emailUtils.sendEmail();
	}
}
