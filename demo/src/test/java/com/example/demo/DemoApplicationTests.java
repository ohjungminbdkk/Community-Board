package com.example.demo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo1ApplicationTests {

	@Value("${property.test.name}")
	private String propertyTestName;
	
	@Value("${propertyTest")
	private String propertyTest;
	
	@Value("$nokey:defalutValue")
	private String defaultVaelu;

	
	@Value("${propertyTestList")
	private String[] propertyTestArray;
	
	@Value("#{'${propertyTestList'.split(',')}")
	private List<String> propertyTestList;
	
	@Test
	void contextLoads() {
		
		assertThat(propertyTestName, is("property depth test"));
		
		
	}
}