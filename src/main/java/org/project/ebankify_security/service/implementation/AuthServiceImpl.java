package org.project.ebankify_security.service.implementation;

import lombok.RequiredArgsConstructor;
import org.project.ebankify_security.dao.UserDAO;
import org.project.ebankify_security.dto.AuthDTO;
import org.project.ebankify_security.service.AuthService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserDAO dao;

    @Override
    public void login(AuthDTO authDTO) {

    }

    @Override
    public void register(AuthDTO authDTO) {

    }
}