package com.team1787.lib.robot.motor;

import com.team1787.lib.robot.Device;
import com.team1787.lib.robot.DeviceType;

/**
 * A general class for motor controllers
 *
 * @param <T> the type parameter
 */
public abstract class MotorController<T> implements Device {

    private final DeviceType deviceType = DeviceType.MOTOR_CONTROLLER;

    /**
     * Gets the native instance for the motor controller
     *
     * @return the raw instance
     */
    public abstract T getRawInstance();

    /**
     * Whether the motor controller is set to inverted
     *
     * @return the boolean
     */
    public abstract boolean isInverted();

    /**
     * Sets inverted.
     *
     * @param inverted the inverted
     */
    public abstract void setInverted(boolean inverted);

    /**
     * Get the current speed of the motor controller
     *
     * @return the double
     */
    public abstract double get();

    /**
     * Set the speed for the motor controller.
     *
     * @param speed the speed
     */
    public abstract void set(double speed);

    /**
     * Disable the motor controller
     */
    public abstract void disable();

    /**
     * Stop the motor controller
     */
    public abstract void stopMotor();

    public final DeviceType getDeviceType() {
        return this.deviceType;
    }
}
