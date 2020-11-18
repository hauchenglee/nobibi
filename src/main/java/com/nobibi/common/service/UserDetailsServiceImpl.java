package com.nobibi.common.service;

import com.nobibi.nobibicore.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService UserService;

    @Override
    public UserDetails loadUserByUsername(String user_uuid) throws UsernameNotFoundException {
        // TODO: change findById to findBy uuid
        // TODO: change exception log
        System.out.println(user_uuid);
        User user = UserService.findById(user_uuid)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + user_uuid));

        return UserDetailsImpl.build(user);
    }
}
