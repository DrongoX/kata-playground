package uk.zinch.marsrover;

public class MarsRover {


    MarsRover(Position position) {

    }

    public Position execute(String command) {
        return new Position(new Coordinates(5, 6), Orientation.NORTH);
    }
}
