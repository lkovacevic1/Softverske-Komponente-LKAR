package utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;

public class ImportExportYAMLImpl implements ImportExport{

	public List<Entitet> importFileToObject(String path) throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		List<Entitet> entiteti = objectMapper.readValue(new File(path), new TypeReference<List<Entitet>>() {
		});

		return entiteti;
	}

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
	
}
