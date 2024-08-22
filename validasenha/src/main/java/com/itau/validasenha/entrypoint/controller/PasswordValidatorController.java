package com.itau.validasenha.entrypoint.controller;

import com.itau.validasenha.usecase.PasswordValidationUseCase;

import java.util.Scanner;

public class PasswordValidatorController {

    private final PasswordValidationUseCase passwordValidationUseCase;

    public PasswordValidatorController(PasswordValidationUseCase passwordValidationUseCase) {
        this.passwordValidationUseCase = passwordValidationUseCase;
    }

    public void validatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        boolean isValid = passwordValidationUseCase.execute(password);
        System.out.println("Password valid: " + isValid);
    }
}
