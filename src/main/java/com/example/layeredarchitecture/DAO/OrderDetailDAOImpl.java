package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetailDAOImpl implements OrderDetailDAO{
    @Override
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
     /*   Connection connection = DBConnection.getDbConnection().getConnection();*/
        return SQLUtil.
                execute("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)",
                        dto.getOid(),dto.getItemCode(),dto.getUnitPrice(),dto.getQty());

    }
}
