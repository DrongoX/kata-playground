package uk.zinch.marsrover

import spock.lang.Specification

import static uk.zinch.marsrover.Orientation.*

class MarsRoverSpec extends Specification {

    def 'should move rover forward'() {
        given:
        def position = new Position(new Coordinates(startX, startY), startingOrientation)
        def rover = new MarsRover(position)
        when:
        def newPosition = rover.execute 'F'
        then:
        newPosition == new Position(new Coordinates(newX, newY), newOrientation)
        where:
        startX | startY | startingOrientation | newX | newY | newOrientation
        5      | 5      | NORTH               | 5    | 6    | NORTH
        3      | 2      | NORTH               | 3    | 3    | NORTH
        5      | 5      | SOUTH               | 5    | 4    | SOUTH
        5      | 5      | WEST                | 4    | 5    | WEST
        5      | 5      | EAST                | 6    | 5    | EAST
    }
}
