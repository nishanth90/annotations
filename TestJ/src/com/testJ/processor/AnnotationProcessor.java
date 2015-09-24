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
        List<String> classNames = null;
        List<Class> classes = new ArrayList<>();
        if(args[0] != null) {
            classNames = ClassScanner.scanPackage(args[0]);
        }
        if(classNames == null) {
            throw new NoTestClassesFoundException();
        }
        for(String className : classNames) {
            Class cl = Class.forName(className);
            classes.add(cl);
        }
    }
}
