package discord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface DatabaseInterface {
	Connection getConnection() throws SQLException, ClassNotFoundException;
    void close_resorce(ResultSet[] resultsets, Connection conn, PreparedStatement ps);
}
