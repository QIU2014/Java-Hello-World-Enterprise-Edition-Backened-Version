package com.eric;

interface IPrintStrategy {
    IStatusCode setupPrinting();

    IStatusCode print(IHelloWorldString string);
}
