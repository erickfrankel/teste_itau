package com.itau.validasenha.usecase;

import com.itau.validasenha.domain.PasswordValidator;

public class PasswordValidationUseCase {
    private final PasswordValidator passwordValidator;

    public PasswordValidationUseCase(PasswordValidator passwordValidator) {
        this.passwordValidator = passwordValidator;
    }

    public boolean execute(String password) {
        return passwordValidator.isValid(password);
    }
}
