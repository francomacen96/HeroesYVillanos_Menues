package menues;


public class SubMenuReportes extends ItemSubMenu{
	public SubMenuReportes(String nombre) {
		super(nombre);
		super.opciones.add(new Op1Reportes("Listar combatientes que venzan a otro combatiente segun caracteristica"));
		super.opciones.add(new Op2Reportes("Listado por multiples caracteristicas"));
	}
	
	@Override
	public void ejecutarFuncion() {
		super.listarOpciones();
	}
	
	public void agregarBatalla(ItemAbstracto batalla) {
		super.add(batalla);
	}
	
	public void listarBatallas() {
		super.listarOpciones();
	}
}
