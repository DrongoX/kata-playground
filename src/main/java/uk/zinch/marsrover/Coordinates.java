package uk.zinch.marsrover;

public record Coordinates(int x, int y) {
    public Coordinates modifyBy(Coordinates deltaCoordinates) {
        return new Coordinates(x + deltaCoordinates.x, y + deltaCoordinates.y);
    }
}
