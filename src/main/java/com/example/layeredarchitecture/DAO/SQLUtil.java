package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLUtil {
    public static <T> T execute(String sql, Object... args) throws SQLException, ClassNotFoundException {//create method and put connection
        Connection connection = DBConnection.getDbConnection().getConnection();   //sql=query ,args=values
        PreparedStatement pstm = connection.prepareStatement(sql);
        for (int i=0;i< args.length; i++){
            pstm.setObject(i+1,args[i]);
        }
        if (sql.startsWith("SELECT")){//select ekak awoth oka krnn nttn palleha ekh krnn
            return (T)pstm.executeQuery();
        }else {
            return (T)(Boolean)(pstm.executeUpdate()>0);
        }
    }
}
