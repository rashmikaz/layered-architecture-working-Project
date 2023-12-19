package com.example.layeredarchitecture.DAO;

import java.sql.SQLException;

import com.example.layeredarchitecture.model.OrderDTO;




public interface OrderDAO {

    public String generateOID() throws SQLException, ClassNotFoundException;
    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException;
    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;
}
