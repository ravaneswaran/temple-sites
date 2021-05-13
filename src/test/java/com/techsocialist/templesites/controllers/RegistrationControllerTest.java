package com.techsocialist.templesites.controllers;

import com.techsocialist.templesites.AbstractTempleSitesTest;
import com.techsocialist.templesites.controllers.mvc.RegistrationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class RegistrationControllerTest extends AbstractTempleSitesTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void registerSiteAdminTest() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders
                .post("/registration/site-admin")
                .accept(MediaType.TEXT_HTML))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
