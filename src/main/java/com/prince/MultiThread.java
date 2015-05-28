package com.prince;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultiThread extends Thread {
//	ApplicationContext ctx = new ClassPathXmlApplicationContext( "Spring/Spring_*.xml");
//	private PersonCommand personCommand = (PersonCommand) ctx.getBean("personCommand");
	private String threadName;
	private PersonCommand personCommand;
	private PersonService personService;
	
	public MultiThread(String threadName,PersonCommand personCommand, PersonService personService) {
		this.threadName = threadName;
		this.personCommand = personCommand;
		this.personService = personService;
	}
	
	
//	public void run() {
//		System.out.println(personCommand.hashCode());
//		for(int i=0; i < 10; i++){
//			personCommand.setName("" + i);
//			personCommand.execute();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			String result = personCommand.getDesc();
//			if(!result.equals("" + i + "-desc")){
//				System.out.println("============================");
//			}
//			
//			System.out.println(threadName + " - " + i);
//		}
//		
//	}
	
	
	
	public void run() {
		System.out.println(personCommand.hashCode());
		for(int i=0; i < 10; i++){
			String result = personService.getDesc("" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(!result.equals("" + i + "-desc")){
				System.out.println("============================");
			}
			System.out.println(threadName + " - " + i);
		}
	}

}
