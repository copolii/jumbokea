package com.example.jumbokea;

/**
 Created by mahramf on 30/04/15.
 */
public class Main {

    public static void main (final String[] args) {
        final SomeClass sc = new SomeClass ();
        sc.setIntField (5);

        System.out.println ("int: " + sc.getIntField ());

        final AnotherClass ac = new AnotherClass (4.356f, sc);

        System.out.println ("ac.float: " + ac.getSomeFloat ());
        System.out.println ("ac.sc: " + ac.getSomeClass ());
    }
}
