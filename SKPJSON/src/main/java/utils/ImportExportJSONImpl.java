package utils;

import java.io.File;
import java.util.List;

import javax.lang.model.UnknownEntityException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ImportExportJSONImpl implements ImportExport{

	@Override
	public List<Entitet> importFileToObject(String path) throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		List<Entitet> entiteti = objectMapper.readValue(new File(path), new TypeReference<List<Entitet>>() {
		});

		return entiteti;
	}

	@Override
	public boolean exportObjectToFile(List<Entitet> entiteti, String path) throws Exception {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.writeValue(new File(path), entiteti);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Entitet selectDataByID(int id, List<Entitet> entiteti) throws Exception {
		Entitet et = null;
		for(Entitet e : entiteti) {
			if(e.getId() == id) {
				et = e;
				System.out.println(et);
				return et;
			}
		}
		if(et == null) {
			System.out.println("Ne postoji entitet sa tim ID-on!");
		}
		return null;
	}

	@Override
	public Entitet selectDataByID(int id) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Entitet> entiteti = objectMapper.readValue(new File("C:\\Users\\Name\\git\\Softverske-Komponente-LKAR\\SKPJSON\\data\\data.json"), new TypeReference<List<Entitet>>() {
		});
		
		Entitet et = null;
		
		for(Entitet e : entiteti) {
			if(e.getId() == id) {
				et = e;
				System.out.println(et);
				return et;
			}
		}
		if(et == null) {
			System.out.println("Ne postoji entitet sa tim ID-on!");
		}
		return null;
	}
}
