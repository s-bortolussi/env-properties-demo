package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest({"services.dev.name=a name"})
@DirtiesContext
public class WithSpringPropertiesTest {

	@Autowired
	ServiceProperties serviceProperties;

	@Test
	public void contextLoads() {
		Assert.assertEquals("a name",serviceProperties.getServices().get("dev").getName());
	}

}
