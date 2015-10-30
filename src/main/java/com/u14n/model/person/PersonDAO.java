/**
 *
 */
package com.u14n.model.person;

import java.util.List;

import com.u14n.model.dao.DAOException;

/**
 * @author Klaus Wenger
 */
public interface PersonDAO {
    /**
     * @param person
     * @throws DAOException
     */
    void insert(Person person) throws DAOException;
    /**
     * @param id
     * @return
     * @throws DAOException
     */
    List<Person> findById(long id) throws DAOException;
    /**
     * @param name
     * @return
     * @throws DAOException
     */
    List<Person> findByName(String name) throws DAOException;
    /**
     * @return
     * @throws DAOException
     */
    List<Person> findAll() throws DAOException;
    /**
     * @param person
     * @throws DAOException
     */
    void update(Person person) throws DAOException;
    /**
     * @param person
     * @throws DAOException
     */
    void delete(Person person) throws DAOException;
}
