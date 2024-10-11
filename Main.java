
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Producto> listaProductos = new ArrayList<>();
		
		listaProductos.add(new Producto("Zapatos", 250000.0, 20));
		listaProductos.add(new Producto("Camisas", 80000.0, 10));
		listaProductos.add(new Producto("Busos", 200000.0, 60));
		listaProductos.add(new Producto("Pantalones", 100000.0, 55));
		listaProductos.add(new Producto("Chaquetas", 150000.0, 13));
	

		
		for(Producto emp: listaProductos) {
			emp.mostrarProducto();
			System.out.println("-----------------------");
		}
		
		listaProductos.get(1).setCantidadStock(50);
		
		listaProductos.remove(2);
		
		System.out.println("\nProductos Actualizados\n--------------------");
		
		for(Producto emp: listaProductos) {
			emp.mostrarProducto();
			System.out.println("--------------------");
		}
		
		String busquedaProducto = JOptionPane.showInputDialog("Ingresa el nombre del producto que quiere encontrar: ");
		
		boolean productoEncontrado= false;
		
		for(Producto nombreProducto : listaProductos) {
			if(nombreProducto.getNombre().equals(busquedaProducto)) {
				System.out.println("\nEl producto buscado ha sido encontrado con éxito\n");
				nombreProducto.mostrarProducto();
				productoEncontrado = true;
				break;
			}
		}
			
		
		if(!productoEncontrado) {
			System.out.println("El producto buscado no existe");
		}
		}
	}