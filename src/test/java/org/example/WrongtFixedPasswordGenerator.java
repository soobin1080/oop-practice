package org.example;

public class WrongtFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword(){
        return "ab"; //8글자
    }
}
