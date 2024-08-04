/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainlogin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author 55649
 */
public class MainLogin {

    public static void main(String[] args) {
        Set<String> registeredLogins = new HashSet<>(Arrays.asList("nsaraujo", "nsaraujo2", "nsaraujo3", "nsaraujo4"));
        Validator validator = new Validator(registeredLogins);

        String login = "nsaraujo";
        String password = "Tlx@10akllklklkl";

        String loginError = validator.validateLogin(login);
        String passwordError = validator.validatePassword(password);

        if (loginError != null) {
            System.out.println("Erro: " + loginError);
        } else if (passwordError != null) {
            System.out.println("Erro: " + passwordError);
        } else {
            System.out.println("Login e senha validos.");
        }

        System.out.println("-----------------------------------------------------------------------------------------------");

        String login2 = "nsaraujo0";
        String password2 = "Ylx@10akl";

        loginError = validator.validateLogin(login2);
        passwordError = validator.validatePassword(password2);

        if (loginError != null) {
            System.out.println("Erro: " + loginError);
        } else if (passwordError != null) {
            System.out.println("Erro: " + passwordError);
        } else {
            System.out.println("Login e senha validos.");
        }

        System.out.println("-----------------------------------------------------------------------------------------------");

        String login3 = "nsaraujo2";
        String password3 = "A0lx13akl";

        loginError = validator.validateLogin(login3);
        passwordError = validator.validatePassword(password3);

        if (loginError != null) {
            System.out.println("Erro: " + loginError);
        } else if (passwordError != null) {
            System.out.println("Erro: " + passwordError);
        } else {
            System.out.println("Login e senha validos.");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------");

        String login4 = "nsaraujo4";
        String password4 = "@x13ghsa";

        loginError = validator.validateLogin(login4);
        passwordError = validator.validatePassword(password4);

        if (loginError != null) {
            System.out.println("Erro: " + loginError);
        } else if (passwordError != null) {
            System.out.println("Erro: " + passwordError);
        } else {
            System.out.println("Login e senha validos.");
        }
    }
}





