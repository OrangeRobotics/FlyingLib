package com.team1787.lib.geometry;

public interface Vector<V extends Vector> {
    double magnitude();
    double dot(V b);
    V scale(double scalar);
    V add(V b);
    V unitVector();
}
