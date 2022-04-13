package uk.zinch.marsrover;

public enum Orientation {
    NORTH(new Coordinates(0, 1)),
    SOUTH(new Coordinates(0, -1)),
    WEST(new Coordinates(-1, 0)),
    EAST(new Coordinates(1, 0));

    private final Coordinates delta;

    Orientation(Coordinates delta) {
        this.delta = delta;
    }

    public Position forward(Coordinates coords) {
        return new Position(coords.modifyBy(this.delta), this);
    }

}
