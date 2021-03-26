package com.clase3;

import java.util.regex.Pattern;

public class PasswordFuerte extends Password{

    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    public PasswordFuerte(Pattern pattern) {
        super(pattern);
    }



}
