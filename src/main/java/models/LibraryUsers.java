package models;

import enums.Role;

public class LibraryUsers {

    private String name;
    private Role role;

    public LibraryUsers(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }
}
