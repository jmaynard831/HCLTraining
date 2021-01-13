package com.phase3.phase3proj1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.controller.Redirects;
import com.dao.UserDao;

@ExtendWith(MockitoExtension.class)
class Phase3proj1ApplicationTests {

	@InjectMocks
	Redirects redirects;
	
	@Mock
	UserDao userdao;
	
	@Test
	void contextLoads() {
		MockHttpServletRequest req = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(req));
		
		
		
	}

}
