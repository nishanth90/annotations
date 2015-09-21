package com.nish.annotations.annotaionProcessors;

import com.nish.annotations.Implementation.TestAnnotation1Impl;
import com.nish.annotations.TestAnnotationMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Created by NishanthK on 20/09/2015.
 */
public class TestAnnotation1Proc {

    public static void main(String[] args)throws IllegalAccessException,InvocationTargetException {
        processAnnotation(TestAnnotation1Impl.class);
    }

    public static void processAnnotation(Class<?> cl) throws IllegalAccessException,InvocationTargetException {
        for (Method m : cl.getDeclaredMethods()) {
            TestAnnotationMethod ta = m.getAnnotation(TestAnnotationMethod.class);
            if (ta != null) {
                m.invoke(new TestAnnotation1Impl(""));
            }
        }
    }

}
