import spock.lang.Specification

class FunTests extends Specification {
    def"check length of array" (){
        given:
        def arr = new int[]{1,5,7,8};

        when:
        def length = arr.length

        then:
        length == 4
    }
}
