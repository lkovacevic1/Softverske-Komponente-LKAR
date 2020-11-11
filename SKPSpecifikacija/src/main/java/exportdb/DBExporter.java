package exportdb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class DBExporter {

	protected String fileName;

	public DBExporter() {
	}
	
	abstract public Entitet findByID(int id)throws Exception;

	abstract public void save(List<List<String>> data);

	abstract public void save(List<List<String>> data, List<String> header);
<<<<<<< HEAD

	public void save(ResultSet rs, boolean useColumnLabelsAsHeaders) throws SQLException {
		List<List<String>> all = new ArrayList<List<String>>();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
			List<String> row = new ArrayList<String>();
			for (int i = 1; i <= columnsNumber; i++) {
				row.add(rs.getString(i));
			}
			all.add(row);
		}
		if (!useColumnLabelsAsHeaders)
			save(all);
		else {
			List<String> header = new ArrayList<String>();
			for (int i = 1; i <= columnsNumber; i++) {
				header.add(rsmd.getColumnLabel(i));
			}
			save(all, header);
		}
	}

	public void save(ResultSet rs, List<String> header) throws SQLException {
		List<List<String>> all = new ArrayList<List<String>>();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
			List<String> row = new ArrayList<String>();
			for (int i = 1; i <= columnsNumber; i++) {
				row.add(rs.getString(i));
			}
			all.add(row);
		}
		save(all, header);

	}

	public void save(Connection conn, String query, boolean useColumnLabelsAsHeaders) throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		save(rs, useColumnLabelsAsHeaders);
	}

	public void save(Connection conn, String query, List<String> header) throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		save(rs, header);
	}
	
=======
	
	abstract public Entitet findByID(int id, List<Entitet> entiteti);
>>>>>>> branch 'master' of https://github.com/lkovacevic1/Softverske-Komponente-LKAR.git

	public void setFileName(String fileName) {
		this.fileName = fileName;

	}
	
	

}
