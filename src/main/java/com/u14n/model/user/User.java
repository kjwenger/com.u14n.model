package com.u14n.model.user;

import java.beans.PropertyVetoException;
import java.util.Collection;

import com.u14n.model.person.Person;

/**
 * @author Klaus Wenger
 */
public interface User {
    /**
     * @return The user name
     */
    String getName();
    /**
     * @param name The new user name
     */
    void setName(String name);
    /**
     * @param givenPassword The given password to match
     * @return <code>true</code> if the given password matches its own
     */
    boolean checkPassword(String givenPassword);
    /**
     * TODO: Remove and re-think how to map ORMs.
     *
     * @return Its password
     */
    String getPassword();
    /**
     * @param newPassword The new password
     * @throws PropertyVetoException In case changing the password with the new one is not possible for security/minimum-requirements
     */
    void setPassword(String newPassword) throws PropertyVetoException;
    /**
     * @return The user e-mMail
     */
    String getEmail();
    /**
     * @param email The new user e-mail
     */
    void setEmail(String email);
    /**
     * @return The {@link Person} behind this
     */
    Person getPerson();
    /**
     * @return The possibly empty {@link Collection} of {@link Group}s this user belongs to
     */
    Collection<? extends Group> getGroups();
}