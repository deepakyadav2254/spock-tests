import spock.lang.Specification

class CitySpec extends Specification {

    def "assertion tips"(){
        given:
        def cityList = new LinkedList();

        when:
        cityList.add(new CityInfo("Mumbai",100));
        cityList.add(new CityInfo("Gurgaon", 200))
        cityList.add(new CityInfo("Delhi",500))

        then:
        cityList*.cityName == ["Mumbai","Gurgaon", "Delhi"]
    }
}
