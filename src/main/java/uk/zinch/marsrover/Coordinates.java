package uk.zinch.marsrover;

public record Coordinates(int x, int y) {
    public Coordinates modifyBy(int deltaX, int deltaY) {
        return new Coordinates(x + deltaX, y + deltaY);
    }
}
