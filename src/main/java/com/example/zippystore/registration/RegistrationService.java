package com.example.zippystore.registration;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String register(RegistrationRequest request) {
        return "works";
    }
}
