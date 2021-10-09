/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) UnitD-lk. All rights reserved.
 *  *  Licensed under the SriLanka License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author GImhan Pabasara <gimhanpabasara4@gmail.com> (www.gimhanpabasara.tk)
 * @since 10/9/2021
 */
public class DBConnection {
    private static DBConnection dbConnection;

    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Kade", "root", "1234");
    }

    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        return (null==dbConnection) ? (dbConnection = new DBConnection()) : (dbConnection);
    }

    public Connection getConnection() {
        return connection;
    }
}

