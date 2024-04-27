package hcl.hackathon.userservice.dto;

import hcl.hackathon.userservice.enums.Role;
import lombok.Data;

@Data
public class AuthUserDto {
    private String id;
    private String username;
    private String password;
    private Role role;
}