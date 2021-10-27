package com.epam.gyopos.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
        throw new UnfinishedException("not implemented yet");
    }

    @PostMapping(value = "/car")
    public ResponseEntity<Car> add(@RequestBody Car car) {
        throw new UnfinishedException("not implemented yet");
    }

    @DeleteMapping(value = "/car/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") long id) {
        throw new UnfinishedException("not implemented yet");
    }

    @PostMapping(value = "/car/rent")
    public ResponseEntity<Car> rent(@RequestBody Car car) {
        throw new UnfinishedException("not implemented yet");
    }

    @DeleteMapping(value = "/car/rent/{id}")
    public ResponseEntity<Long> giveBack(@PathVariable("id") long id) {
        throw new UnfinishedException("not implemented yet");
    }

    //delete later, only for dummytesting
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public class UnfinishedException extends RuntimeException {

        public UnfinishedException(String message) {
            super(message);
        }
    }

}
