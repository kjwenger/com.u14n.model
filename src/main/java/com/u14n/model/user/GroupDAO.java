/**
 *
 */
package com.u14n.model.user;

import java.util.List;

import com.u14n.model.dao.DAOException;

/**
 * @author Klaus Wenger
 */
public interface GroupDAO {
    /**
     * @param group
     * @throws DAOException
     */
    void insert(Group group) throws DAOException;
    /**
     * @param id
     * @return
     * @throws DAOException
     */
    List<Group> findById(long id) throws DAOException;
    /**
     * @param name
     * @param lastName
     * @return
     * @throws DAOException
     */
    List<Group> findByName(String name) throws DAOException;
    /**
     * @return
     * @throws DAOException
     */
    List<Group> findAll() throws DAOException;
    /**
     * @param group
     * @throws DAOException
     */
    void update(Group group) throws DAOException;
    /**
     * @param group
     * @throws DAOException
     */
    void delete(Group group) throws DAOException;
}
