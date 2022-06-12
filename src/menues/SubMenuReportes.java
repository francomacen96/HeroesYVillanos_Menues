package menues;


public class SubMenuReportes extends ItemSubMenu{
	public SubMenuReportes(String nombre) {
		super(nombre);
		super.opciones.add(new ItemSimple("Listar combatientes que venzan a otro combatiente segun caracteristica"));
		super.opciones.add(new ItemSimple("Listado por multiples caracteristicas"));
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
