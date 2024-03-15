package in.chin2.utils;

import org.springframework.stereotype.Component;

@Component
public class PwdUtils {
	
	public PwdUtils() {
		System.out.println("PwdUtls :: Constructor");
	}
	
	public void generatePwd() {
		System.out.println("Start with encrypted Pwd");
	}
}
