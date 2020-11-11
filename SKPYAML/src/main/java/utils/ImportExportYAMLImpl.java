package utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;


public class ImportExportYAMLImpl implements ImportExport{

	@Override
	public Object importFileToObject(String path, Class<?> classOf) {
		Yaml yaml = new Yaml();
		try {
			InputStream in = new FileInputStream(new File(path));
			Object o = yaml.loadAs(in, classOf);
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean exportObjectToFile(Object obj, String path) {
		try {
			ObjectMapper mapper = new ObjectMapper(new YAMLFactory().disable(Feature.WRITE_DOC_START_MARKER));
			String yaml = mapper.writeValueAsString(obj);
			stringToFile(path, yaml);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	private void stringToFile(String destinationPath, String data) {
		File file = new File("");
		// file = new File(file.getAbsolutePath() + destinationPath);
		file = new File(destinationPath);
		file.setWritable(true);

		try (FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			// convert string to byte array
			byte[] bytes = data.getBytes();
			// write byte array to file
			bos.write(bytes);
			bos.close();
			fos.close();
			System.out.print("Data written to file successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
