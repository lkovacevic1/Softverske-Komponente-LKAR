package utils;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import exportdb.DBExporter;
import exportdb.Entitet;


public class ImportExportJSONImpl extends DBExporter{

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
				return e;
			}
		}
		return null;
	}

}
