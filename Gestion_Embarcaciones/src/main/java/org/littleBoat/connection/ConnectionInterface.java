package org.littleBoat.connection;

import java.sql.Connection;

public interface ConnectionInterface {
    public Connection getConnection();

    public void closeConnection(Connection connection);
}
