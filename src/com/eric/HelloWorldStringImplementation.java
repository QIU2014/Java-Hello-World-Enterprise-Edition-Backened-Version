package com.eric;

class HelloWorldStringImplementation implements IHelloWorldString {
    public HelloWorldString getHelloWorldString() {
        StringFactory factory = StringFactory.getInstance();
        return factory.createHelloWorldString("Hello, World!");
    }
}
