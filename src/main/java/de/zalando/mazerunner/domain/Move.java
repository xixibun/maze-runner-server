package de.zalando.mazerunner.domain;

import com.google.common.base.MoreObjects;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel("Move within the maze")
public class Move {
    @ApiModelProperty
    private Coordinate from;

    @ApiModelProperty
    private Direction direction;

    public Move() { }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("from", from).add("direction", direction).toString();
    }

    public void setFrom(Coordinate from) {
        this.from = from;
    }

    public Coordinate getFrom() {
        return from;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}