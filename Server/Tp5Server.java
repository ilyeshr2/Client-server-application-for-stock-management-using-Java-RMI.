package Server;
import java.rmi.*;
import java.util.ArrayList;
public class Tp5Server {
	public static void main(String argv[]) {
		try {
			Tp5Impl obj=new Tp5Impl();
			java.rmi.registry.LocateRegistry.createRegistry(2000);
			Naming.rebind("//:2000/Tp5", obj);
			System.out.println("serveur en attene");
			ArrayList <Produit> pr=new ArrayList<>();
			pr=obj.getProduct();
			 for(int i=0 ; i<pr.size();i++) {
					System.out.println("produit : "+pr.get(i).nom+"  quantity: "+pr.get(i).quantite);
				}
		}catch(Exception e) {
			System.out.println("serveur erreur : "+e);
		}
		
		
	}
}
