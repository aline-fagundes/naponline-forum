package br.com.naponline.forum.controller;

import java.net.URI;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class AutenticacaoControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@org.junit.jupiter.api.Test
	public void deveriaDevolver400SeOsDadosDeAutenticacaoEstejamIncorretos() throws Exception {
		
		URI uri = new URI("/auth");
		String json = "{\"email\":\"invalido@email\",\"senha\":\"123456\"}";

		mockMvc
		.perform(
				MockMvcRequestBuilders
				.post(uri)
				.content(json)
				.contentType(MediaType.APPLICATION_JSON))
			.andExpect(MockMvcResultMatchers
					.status()
					.is(400));
	}

}
