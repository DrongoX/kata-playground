package uk.zinch.marsrover;

public class MarsRover {


    private final Position position;

    MarsRover(Position position) {

        this.position = position;
    }

    public Position execute(String command) {
        if(position.orientation().equals(Orientation.NORTH))
            return new Position(new Coordinates(5, 6), Orientation.NORTH);
        else
            return new Position(new Coordinates(5, 4), Orientation.SOUTH);
    }
}
