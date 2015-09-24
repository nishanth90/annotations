package com.testJ.exception;

/**
 * Created by NishanthK on 24/09/2015.
 */
public class NoTestClassesFoundException extends Exception {
    public NoTestClassesFoundException() {
        super("No Test Classes found in the configured package");
    }
}
