package com.team1787.lib.geometry;

import lombok.Getter;

import java.util.Objects;

public class Vector3 implements Vector<Vector3> {

    public static final Vector3 ZERO = new Vector3(0, 0, 0);
    public static final Vector3 ONE = new Vector3(1, 1, 1);
    public static final Vector3 X = new Vector3(1, 0, 0);
    public static final Vector3 Y = new Vector3(0, 1, 0);
    public static final Vector3 Z = new Vector3(0, 0, 1);

    @Getter
    private final double x, y, z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double magnitude() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    @Override
    public Vector3 scale(double scalar) {
        return new Vector3(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    @Override
    public Vector3 add(Vector3 b) {
        return new Vector3(this.x + b.x, this.y + b.y, this.z + b.z);
    }

    @Override
    public double dot(Vector3 b) {
        return this.x * b.y + this.y + b.y + this.z * b.z;
    }

    @Override
    public Vector3 unitVector() {
        return this.scale(1 / this.magnitude());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3)) return false;
        Vector3 vector3 = (Vector3) o;
        return Double.compare(vector3.x, x) == 0 &&
                Double.compare(vector3.y, y) == 0 &&
                Double.compare(vector3.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
