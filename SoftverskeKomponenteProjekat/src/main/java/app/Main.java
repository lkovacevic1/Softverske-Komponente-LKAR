package app;

import java.util.List;

import exportdb.DBExporter;
import exportdb.ExporterManager;
import utils.Entitet;
import utils.ImportExport;



public class Main {

	/**
	 * Main metoda koju smo generisali!!!
	 * 
	 * @param args neki opis
	 * @throws Exception opis greske
	 */
	public static void main(String[] args) throws Exception {
		DBExporter dbexporter = ExporterManager.getExporter("data.json");

		//Entitet et = dbexporter.findByID(1);
	}

}
