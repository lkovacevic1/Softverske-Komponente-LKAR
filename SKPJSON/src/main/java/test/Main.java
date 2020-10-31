package test;

import java.util.List;

import utils.Entitet;
import utils.ImportExportJSONImpl;

public class Main {

	public static void main(String[] args) throws Exception {

		ImportExportJSONImpl impl = new ImportExportJSONImpl();
		List<Entitet> entiteti = impl
				.importFileToObject("D:\\Users\\Hp\\Documents\\GitHub\\Softverske-Komponente-LKAR\\SKPJSON\\data\\data.json");

		for (Entitet e : entiteti) {
			System.out.println(e);
		}
		
		impl.exportObjectToFile(entiteti, "D:\\Users\\Hp\\Documents\\GitHub\\Softverske-Komponente-LKAR\\SKPJSON\\data\\data.json");

	}

}
