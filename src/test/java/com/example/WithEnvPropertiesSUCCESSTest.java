package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.test.annotation.DirtiesContext.ClassMode.AFTER_CLASS;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest({"SERVICES[dev]_NAME=a name"})
@DirtiesContext
public class WithEnvPropertiesSUCCESSTest {

	@Autowired
	ServiceProperties serviceProperties;

	@Test
	public void contextLoads() {
		Assert.assertEquals("a name",serviceProperties.getServices().get("dev").getName());
	}

}
