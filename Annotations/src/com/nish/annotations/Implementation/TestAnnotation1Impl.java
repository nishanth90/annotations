package com.nish.annotations.Implementation;

import com.nish.annotations.TestAnnotationField;
import com.nish.annotations.TestAnnotationMethod;

/**
 * Created by NishanthK on 20/09/2015.
 */
public class TestAnnotation1Impl {
    public TestAnnotation1Impl(String s){
        this.s = s;
    }

    @TestAnnotationField(value = 1)
    private String s;

    @TestAnnotationMethod
    public void test1() {
        System.out.println("Test executed!!!");
    }

    public void test2() {System.out.println("Do not execute!!!");}


}
