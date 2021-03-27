package com.osagie.instaApi.controllers;

import com.osagie.instaApi.dto.UserDto;
import com.osagie.instaApi.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.SmartValidator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by OSAGIE on 3/26/2021
 */
@RestController
@RequestMapping("/users")
public class UserControllers {
    private SmartValidator validator;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(@RequestBody UserDto userDto, BindingResult bindingResult){
        return null;
    }

    @PostMapping
    public ResponseEntity<User> saveUser(){
        return null;
    }

    @GetMapping("{userId}")
    public ResponseEntity<User> getUserByUserId(@PathVariable("userId") String userId){
        return null;
    }
}
