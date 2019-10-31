package com.team1787.lib.field.property;

public abstract class Property<P extends Property> implements PropertyBase<P> {

    private P value;

    public Property() {
    }
}
