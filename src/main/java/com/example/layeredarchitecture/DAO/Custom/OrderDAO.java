package com.example.layeredarchitecture.DAO.Custom;

import java.sql.SQLException;
import java.time.LocalDate;

import com.example.layeredarchitecture.model.OrderDTO;




public interface OrderDAO extends CrudDAO<OrderDTO> {
    boolean save(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;

 //   boolean exist(String orderId) throws SQLException, ClassNotFoundException;

 //   boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;

//    public String generateOID() throws SQLException, ClassNotFoundException;
//    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException;
//    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;
}
