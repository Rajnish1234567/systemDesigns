package com.airtribe.behavorialPattern;

/**
 *  Behaviour of object according to the state of object
 *  like
 *  Order can be modified when it's in draft
 *  order can be cancelled till the state is out for delivery
 *  can rate the product only after the state is delivered.
 *
 *  i.e state will be interface with method edit(), submit(), approve()
 *  all state will implement like draftState, submitState, approveState
 *  each state method will implement the method accordingly.
 */
public class StatePattern {
}
