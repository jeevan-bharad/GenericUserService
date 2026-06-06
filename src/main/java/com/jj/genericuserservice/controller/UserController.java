package com.jj.genericuserservice.controller;

import com.jj.genericuserservice.Beans.Users;
import com.jj.genericuserservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService  userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Users> getAllStudent(){
        return this.userService.findAllUsers();
    }

    @PostMapping
    public Users createStudent( @RequestBody Users user){

        System.out.println("User created");
        return this.userService.saveUsers(user);
    }

    @PutMapping
    public Users updateStudent(@RequestBody Users user){
        return this.userService.saveUsers(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id)
    {
        this.userService.deleteUser(id);
    }

    @GetMapping("/{id}")
    public Users GetUsersById(@PathVariable int id)
    {
        return  this.userService.finduserbyid(id);
    }

}

