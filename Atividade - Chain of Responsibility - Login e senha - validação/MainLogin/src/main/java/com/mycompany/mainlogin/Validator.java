/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainlogin;

import java.util.Set;
import java.util.function.Predicate;

/**
 *
 * @author 55649
 */
public class Validator {

    private final Set<String> registeredLogins;
    private final Predicate<String> isRegisteredLogin;
    private final Predicate<String> hasUppercase;
    private final Predicate<String> hasLowercase;
    private final Predicate<String> hasSpecialCharacter;
    private final Predicate<String> hasNumber;
    private final Predicate<String> hasNoConsecutiveNumbers;
    private final Predicate<String> hasMinLength;
    private final Predicate<String> hasMaxLength;

    public Validator(Set<String> registeredLogins) {
        this.registeredLogins = registeredLogins;
        this.isRegisteredLogin = registeredLogins::contains;
        this.hasUppercase = s -> s.chars().anyMatch(Character::isUpperCase);
        this.hasLowercase = s -> s.chars().anyMatch(Character::isLowerCase);
        this.hasSpecialCharacter = s -> s.chars().anyMatch(ch -> "!@#$%^&*()_+[]{}|;:,.<>?".indexOf(ch) >= 0);
        this.hasNumber = s -> s.chars().anyMatch(Character::isDigit);
        this.hasNoConsecutiveNumbers = s -> !s.matches(".*\\d{3}.*");
        this.hasMinLength = s -> s.length() >= 8;
        this.hasMaxLength = s -> s.length() <= 16;
    }

    public String validateLogin(String login) {
        if (!isRegisteredLogin.test(login)) {
            return "Usuario nao cadastrado.";
        }
        return null;
    }

    public String validatePassword(String password) {
        if (!hasUppercase.test(password)) {
            return "A senha deve conter pelo menos uma letra maiuscula.";
        }
        if (!hasLowercase.test(password)) {
            return "A senha deve conter pelo menos uma letra minuscula.";
        }
        if (!hasSpecialCharacter.test(password)) {
            return "A senha deve conter pelo menos um caractere especial.";
        }
        if (!hasNumber.test(password)) {
            return "A senha deve conter pelo menos um numero.";
        }
        if (!hasNoConsecutiveNumbers.test(password)) {
            return "A senha nao deve conter três ou mais numeros consecutivos.";
        }
        if (!hasMinLength.test(password)) {
            return "A senha deve ter pelo menos 8 caracteres.";
        }
        if (!hasMaxLength.test(password)) {
            return "A senha nao deve ter mais de 16 caracteres.";
        }
        return null;
    }
}
