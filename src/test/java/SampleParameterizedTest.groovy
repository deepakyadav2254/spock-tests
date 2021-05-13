import spock.lang.Specification;

public class SampleParameterizedTest extends Specification {

    def "test to check power of numbers"(){



        when:
        def result = Math.pow(inputOne,inputTwo)

        then:
        result == expected

        where:
        inputOne | inputTwo | expected
        1 |2 |1
        2 | 4 |8
    }
}
