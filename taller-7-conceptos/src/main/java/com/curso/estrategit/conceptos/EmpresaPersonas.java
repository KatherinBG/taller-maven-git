package com.curso.estrategit.conceptos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class EmpresaPersonas {

	public static void main(String[] args) {
		
		HashMap<String, HashMap<String, Long>> empresa = new HashMap<String,HashMap<String, Long>>();
		HashMap<String, Long> empleado = new HashMap<String,Long>();
		empleado.put("Jens Wong", new Long(5));
		empleado.put("Jens kenny", new Long(4));
		empresa.put("Estrategit", empleado);	
		HashMap<String, Long> empleadosCorlasosa = new HashMap<String,Long>();
		empleadosCorlasosa.put("Steven", new Long(20));
		empleadosCorlasosa.put("Katherine", new Long(21));
		empresa.put("Corlasosa", empleadosCorlasosa);
		
			
		
		for (Entry<String, HashMap<String, Long>> reg : empresa.entrySet()) {
			System.out.println("La Empresa: "  + reg.getKey());
			for(Entry<String, Long> emple : reg.getValue().entrySet() ) {
				System.out.println("Empleado :" + emple.getKey() + " Edad:" + emple.getValue() );
			}
		}
}}