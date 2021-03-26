package com.clase3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;

public class Password {

    private static Pattern pattern;
    private String password;

    public Password(Pattern pattern){
        this.pattern = pattern;
    }

    public void setValue(String password) throws Exception {
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            this.password = password;
        else
            throw new DataFormatException("Password did not match the format.");
    }



}
