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

	abstract public void save(List<List<String>> data);

	abstract public void save(List<List<String>> data, List<String> header);
	
	abstract public Entitet findByID(int id, List<Entitet> entiteti);

	public void setFileName(String fileName) {
		this.fileName = fileName;

	}

}
