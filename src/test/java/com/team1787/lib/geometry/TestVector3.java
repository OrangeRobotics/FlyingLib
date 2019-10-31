package com.team1787.lib.geometry;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestVector3 {

    final Vector3 A = new Vector3(3, 4, 5);
    final Vector3 B = new Vector3( 123, 123, 123);

    @Test
    void magnitude() {

    }

    @Test
    void scale() {
        final Vector3 scaledA = A.scale(2);
        final Vector3 scaledTargetA = new Vector3(6, 8, 10);

        assertEquals(scaledTargetA, scaledA);
    }

    @Test
    void dot() {

    }

    @Test
    void unitVector() {
        final Vector3 unitA = A.unitVector();
        final Vector3 unitB = B.unitVector();

//        assertEquals(1, unitA.magnitude());
        assertEquals(1, unitB.magnitude());
    }

}