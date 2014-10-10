/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author Hao
 */
public class Request {
    int startFloor;
    boolean direction;
    int endFloor;

    public int getStartFloor() {
        return startFloor;
    }
    
    public void setStartFloor(int startFloor) {
        this.startFloor = startFloor;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    public int getEndFloor() {
        return endFloor;
    }

    public void setEndFloor(int endFloor) {
        this.endFloor = endFloor;
    }

    public Request(int startFloor, boolean direction) {
        this.startFloor = startFloor;
        this.direction = direction;
    }

    public Request(int startFloor, boolean direction, int endFloor) {
        this.startFloor = startFloor;
        this.direction = direction;
        this.endFloor = endFloor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Request other = (Request) obj;
        if (this.startFloor != other.startFloor) {
            return false;
        }
        if (this.direction != other.direction) {
            return false;
        }
        return true;
    }
    
}
