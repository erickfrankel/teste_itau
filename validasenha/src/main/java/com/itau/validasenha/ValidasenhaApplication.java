package com.itau.validasenha;

import com.itau.validasenha.entrypoint.controller.PasswordValidatorController;
import com.itau.validasenha.infrastructure.PasswordValidatorImpl;
import com.itau.validasenha.usecase.PasswordValidationUseCase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidasenhaApplication {

	public static void main(String[] args) {
		PasswordValidatorImpl passwordValidator = new PasswordValidatorImpl();
		PasswordValidationUseCase passwordValidationUseCase = new PasswordValidationUseCase(passwordValidator);
		PasswordValidatorController passwordValidatorController = new PasswordValidatorController(passwordValidationUseCase);

		passwordValidatorController.validatePassword();
	}
}
