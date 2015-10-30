/**
 * 
 */
package com.u14n.model;

/**
 * @author Klaus Wenger
 */
public aspect DomainIntegrity {
    /**
     * 
     */
    pointcut withinDomain() : within(com.u14n.model..*);
    /**
     * 
     */
    pointcut callsOutside() : (call(* *(..)) || set(* *))
        && !within(com.u14n.model..*);
    pointcut itCallsOutside() : callsOutside() && !adviceexecution();

    declare warning : itCallsOutside() : "Domain integrity violation";
}
