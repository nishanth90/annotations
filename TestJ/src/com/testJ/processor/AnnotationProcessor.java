package com.testJ.processor;

import com.testJ.core.ClassScanner;
import com.testJ.exception.NoTestClassesFoundException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by NishanthK on 24/09/2015.
 */
public class AnnotationProcessor {

    public AnnotationProcessor() {}

    public static void main(String[] args) throws IOException, URISyntaxException, NoTestClassesFoundException,
                                                                                            ClassNotFoundException{
        List<Class> classNames = null;

        if(args[0] != null) {
            classNames = ClassScanner.scanPackage(args[0]);
        }
        if(classNames.isEmpty()) {
            throw new NoTestClassesFoundException();
        }
        //Need to write logic for loop through the classes and identify annotations marked within them
    }
}
