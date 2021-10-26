package com.epam.gyopos.rest.controller;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.gyopos.domain.Car;

/**
 * @author Marcell Gyöpös
 */

@RestController
@RequestMapping("/api/v1/")
public class CarController {

    @GetMapping(value = "/cars")
    public ResponseEntity<List<Car>> getCarList() {
        return null;
    }

    @PostMapping(value = "/car")
    public ResponseEntity<Car> add(@RequestBody Car car) {
       return null;
    }

    @DeleteMapping(value = "/car/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") long id) {
        return null;
    }

    @PostMapping(value = "/car/rent")
    public ResponseEntity<Car> rent(@RequestBody Car car) {
        return null;
    }

    @DeleteMapping(value = "/car/rent/{id}")
    public ResponseEntity<Long> giveBack(@PathVariable("id") long id) {
        return null;
    }
}
