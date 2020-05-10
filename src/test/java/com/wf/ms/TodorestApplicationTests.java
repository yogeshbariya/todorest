package com.wf.ms;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wf.ms.model.Todo;

@SpringBootTest
@AutoConfigureMockMvc
class TodorestApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	
	@Test
	public void getTodos() throws Exception
	{	
		mockMvc.perform(
				MockMvcRequestBuilders.get("/todos"))
		.andExpect(status().isOk());
	}
	
	@Test
	public void createTodo() throws Exception
	{	
		
		Todo test = new Todo();
		test.setDes("Testing now");
		test.setDone(false);
		test.setTargetDate(new Date());
		test.setUser("Anil");
		
		ObjectMapper om = new ObjectMapper();
		
		mockMvc.perform(
				MockMvcRequestBuilders.post("/todos")
				.accept(MediaType.APPLICATION_JSON)
				.content(om.writeValueAsString(test)))
		.andExpect(status().isCreated());
	}
}
