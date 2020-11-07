package utils;

import java.util.List;

public interface ImportExport {

	List<Entitet> importFileToObject(String path) throws Exception;

	boolean exportObjectToFile(List<Entitet> entiteti, String path) throws Exception;
	
	Entitet selectDataByID(int id, List<Entitet> entiteti) throws Exception;
	
	Entitet selectDataByID(int id) throws Exception;

}
