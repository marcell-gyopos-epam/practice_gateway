package com.epam.gyopos.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.epam.gyopos.domain.Car;
import com.epam.gyopos.rest.controller.CarController;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * @author Marcell Gyöpös
 */

@WebMvcTest(CarController.class)
public class CarControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetCarList() throws Exception {

        mvc.perform(get("/api/v1/cars")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(result -> assertTrue(result.getResolvedException() instanceof CarController.UnfinishedException));

    }

    @Test
    public void testAdd() throws Exception{
        Car exceptionParam = new Car();

        mvc.perform(post("/api/v1/car")
            .content(objectMapper.writeValueAsString(exceptionParam))
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(result -> assertTrue(result.getResolvedException() instanceof CarController.UnfinishedException));
    }

    @Test
    public void testDelete() throws Exception{
        long exceptionParam = 1;
        mvc.perform(delete("/api/v1/car/{id}", exceptionParam)
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(result -> assertTrue(result.getResolvedException() instanceof CarController.UnfinishedException));
    }

    @Test
    public void testRent() throws Exception{
        Car exceptionParam = new Car();

        mvc.perform(post("/api/v1/car/rent", exceptionParam)
            .content(objectMapper.writeValueAsString(exceptionParam))
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(result -> assertTrue(result.getResolvedException() instanceof CarController.UnfinishedException));
    }

    @Test
    public void testGiveBack() throws Exception{
        long exceptionParam = 1;
        mvc.perform(delete("/api/v1/car/rent/{id}", exceptionParam)
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(result -> assertTrue(result.getResolvedException() instanceof CarController.UnfinishedException));
    }
}
