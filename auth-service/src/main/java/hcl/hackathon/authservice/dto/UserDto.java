package hcl.hackathon.authservice.dto;

import hcl.hackathon.authservice.enums.Role;
import lombok.Data;

@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private Role role;
}
