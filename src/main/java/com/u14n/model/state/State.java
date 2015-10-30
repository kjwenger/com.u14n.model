/**
 * 
 */
package com.u14n.model.state;

/**
 * @author Klaus Wenger
 */
public interface State {
    /**
     * Gets the code for this state, which will be the upper-case
     * ISO 3166 2-letter code.
     *
     * @see #getDisplayState
     * @return
     */
    String getState();
    /**
     * @return
     */
    String getDisplayState();
}
