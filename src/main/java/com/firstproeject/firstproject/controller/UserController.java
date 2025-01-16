package com.firstproeject.firstproject.controller;

import com.firstproeject.firstproject.dto.UserDTO;
import com.firstproeject.firstproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<UserDTO> getUser(){
        return userService.getUser();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.userSave(userDTO);
    }


    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);

    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserByUserId/{userId}")
    public UserDTO getUserByUserID(@PathVariable String userId){
        return userService.getUserByUserId(userId);
    }

    @GetMapping("/getUserByIDAndEmail/{userId}/{email}")
    public UserDTO getUserBYUserIDAndEmail(@PathVariable String userId, @PathVariable String email){
        System.out.println(userId+" "+email);
        return userService.getUserByIDAndEmail(userId, email);
    }

}
