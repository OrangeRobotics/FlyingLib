package com.team1787.lib.geometry;

import static org.junit.jupiter.api.Assertions.*;

class Vector2Test {

    final Vector2 A = new Vector2(3, 4);

    @org.junit.jupiter.api.Test
    void magnitude() {
    }

    @org.junit.jupiter.api.Test
    void scale() {
        final Vector2 scaledA = A.scale(2.5);
        final Vector2 scaledTargetA = new Vector2(7.5, 10);
        assertEquals(scaledTargetA, scaledA);
    }

    @org.junit.jupiter.api.Test
    void unitVector() {
        final Vector2 unit = A.unitVector();
        assertEquals(1, unit.magnitude());
    }

    @org.junit.jupiter.api.Test
    void dot() {
    }
}