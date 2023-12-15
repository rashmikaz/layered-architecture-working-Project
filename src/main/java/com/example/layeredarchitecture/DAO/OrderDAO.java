package com.example.layeredarchitecture.DAO;

import java.sql.SQLException;

import com.example.layeredarchitecture.model.OrderDTO;




public interface OrderDAO {
    String generateOrderId() throws SQLException, ClassNotFoundException;

    boolean orderExist(String orderId) throws SQLException, ClassNotFoundException;

    boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;
}
