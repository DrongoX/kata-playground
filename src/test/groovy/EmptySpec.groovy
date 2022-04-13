import spock.lang.Specification

import static org.assertj.core.api.Assertions.fail

class EmptySpec extends Specification {

    def 'dummy test'()
    {
        expect:
        fail 'You\'d better start writing code!'
    }
}
