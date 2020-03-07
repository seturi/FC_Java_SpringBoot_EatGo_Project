package kr.co.fastcampus.eatgo.eatgo.application;

public class PasswordWrongException extends RuntimeException{
    PasswordWrongException() {
        super("Password is wrong");
    }

}
