/**
 * 
 */
package com.u14n.model.dao;

/**
 * @author Klaus Wenger
 */
public class DAOException extends Exception {
    /**
     * 
     */
    public DAOException() {
        super();
    }
    /**
     * @param message
     */
    public DAOException(String message) {
        super(message);
    }
    /**
     * @param cause
     */
    public DAOException(Throwable cause) {
        super(cause);
    }
    /**
     * @param message
     * @param cause
     */
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
}
