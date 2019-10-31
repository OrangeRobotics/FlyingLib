package com.team1787.lib.geometry;

public interface IVector<V extends IVector> {
    double magnitude();
    double dot(V b);
    V scale(double scalar);
    V add(V b);
    V unitVector();

}
