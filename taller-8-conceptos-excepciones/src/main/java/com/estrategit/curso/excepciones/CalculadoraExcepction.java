package com.estrategit.curso.excepciones;

public class CalculadoraExcepction extends Exception{

	
	private static final String ERROR_DESCONOCIDO = "Error desconocido";

	private static final String ERROR_GENERAL_DEL_SISTEMA = "Error general del sistema";

	private static final String CODIGO_DEFECTO = "000";

	private static final long serialVersionUID = 1L;
	
	private String codigoTecnico;
	private String mensaje;
	
	public CalculadoraExcepction() {
		super(CODIGO_DEFECTO+"-"+ERROR_GENERAL_DEL_SISTEMA);
		codigoTecnico=CODIGO_DEFECTO;
		mensaje=ERROR_GENERAL_DEL_SISTEMA;
		
	}
         public CalculadoraExcepction(String codigo) {
        	 codigoTecnico=codigo;
        	 mensaje=ERROR_DESCONOCIDO;
         }
         
         public CalculadoraExcepction(String codigo,String mensaje) {
        	 super(codigo +" - "+ mensaje);
        	 codigoTecnico=codigo;
        	 this.mensaje=mensaje;
        	 
         }
		public String getCodigoTecnico() {
			return codigoTecnico;
		}
		public String getMensaje() {
			return mensaje;
		}

}
