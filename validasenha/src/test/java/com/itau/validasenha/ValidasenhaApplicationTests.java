package com.itau.validasenha;

import com.itau.validasenha.infrastructure.PasswordValidatorImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ValidasenhaApplicationTests {


		private final PasswordValidatorImpl passwordValidator = new PasswordValidatorImpl();

		@Test
		void testValidPassword() {
			assertFalse(passwordValidator.isValid("Abcdef1@"));
		}

		@Test
		void testPasswordTooShort() {
			assertFalse(passwordValidator.isValid("Ab1@"));
		}

		@Test
		void testPasswordMissingDigit() {
			assertFalse(passwordValidator.isValid("Abcdef@G"));
		}

		@Test
		void testPasswordMissingUpperCase() {
			assertFalse(passwordValidator.isValid("abcdef1@"));
		}

		@Test
		void testPasswordMissingLowerCase() {
			assertFalse(passwordValidator.isValid("ABCDEF1@"));
		}

		@Test
		void testPasswordMissingSpecialCharacter() {
			assertFalse(passwordValidator.isValid("Abcdef12"));
		}

		@Test
		void testPasswordWithRepeatedCharacters() {
			assertTrue(passwordValidator.isValid("Aabcdef1@"));
		}

		@Test
		void testPasswordWithSpaces() {
			assertFalse(passwordValidator.isValid("Abc def1@"));
		}

		@Test
		void testPasswordWithNullInput() {
			assertFalse(passwordValidator.isValid(null));
		}

		@Test
		void testPasswordWithOnlySpecialCharacters() {
			assertFalse(passwordValidator.isValid("@@@@@@@@"));
		}
	}
