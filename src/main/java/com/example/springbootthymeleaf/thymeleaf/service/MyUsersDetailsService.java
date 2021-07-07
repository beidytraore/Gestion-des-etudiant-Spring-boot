package com.example.springbootthymeleaf.thymeleaf.service;

import com.example.springbootthymeleaf.thymeleaf.dao.UserRepo;
import com.example.springbootthymeleaf.thymeleaf.model.MyUserPrincipal;
import com.example.springbootthymeleaf.thymeleaf.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUsersDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Users user = userRepo.findByUsername(username);
            if(user == null || !user.isActive()) throw new UsernameNotFoundException(username);

            return new MyUserPrincipal(user);
    }
}
