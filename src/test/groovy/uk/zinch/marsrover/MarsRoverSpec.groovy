package uk.zinch.marsrover

import spock.lang.Specification

import static uk.zinch.marsrover.Orientation.NORTH

class MarsRoverSpec extends Specification {

    def 'should move rover forward'()
    {
        given:
        def position = new Position(new Coordinates(5, 5), NORTH)
        def rover = new MarsRover(position)
        when:
        def newPosition = rover.execute 'F'
        then:
        newPosition == new Position(new Coordinates(5, 6), NORTH)
    }
}
