package com.creativa.archivos.readers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SimpleReadersFile {
	private String path;
	private File file;
	private List<String> lineas;
	
	public SimpleReadersFile(File file) {
		super();
		this.file = file;
		this.path = file.getAbsolutePath();
		lineas = new ArrayList<String>();
	}

	public SimpleReadersFile(String path) {
		this(new File(path));
	}
	
	public void readFile() {
		String line = null;
		FileInputStream stream = null;
		BufferedReader fileReader = null;
		
		try {
			stream = new FileInputStream(file);
			fileReader = new BufferedReader(new InputStreamReader(stream));
			line = fileReader.readLine();
			while(line != null) {
				lineas.add(line);
				line = fileReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if( stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	public String getPath() {
		return path;
	}

	public List<String> getLineas() {
		return lineas;
	}
	
}
