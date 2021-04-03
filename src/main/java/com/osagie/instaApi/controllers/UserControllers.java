package com.osagie.instaApi.controllers;

import com.osagie.instaApi.dto.UserDto;
import com.osagie.instaApi.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by OSAGIE on 3/26/2021
 */
@RestController
@RequestMapping("/users")
public class UserControllers {

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody @Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return null;
        }
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserByUserId(@PathVariable("userId") String userId){
        return ResponseEntity.notFound().build();
    }
}
