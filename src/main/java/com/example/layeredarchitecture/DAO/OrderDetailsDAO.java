package com.example.layeredarchitecture.DAO;


import com.example.layeredarchitecture.model.OrderDetailDTO;


import java.sql.SQLException;
import java.util.List;
public interface OrderDetailsDAO {
    boolean saveOrderDetails(String orderId, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException;
}
