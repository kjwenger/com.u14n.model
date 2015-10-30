package com.u14n.model.user;

import java.util.Collection;

/**
 * @author Klaus Wenger
 * @since Mar 6, 2010 7:26:50 PM
 */
public interface Group {
    /**
     * @return The group name
     */
    String getName();
    /**
     * @param name The new group name
     */
    void setName(String name);
    /**
     * @return The possibly empty {@link Collection} of {@link User}s that are in this group
     */
    Collection<? extends User> getUsers();
}
