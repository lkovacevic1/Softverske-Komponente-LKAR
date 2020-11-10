package exportdb;

public class ExporterManager {

private static DBExporter dbExporter;
	
	public static void registerExporter(DBExporter dbExp) {
		dbExporter = dbExp;		
	}
	
	public static DBExporter getExporter(String fileName) {
		dbExporter.setFileName(fileName);
		return dbExporter;
	}
	
}
