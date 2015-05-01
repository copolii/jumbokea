package com.example.jumbokea;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 Created by mahramf on 30/04/15.
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
public class AnotherClass {
    private float someFloat;

    private final SomeClass someClass;
}
