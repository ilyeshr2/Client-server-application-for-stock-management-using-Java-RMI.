package Server;
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
public class Tp5Impl extends  UnicastRemoteObject implements Tp5Interface {
	
	public static ArrayList <Produit> pr=new ArrayList<>();
	public Tp5Impl() throws RemoteException{
		pr.add((new Produit("Samsung S21 Ultra",30)));
	pr.add(new Produit("iphone 13 pro max",25));
	}
	public  void addQuantityProduct(String nom,int quantity ) throws RemoteException{
		for(int i=0;i<pr.size();i++) {
			if(pr.get(i).nom.equals(nom))
		pr.set(i,new Produit(pr.get(i).nom,pr.get(i).quantite+quantity)); }
	}
	public  void removeQuantityProduct(String nom , int quantity) throws RemoteException{
		for(int i=0;i<pr.size();i++) {
			if(pr.get(i).nom.equals(nom))
		pr.set(i,new Produit(pr.get(i).nom,pr.get(i).quantite-quantity)); }
	
		
	}
	public    void removeProduct(String nom) throws RemoteException{
		for(int i=0;i<pr.size();i++) {
			if(pr.get(i).nom.equals(nom))
		pr.remove(i); }
	}
	public  void addProduct(String nom , int quantity ) throws RemoteException{
		pr.add(new Produit(nom,quantity));
	}
	 public int getQuantiteProduct(String nom) throws RemoteException{
		 return pr.get(pr.indexOf(nom)).quantite;
	 }
	 public  ArrayList<Produit> getProduct() throws RemoteException{
		
		 return pr;
	 }
	

}
