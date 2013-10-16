package com.creativa.archivos.readers;

import java.util.ArrayList;
import java.util.List;

import com.creativa.archivos.beans.ProyectoFinal;

public class ProyectoFinalReadersFile extends SimpleReadersFile {
	private List<ProyectoFinal> proyectoFinal;
	
	public ProyectoFinalReadersFile (String path){
		super(path);
		proyectoFinal = new ArrayList<ProyectoFinal>();
	}
	@Override
	public void readFile(){
		super.readFile();
		for(String linea : getLineas()){
			String[] datos = linea.split(";");
			proyectoFinal.add(new ProyectoFinal(datos[0], (datos[1]),(datos[2])));
	}
	}
	public List<ProyectoFinal> getProyectoFinals(){
		return this.proyectoFinal;
	}

}
	
