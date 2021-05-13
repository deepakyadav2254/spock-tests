import spock.lang.Specification

class CalculatorSpec extends Specification {

    def "test the calculator for sum"(){
        given:
        def app = new CalculatorImplementation()

        when:
        def result= app.add(inputOne,inputTwo)

        then:
        result == expectedOutput

        where:
        inputOne|inputTwo|expectedOutput
        10|20|30
        -50|20|-30
    }

    def "test calculator for subtraction"(){
        given:
        def app = new CalculatorImplementation()

        when:
        def result = app.subtract(inputOne , inputTwo)

        then:
        result == expected

        where:
        inputOne | inputTwo | expected
        20 | 10 | 10
        -10 | -20 | 10
    }

    def "test calculator for multiplication"(){
        given:
        def app = new CalculatorImplementation();

        when:
        def result = app.multiply(inputOne, inputTwo)

        then:
        result ==  expected

        where:
        inputOne | inputTwo | expected
        10  | 30 | 300
        -10 | -2 | 20
    }

    def "test calculator for division"(){
        given:
        def app = new CalculatorImplementation();

        when:
        def result =  app.divide(inputOne , inputTwo)

        then:
        result == expected

        where:
        inputOne | inputTwo | expected
        20 | 2 | 10
        40 | 5 | 8
    }
}
