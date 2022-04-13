package uk.zinch.marsrover;

import static uk.zinch.marsrover.Orientation.*;

public class MarsRover {

    private final Position position;

    MarsRover(Position position) {
        this.position = position;
    }

    public Position execute(String command) {
        return this.position.forward();

    }
}
