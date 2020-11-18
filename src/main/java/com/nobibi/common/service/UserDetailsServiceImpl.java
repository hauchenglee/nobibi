package com.nobibi.common.service;

import com.nobibi.nobibicore.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService UserService;

    @Override
    public UserDetails loadUserByUsername(String user_uuid) throws UsernameNotFoundException {
        // TODO: change findById to findBy uuid
        // TODO: change exception log
        // TODO: fix get user by dao
//        log.info("loadUserByUsername user_uuid: " + user_uuid);
//        User user = UserService.findById(user_uuid)
//                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + user_uuid));
//        return UserDetailsImpl.build(user);

        // test authenticate
        if (true) {
            return new org.springframework.security.core.userdetails.User("test", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + user_uuid);
        }
    }
}
