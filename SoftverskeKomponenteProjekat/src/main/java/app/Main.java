package app;

import java.util.List;

import exportdb.Entitet;
import utils.ImportExport;
import utils.ImportExportYAMLImpl;



public class Main {
	//123
	/**
	 * Main metoda koju smo generisali!!!
	 * 
	 * @param args neki opis
	 * @throws Exception opis greske
	 */
	public static void main(String[] args) throws Exception {
		
		/*ImportExportJSONImpl jsonimpl = new ImportExportJSONImpl();
		List<Entitet> entiteti = jsonimpl
				.importFileToObject("D:\\Users\\Hp\\Documents\\GitHub\\Softverske-Komponente-LKAR\\SKPJSON\\data\\data.json");
		
		for (Entitet e : entiteti) {
			System.out.println(e);
		}
		//impl.findByID(1, entiteti);*/

		ImportExport impl = new ImportExportYAMLImpl();
		
		List<Entitet> entiteti = impl
				.importFileToObject("D:\\Users\\Hp\\Documents\\GitHub\\Softverske-Komponente-LKAR\\SKPYAML\\data\\data.yml");

		for (Entitet e : entiteti) {
			System.out.println(e);
		}
	}

}
