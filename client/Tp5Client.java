package Client;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Scanner;

public class Tp5Client {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			Tp5Interface opr=(Tp5Interface) Naming.lookup("//:2000/Tp5");
			Scanner s=new Scanner(System.in);
			int nbr;
			System.out.println("pour voir la liste des produit entrer 1  \\n pour addition d'un produitentrer  2\\n pour suppression d'un produit entrer 3\\n");
			System.out.println("pour ajouter une quantity d'un produit entrer 4  \\n pour supprimer une qauntity d'un produit  entrer  5\\n ");
			nbr=s.nextInt();
			switch(nbr) {
			case 1:
				ArrayList <Produit> produitlist=new ArrayList<>();
				produitlist=opr.getProduct();
				for(int i=0 ; i<produitlist.size();i++) {
					System.out.println("produit : "+produitlist.get(i).nom+"  quantity: "+produitlist.get(i).quantite);
				}
				break;
			case 2:
				System.out.println(" donner le nom du produit ");
				String nom=s.next();
				System.out.println(" donner la quantite du produit ");
				int quantity=s.nextInt();
				opr.addProduct(nom, quantity);
				break; 
			case 3:
				System.out.println(" donner le nom du produit ");
				String name=s.next();
			
				opr.removeProduct(name);
				break;
			case 4:
				System.out.println(" donner le nom du produit ");
				String nom2=s.next();
				System.out.println(" donner la quantite du produit ");
				int quantite=s.nextInt();
				opr.addQuantityProduct(nom2, quantite);
				break;
			case 5:
				System.out.println(" donner le nom du produit ");
				String nom3=s.next();
				System.out.println(" donner la quantite du produit ");
				int quantite3=s.nextInt();
				opr.removeQuantityProduct(nom3, quantite3);
				break;
			}
		}catch(Exception e){
			System.out.println(" erreur  client : "+e);
		}

	}

}
