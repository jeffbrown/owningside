package demo

import grails.core.GrailsDomainClass
import grails.core.GrailsDomainClassProperty
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(SomeChild)
class SomeChildSpec extends Specification {


    void "test relationship"() {
        when:
        GrailsDomainClass domainClass = grailsApplication.getDomainClass(SomeChild.name)
        GrailsDomainClassProperty fooProperty = domainClass.getPersistentProperty('foo')

        then:
        fooProperty.isBidirectional()
        fooProperty.otherSide
    }
}
