package com.airtribe.meditrack.behavorialPattern;
/**
 A checkout flow can use different payment strategies:

 credit card payment strategy
 PayPal payment strategy
 crypto payment strategy
 Each one implements a common pay() method, but the internal logic differs.
 The shopping cart depends on the abstraction, not the concrete class.

 The main difference is purpose:

 Factory pattern: focuses on creating objects
 Strategy pattern: focuses on executing behavior or business logic
 */
public class StrategyPattern {
    /*
    create interface and has multiple implementation like payment and iciciPayment, paypalPayment
        create another concrete class like cart with instance of above interface
        using that interface call the interface method

        the caller of cart inject the instance of payment at runtime.
     */
}
