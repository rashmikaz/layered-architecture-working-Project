package com.example.layeredarchitecture.DAO.Custom;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailDAO extends CrudDAO<OrderDetailDTO>{
 //   boolean saveOrderDetails(String orderId, OrderDetailDTO dto) throws SQLException, ClassNotFoundException;

    boolean save(String orderId, OrderDetailDTO orderDetails ) throws SQLException, ClassNotFoundException;

    //  public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;
}
