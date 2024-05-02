package org.example.backend.security;

import com.nimbusds.jose.proc.SecurityContext;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @GetMapping("/me")
    public String getMe(@AuthenticationPrincipal OAuth2User user) {
        return user.getName();
    }
    @GetMapping("/me2")
    public String getMe(){
        return SecurityContextHolder.getContext().getAuthentication().toString();
    }
}

