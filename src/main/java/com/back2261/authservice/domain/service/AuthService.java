package com.back2261.authservice.domain.service;

import com.back2261.authservice.interfaces.request.DetailsRequest;
import com.back2261.authservice.interfaces.request.RegisterRequest;
import com.back2261.authservice.interfaces.request.UsernameRequest;
import com.back2261.authservice.interfaces.request.VerifyRequest;
import com.back2261.authservice.interfaces.response.DefaultMessageResponse;
import com.back2261.authservice.interfaces.response.RegisterResponse;

public interface AuthService {
    RegisterResponse register(RegisterRequest registerRequest);

    DefaultMessageResponse verifyCode(VerifyRequest verifyRequest);

    DefaultMessageResponse setUsername(UsernameRequest usernameRequest);

    DefaultMessageResponse details(DetailsRequest detailsRequest);
}
