package com.nobibi.common.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nobibi.nobibicore.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@NoArgsConstructor
@Data
public class UserDetailsImpl implements UserDetails {

    private String user_id;

    private String user_account;

    private String user_name;

    private String user_emial;

    @JsonIgnore
    private String user_password;

    private Collection<? extends GrantedAuthority> authorities;

    public static UserDetailsImpl build(User user) {
        List<GrantedAuthority> authorities = Collections.emptyList();

        UserDetailsImpl userDetails = new UserDetailsImpl();
        userDetails.setUser_id(user.getUser_account());
        userDetails.setUser_name(user.getUser_name());
        userDetails.setUser_emial(user.getUser_email());
        userDetails.setUser_password(user.getUser_password());
        userDetails.setAuthorities(authorities);

        return userDetails;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return user_password;
    }

    @Override
    public String getUsername() {
        return user_name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
