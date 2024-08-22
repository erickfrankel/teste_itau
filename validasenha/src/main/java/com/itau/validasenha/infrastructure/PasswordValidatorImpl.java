package com.itau.validasenha.infrastructure;

import com.itau.validasenha.domain.PasswordValidator;

import java.util.HashSet;

public class PasswordValidatorImpl implements PasswordValidator {

    @Override
    public boolean isValid(String password) {
        if (password == null || password.length() < 9) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;

        HashSet<Object> uniqueChars = new HashSet<>();

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) hasDigit = true;
            else if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (!Character.isWhitespace(ch)) hasSpecial = true;

            if (!Character.isWhitespace(ch)) {
                if (!uniqueChars.add(ch)) {
                    return false;
                }
            }
        }

        return hasDigit && hasUpper && hasLower && hasSpecial;
    }
}
