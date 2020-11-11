package utils;

import java.util.List;

<<<<<<< HEAD
import javax.lang.model.UnknownEntityException;
import javax.swing.plaf.ComponentUI;

import com.fasterxml.jackson.core.type.TypeReference;
=======
>>>>>>> branch 'master' of https://github.com/lkovacevic1/Softverske-Komponente-LKAR.git
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;

import exportdb.DBExporter;
<<<<<<< HEAD
import exportdb.ExporterManager;

public class ImportExportJSONImpl extends DBExporter implements ImportExport{
	
	static {
		ExporterManager.registerExporter(new ImportExportJSONImpl());
	}

=======
import exportdb.Entitet;


public class ImportExportJSONImpl extends DBExporter{

	@Override
	public List<Entitet> importFileToObject(String path) throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		List<Entitet> entiteti = objectMapper.readValue(new File(path), new TypeReference<List<Entitet>>() {
		});
		
		return entiteti;
		
	public void save(List<List<String>> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<List<String>> arg0, List<String> arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entitet findByID(int id, List<Entitet> entiteti) {
		for(Entitet e : entiteti) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}

<<<<<<< HEAD
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
	
=======
>>>>>>> branch 'master' of https://github.com/lkovacevic1/Softverske-Komponente-LKAR.git
}
