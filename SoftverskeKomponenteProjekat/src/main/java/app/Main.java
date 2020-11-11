package app;

import java.util.List;

import exportdb.DBExporter;
import exportdb.ExporterManager;
import utils.Entitet;
import utils.ImportExport;
import utils.ImportExportJSONImpl;



public class Main {
	//123
	/**
	 * Main metoda koju smo generisali!!!
	 * 
	 * @param args neki opis
	 * @throws Exception opis greske
	 */
	public static void main(String[] args) throws Exception {

		DBExporter dbexporter = ExporterManager.getExporter("data.json");

		//Entitet et = dbexporter.findByID(1);

		
		ImportExportJSONImpl impl = new ImportExportJSONImpl();
		Entitet e = (Entitet) impl.importFileToObject("C:\\Users\\Name\\git\\Softverske-Komponente-LKAR\\SoftverskeKomponenteProjekat\\data\\data.json");
		System.out.println(e);
		
	}

}
