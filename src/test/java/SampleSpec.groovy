import spock.lang.Specification

class SampleSpec extends Specification{

    def "validate string concatenation"(){
        given:
        def stringOne = "Hello"
        def stringTwo = "World"

        when:
        def stringConcatenated= stringOne.concat(stringTwo)

        then:
        stringConcatenated == "HelloWorld"
    }
}
