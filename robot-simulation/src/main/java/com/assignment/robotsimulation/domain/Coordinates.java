package com.assignment.robotsimulation.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coordinates {
    private int x ;
    private int y ;
    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
}
