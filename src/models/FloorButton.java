/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.SimulatorSystem;
import logger.LoggingCenter;

/**
 *
 * @author Hao
 */
public class FloorButton extends Button {

    int floorNum;
    boolean direction;

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    public FloorButton() {
    }

    public FloorButton(int floorNum, boolean direction) {
        this.floorNum = floorNum;
        this.direction = direction;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FloorButton other = (FloorButton) obj;
        if (this.floorNum != other.floorNum) {
            return false;
        }
        if (this.direction != other.direction) {
            return false;
        }
        return true;
    }

    @Override
    public void pressed() {
        LoggingCenter.getInstance().logger.info("Button " + this + " (" + (direction == true ? "UP" : "DOWN") + " at floor " + (floorNum + 1) + "): is pressed.");
        SimulatorSystem.getInstance().getController().getPassengerInform(this);
    }

    @Override
    public void turnOn() {
        this.illuminated = true;
        LoggingCenter.getInstance().logger.info("Button " + this + " (" + (direction == true ? "UP" : "DOWN") + " at floor " + (floorNum + 1) + "): light ON.");
    }

    @Override
    public void turnOff() {
        this.illuminated = false;
        LoggingCenter.getInstance().logger.info("Button " + this + " (" + (direction == true ? "UP" : "DOWN") + " at floor " + (floorNum + 1) + "): light OFF");
    }
}
