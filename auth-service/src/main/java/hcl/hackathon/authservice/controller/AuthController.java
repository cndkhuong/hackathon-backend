package hcl.hackathon.authservice.controller;

import hcl.hackathon.authservice.dto.RegisterDto;
import hcl.hackathon.authservice.dto.TokenDto;
import hcl.hackathon.authservice.request.LoginRequest;
import hcl.hackathon.authservice.request.RegisterRequest;
import hcl.hackathon.authservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<TokenDto> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterDto> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }
}
