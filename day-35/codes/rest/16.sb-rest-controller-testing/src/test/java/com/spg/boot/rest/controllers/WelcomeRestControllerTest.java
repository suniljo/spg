package com.spg.boot.rest.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.spg.boot.rest.services.WelcomeService;

@WebMvcTest(value = WelcomeRestController.class)
class WelcomeRestControllerTest {
	@MockBean // to create a mock object / substitute object
	private WelcomeService service;

	@Autowired
	private MockMvc mockMvc; // used to send a request to REST API

	@Test
	void testWelcomeMsg() throws Exception{
		// define mock object behaviour
		Mockito.when(service.getWelcomeMsg()).thenReturn("Welcome");
		/*
		// prepare http get request
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");
		
		// send request 
  		ResultActions perform = mockMvc.perform(reqBuilder);

		// hold the response
		MvcResult mvcResult = perform.andReturn();
		
		// validate response
		MockHttpServletResponse response = mvcResult.getResponse();
		
		String contentAsString = response.getContentAsString();
		assertEquals("Welcome", contentAsString);
		
		int status = response.getStatus();
		assertEquals(200, status);
		*/
		
		mockMvc.perform(MockMvcRequestBuilders.get("/welcome"))
 		  		.andExpect(MockMvcResultMatchers.status().isOk());

	}

}
