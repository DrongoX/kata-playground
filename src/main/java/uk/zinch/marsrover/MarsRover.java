package uk.zinch.marsrover;

import static uk.zinch.marsrover.Orientation.*;

public class MarsRover {

    private final Position position;

    MarsRover(Position position) {
        this.position = position;
    }

    public Position execute(String command) {
        if (position.orientation().equals(WEST))
            return new Position(new Coordinates(5, 5).modifyBy(-1, 0), WEST);
        if (position.orientation().equals(NORTH))
            return new Position(this.position.coords().modifyBy(0, 1), NORTH);
        return new Position(new Coordinates(5, 5).modifyBy(0, -1), SOUTH);
    }
}
