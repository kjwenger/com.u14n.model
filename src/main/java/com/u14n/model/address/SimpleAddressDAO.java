/**
 *
 */
package com.u14n.model.address;

import java.util.List;

import com.u14n.model.dao.DAOException;

/**
 * @author Klaus Wenger
 */
public interface SimpleAddressDAO {
    /**
     * @param address
     * @throws DAOException
     */
    void insert(SimpleAddress address) throws DAOException;
    /**
     * @param id
     * @return
     * @throws DAOException
     */
    List<SimpleAddress> findById(long id) throws DAOException;
    /**
     * @param name
     * @param lastName
     * @return
     * @throws DAOException
     */
    List<SimpleAddress> findByName(String name) throws DAOException;
    /**
     * @return
     * @throws DAOException
     */
    List<SimpleAddress> findAll() throws DAOException;
    /**
     * @param address
     * @throws DAOException
     */
    void update(SimpleAddress address) throws DAOException;
    /**
     * @param address
     * @throws DAOException
     */
    void delete(SimpleAddress address) throws DAOException;
}
