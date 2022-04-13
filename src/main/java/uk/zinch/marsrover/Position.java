package uk.zinch.marsrover;

import static uk.zinch.marsrover.Orientation.*;

public record Position(Coordinates coords, Orientation orientation) {
    public Position forward() {
        return this.orientation.forward(this.coords);
    }
}
