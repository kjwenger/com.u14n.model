/**
 *
 */
package com.u14n.model.user;

import java.util.List;

import com.u14n.model.dao.DAOException;

/**
 * @author Klaus Wenger
 */
public interface UserDAO {
    /**
     * @param user
     * @throws DAOException
     */
    void insert(User user) throws DAOException;
    /**
     * @param id
     * @return
     * @throws DAOException
     */
    List<User> findById(long id) throws DAOException;
    /**
     * @param name
     * @param lastName
     * @return
     * @throws DAOException
     */
    List<User> findByName(String name) throws DAOException;
    /**
     * @return
     * @throws DAOException
     */
    List<User> findAll() throws DAOException;
    /**
     * @param user
     * @throws DAOException
     */
    void update(User user) throws DAOException;
    /**
     * @param user
     * @throws DAOException
     */
    void delete(User user) throws DAOException;
}
