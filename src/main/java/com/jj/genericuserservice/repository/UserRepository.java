package com.jj.genericuserservice.repository;

import com.jj.genericuserservice.Beans.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
}
