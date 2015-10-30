/**
 * 
 */
package com.u14n.model;

/**
 * @author Klaus Wenger
 */
public aspect Model {
    declare precedence :
        DomainIntegrity, Serializables, Observables, *;
}
