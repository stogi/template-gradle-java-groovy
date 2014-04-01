package com.stogiapps.app

import spock.lang.Specification

class FooUnitSpec extends Specification {

    def foo = new Foo()

    void 'bar returns true'() {
        expect:
        foo.bar()
    }

}