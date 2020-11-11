package utils;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import exportdb.DBExporter;
import exportdb.Entitet;


public class ImportExportJSONImpl extends DBExporter implements ImportExport{

    @Override
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
            	System.out.println(e);
                return e;
            }
        }
        return null;
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
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File(path), entiteti);

		return true;
	}

}