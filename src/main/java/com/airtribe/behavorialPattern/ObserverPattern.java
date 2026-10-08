package com.airtribe.behavorialPattern;

/**
 The Observer pattern is used when one object changes state and multiple other objects
 need to react in different ways. The changing object is the subject, and the
 interested parties are the observers. When the subject changes, it notifies all
 registered observers automatically.

 Key insight: Same event, different actions.

 A helpful mental model is a stock price. One observer may want to buy when the stock
 reaches a certain price, another may want to sell at a different threshold, and another
 may only want an alert when the price moves sharply. All of them are watching the same
 subject, but each reacts differently.

 https://www.airtribe.live/dashboard/backend-java/courses/PTOG5FUZ07JU/modules/D1KA5L28801V
 */
public class ObserverPattern {
}
