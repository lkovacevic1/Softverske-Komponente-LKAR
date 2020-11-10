package test;

import java.util.List;

import utils.Entitet;
import utils.ImportExportJSONImpl;

public class Main {

	public static void main(String[] args) throws Exception {

		ImportExportJSONImpl impl = new ImportExportJSONImpl();
		List<Entitet> entiteti = impl
				.importFileToObject("C:\\Users\\Name\\git\\Softverske-Komponente-LKAR\\SKPJSON\\data\\data.json");

		for (Entitet e : entiteti) {
			System.out.println(e);
		}
		
		System.out.println("\n");
		
		//Entitet entitet = impl.selectDataByID(10, entiteti);
		Entitet entitet1 = impl.selectDataByID(3);
		
		//List<Entitet> entitet2 = impl.selectByNmae("profesor");
		
		/*Entitet e1 = new Entitet(10, "Test");
		
		entiteti.add(e1);
		
		impl.exportObjectToFile(entiteti, "C:\\Users\\Name\\git\\Softverske-Komponente-LKAR\\SKPJSON\\data\\data.json");*/
		
	}

}
