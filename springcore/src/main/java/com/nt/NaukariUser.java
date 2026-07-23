package com.nt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class NaukariService{
	public String uploadYourResume(String Resume) {
		return "Resume uploaded successfully";
		
	}
	public boolean isHiring() {
		return true;
	}
	public String HRMail() {
		if(isHiring()) {
			return "abc@123alphabeta.com";
		}else {
			return "return will connect you sortly";
		}
	}
}
class NaukariApp {

    private NaukariService ref;

    public void setRef(NaukariService ref) {
        this.ref = ref;
    }

    public String uploadYourResume(String resume) {
        System.out.println(ref.uploadYourResume(resume));
        return ref.HRMail();
    }
}
	/*
	public String uploadResume(String resume) {
		return super.uploadResume(resume);
	}
	@Override
	public boolean isHiring() {
		return true;
	}
	@Override
	public String HRMail() {
		if(isHiring()) {
			return "abc@123alphabeta.com";
	}
		else {
			return "We will connect you sortly";
		}
	*/
	
	

public class NaukariUser {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx =
			    new ClassPathXmlApplicationContext("applicationContext.xml");

			NaukariApp app = ctx.getBean("app", NaukariApp.class);

			System.out.println(app.uploadYourResume("Resume"));
	}

}
