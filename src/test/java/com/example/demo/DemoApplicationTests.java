package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test1(){
		String str = "0,1";
		String[] strArray = str.split(",");
		System.out.println(strArray[0]);
	}

}
