package com.team1787.lib.geometry;

import lombok.Getter;

import java.util.Objects;

/**
 * A two-dimensional vector
 */
public final class Vector2 implements IVector<Vector2> {

    public static final Vector2 ZERO = new Vector2(0, 0);
    public static final Vector2 ONE = new Vector2(1, 1);
    public static final Vector2 X = new Vector2(1, 0);
    public static final Vector2 Y = new Vector2(0, 1);

    @Getter
    private final double x, y;

    /**
     * Instantiates a new two-dimensional vector with specified components
     *
     * @param x the x
     * @param y the y
     */
    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Instantiates a new two-dimensional 0 vector
     */
    public Vector2() {
        this(0, 0); // 0 vector
    }

    @Override
    public double magnitude() {
        return Math.sqrt(Math.pow(this.x , 2) + Math.pow(this.y, 2));
    }

    @Override
    public Vector2 scale(double scalar) {
        return new Vector2(this.x * scalar, this.y * scalar);
    }

    @Override
    public Vector2 add(Vector2 b) {
        return new Vector2(this.x + b.x, this.y + b.y);
    }

    @Override
    public Vector2 unitVector() {
        return this.scale(1 / this.magnitude());
    }

    @Override
    public double dot(Vector2 b) {
        return this.x * b.x + this.y * b.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector2)) return false;
        Vector2 vector2 = (Vector2) o;
        return Double.compare(vector2.x, x) == 0 &&
                Double.compare(vector2.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
