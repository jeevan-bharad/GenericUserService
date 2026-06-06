package com.jj.genericuserservice.service;

import com.jj.genericuserservice.Beans.Users;
import com.jj.genericuserservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> findAllUsers() {
        return this.userRepository.findAll();
    }

    public Users saveUsers(Users user) {
        return  this.userRepository.save(user);
    }

    public void deleteUser(int id) {
        Users user = this.userRepository.findById(id).orElse(new Users());
        this.userRepository.delete(user);
    }

    public Users finduserbyid(int id) {
        return this.userRepository.findById(id).get();
    }

}
