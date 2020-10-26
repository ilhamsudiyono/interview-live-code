package com.miniprj.interviewcode;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.miniprj.interviewcode.config.WebMvcConfig;
import com.miniprj.interviewcode.config.WebSecurityConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { WebMvcConfig.class, WebSecurityConfig.class})
class InterviewcodeApplicationTests {

	@Test
	void contextLoads() {
	}

}
