package com.example.jumbokea;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 Created by mahramf on 30/04/15.
 */
public class Tester {

    @Test public void someClass () {
        final SomeClass sc1 = new SomeClass ();
        sc1.setIntField (2);

        assertEquals (2, sc1.getIntField ());

        sc1.setIntField (5);
        assertEquals (5, sc1.getIntField ());
    }

    @Test public void anotherClass () {
        final AnotherClass ac = new AnotherClass (2.2f, new SomeClass (12));

        assertEquals (2.2f, ac.getSomeFloat (), 0.1f);
        assertEquals (12, ac.getSomeClass ().getIntField ());
    }

}
