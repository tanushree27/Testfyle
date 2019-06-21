package com.test.details.security;

import com.test.details.model.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private ApplicationUser applicationUser;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        applicationUser = new ApplicationUser();
        if (!applicationUser.getUsername().equals(username)) {
            throw new UsernameNotFoundException(username);
        }
        return new User(applicationUser.getUsername(), bCryptPasswordEncoder.encode(applicationUser.getPassword()), emptyList());
    }
}