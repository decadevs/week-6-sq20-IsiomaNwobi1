package models;

import enums.Role;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter

public class User {

    private String name;
    private Role role;
    private int userPriority;

    public User(String name, Role role, int userPriority) {
        this.name = name;
        this.role = role;
        this.userPriority =userPriority;
    }
}
