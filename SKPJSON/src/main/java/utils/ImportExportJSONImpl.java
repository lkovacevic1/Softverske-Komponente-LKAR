package utils;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ImportExportJSONImpl implements ImportExport {

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
