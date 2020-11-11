package utils;

import java.util.List;

public interface ImportExport {

	Object importFileToObject(String path, Class<?> classOf);

	boolean exportObjectToFile(Object obj, String path);
	
}
