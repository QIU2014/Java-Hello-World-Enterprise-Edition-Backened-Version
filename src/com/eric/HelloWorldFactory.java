package com.eric;

class HelloWorldFactory {
    private static HelloWorldFactory instance = new HelloWorldFactory();

    public static HelloWorldFactory getInstance() {
        return instance;
    }

    public IHelloWorld createHelloWorld() {
        return new HelloWorldImplementation();
    }
}
