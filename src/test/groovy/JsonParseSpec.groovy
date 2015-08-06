import spock.lang.*
import groovy.json.JsonSlurper

class JsonParseSpec extends Specification {

  def "should serialize json string to object"() {
  setup:
    JsonSlurper jsonSlurper = new JsonSlurper()
  when:
    Map map = jsonSlurper.parseText('{"id":1}')
  then:
    map
    map.id == 2
  }
}
