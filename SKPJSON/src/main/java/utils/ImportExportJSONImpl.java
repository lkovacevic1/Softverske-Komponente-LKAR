package utils;

import java.io.File;
import java.util.List;

import javax.lang.model.UnknownEntityException;
import javax.swing.plaf.ComponentUI;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;

import exportdb.DBExporter;
import exportdb.ExporterManager;

public class ImportExportJSONImpl extends DBExporter implements ImportExport{
	
	static {
		ExporterManager.registerExporter(new ImportExportJSONImpl());
	}


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

	//Selekcija entiteta za dati ID i listu entitta
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

	//Selekcija entiteta za dati ID
	@Override
	public Entitet selectDataByID(int id) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Entitet> entiteti = objectMapper.readValue(new File("D:\\Users\\Hp\\Documents\\GitHub\\Softverske-Komponente-LKAR\\SoftverskeKomponenteProjekat\\data\\data.json"), new TypeReference<List<Entitet>>() {
		});
		
		Entitet et = null;
		
		for(Entitet e : entiteti) {
			if(e.getId() == id) {
				et = e;
				System.out.println(et);
				return et;
			}else if(e.getEntityProperties().get(id) != null) {
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

	//Selekcija entiteta po nazivu
	@Override
	public List<Entitet> selectByNmae(String name) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Entitet> entiteti = objectMapper.readValue(new File("C:\\Users\\Name\\git\\Softverske-Komponente-LKAR\\SKPJSON\\data\\data.json"), new TypeReference<List<Entitet>>() {
		});
		
		int brojac = 0;
		for(Entitet e : entiteti) {
			if(e.getNaziv().equals(name)) {
				System.out.println(e);
				brojac++;
			}else if(e.getEntityProperties().get(name) != null) {
				System.out.println(e);
				brojac++;
			}
		}
		if(brojac == 0) {
			System.out.println("Ne postoji entitet sa datim nazivom!");
		}
		
		return null;
	}

	@Override
	public void save(List<List<String>> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<List<String>> arg0, List<String> arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public exportdb.Entitet findByID(int id) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Entitet> entiteti = objectMapper.readValue(new File("D:\\Users\\Hp\\Documents\\GitHub\\Softverske-Komponente-LKAR\\SoftverskeKomponenteProjekat\\data\\data.json"), new TypeReference<List<Entitet>>() {
		});
		
		Entitet et = null;
		
		for(Entitet e : entiteti) {
			if(e.getId() == id) {
				et = e;
				System.out.println(et);
				break;
			}else if(e.getEntityProperties().get(id) != null) {
				et = e;
				System.out.println(et);
				break;
			}
		}
		if(et == null) {
			System.out.println("Ne postoji entitet sa tim ID-on!");
		}
		return null;
		
	}
	
}
