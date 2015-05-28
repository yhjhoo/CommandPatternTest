package com.prince.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prince.*;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={
//	"classpath*:Spring/Spring_*.xml"
//	})
public class PersonCommandTest {
//	@Autowired
//	private PersonCommand personCommand;

//	@Test
	public static void main(String[] arg) throws InterruptedException {
		PersonCommand personCommand = new PersonCommand();
		PersonService personService = new PersonService();
		for(int i=0; i<2; i++){
			System.out.println("Main" + i);
			MultiThread m = new MultiThread("T" + i, personCommand, personService);
//			m.run();
			m.start();
			Thread.sleep(500);
		}
	}

}
