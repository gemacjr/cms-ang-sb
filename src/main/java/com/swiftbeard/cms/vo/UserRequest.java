package com.swiftbeard.cms.vo;

import com.swiftbeard.cms.models.Role;



public class UserRequest {

    private String identity;

    private String name;

    private Role role;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
