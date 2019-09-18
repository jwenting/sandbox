package com.captainduckman.sandbox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JeroenWenting on 22-May-17.
 */
public class LTest1 {
    public static void main(String[] args) {
        SomeClass y = new SomeClass();
        List<SomeOtherClass> list = new ArrayList<>();
        list.forEach(y::someMethod);
    }

    public static class SomeClass {
        public void someMethod(SomeOtherClass x) {

        }
    }

    public static class SomeOtherClass {
    }
}
