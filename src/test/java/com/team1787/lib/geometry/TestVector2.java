package com.team1787.lib.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestVector2 {

    final Vector2 A = new Vector2(3, 4);

    @Test
    void magnitude() {
    }

    @Test
    void scale() {
        final Vector2 scaledA = A.scale(2.5);
        final Vector2 scaledTargetA = new Vector2(7.5, 10);
        assertEquals(scaledTargetA, scaledA);
    }

    @Test
    void unitVector() {
        final Vector2 unit = A.unitVector();
        assertEquals(1, unit.magnitude());
    }

    @Test
    void dot() {
    }
}