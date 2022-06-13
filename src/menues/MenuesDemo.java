package menues;

public class MenuesDemo {
	
	public static void main(String[] args) {
		MenuPrincipal menu = MenuPrincipal.getInstance("El senior de los anillos"); //@todo make menuPrincipal un SubMenuItem
		//menu.agregarOpciones(new ItemSimple("Opcion1"));
		//menu.agregarOpciones(new ItemSimple("Opcion2"));
		//menu.agregarOpciones(new ItemSimple("Opcion3"));
		//menu.agregarOpciones(new ItemSimple("Opcion4"));
		
		// -- Batallar
		SubMenuBatallar subMenuBatallar = new SubMenuBatallar("Batallar"); 
		//ItemAbstracto opcionSalir = new ItemSimple("Salir","saliendo");
		
		menu.agregarOpciones(subMenuBatallar);
		
		menu.listarOpciones();
		subMenuBatallar.ejecutarFuncion(); //cuando se convierta menu principal a un submenu, se podra hacer menu.getOpcion("Batallar").ejecutarFuncion().
		//opcionSalir.ejecutarFuncion();
		
		//crear un item reportes para agregar a cad aun de las opciones de Reportar. Crear clase reportar heredada de ItemSimple.
	}
}
