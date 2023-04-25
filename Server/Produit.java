package Server;
import java.io.Serializable;
public class Produit implements Serializable{
String nom;
int quantite;

Produit(String nom,int quantite){
	this.nom=nom;
	this.quantite=quantite;

	
}
}
