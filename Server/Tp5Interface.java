package Server;
import java.rmi.*;
import java.util.ArrayList;
public interface Tp5Interface extends Remote {
	public  void addQuantityProduct(String nom,int  quantity ) throws RemoteException;
	public  void addProduct(String nom , int quantity ) throws RemoteException;
	public    void removeQuantityProduct(String nom,int quantity) throws RemoteException;
	public    void removeProduct(String nom) throws RemoteException;
	    public  ArrayList getProduct() throws RemoteException;
	    public int getQuantiteProduct(String nom) throws RemoteException;
	    
}
