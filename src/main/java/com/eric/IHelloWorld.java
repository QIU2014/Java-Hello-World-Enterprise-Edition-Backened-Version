package com.eric;

interface IHelloWorld {
    IHelloWorldString getHelloWorld();

    IPrintStrategy getPrintStrategy();

    IStatusCode print(IPrintStrategy strategy, IHelloWorldString toPrint);
}
