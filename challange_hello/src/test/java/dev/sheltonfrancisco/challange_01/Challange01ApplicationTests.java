package dev.sheltonfrancisco.challange_01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
class Challange01ApplicationTests {

	@Autowired

	private MockMvc mockMvc;

	@Test
	void test_shouldSayHello() throws Exception {
		mockMvc.perform(get("/api/hello"))
				.andExpect(jsonPath("$.message").exists())
				.andExpect(jsonPath("$.message").value("Olá, Mundo!"));
	}

}
