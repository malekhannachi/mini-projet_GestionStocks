package Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Article {

	private int numRef;
	private String nom;
	private double prix;
	private int qte;

	public Article() {
	}

	public Article(int numRef, String nom, double prix, int qte) {
		this.numRef = numRef;
		this.nom = nom;
		this.prix = prix;
		this.qte = qte;
	}

	public int getNumRef() {
		return numRef;
	}

	public void setNumRef(int numRef) {
		this.numRef = numRef;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public String toString() {
		String info = "N° Reference : " + this.numRef + "\nNom : " + this.nom + "\nPrix : " + this.prix
				+ "\nQuantité : " + this.qte;
		return info;
	}

	public static void afficherTous(ArrayList<Article> list) {
		for (Article a : list) {
			System.out.println("-----------");
			System.out.println(a);
			System.out.println("-----------");
		}
	}

	public static void rechercheParReference(int ref, ArrayList<Article> list) {
		boolean trouve = false;
		for (Article a : list) {
			if (a.numRef == ref) {
				trouve = true;
				System.out.println(a);
				break;
			}
		}
		if (trouve == false) {
			System.out.println("Article introuvable");
		}
	}

	public static void rechercheParNom(String nom, ArrayList<Article> list) {
		boolean trouve = false;
		for (Article a : list) {
			if (a.nom.equals(nom)) {
				trouve = true;
				System.out.println(a);
				break;
			}
		}
		if (trouve == false) {
			System.out.println("Article introuvable");
		}
	}

	public static void rechercheParIntervalleDePrix(double pmin, double pmax, ArrayList<Article> list) {
		boolean trouve = false;
		for (Article a : list) {
			if ((a.prix >= pmin) && (a.prix <= pmax)) {
				trouve = true;
				System.out.println(a);
			}
		}
		if (trouve == false) {
			System.out.println("Aucun article trouvé !");
		}
	}

	public static void supprimer(int ref, ArrayList<Article> list) {
		boolean trouve = false;
		for (Article a : list) {
			if (a.numRef == ref) {
				trouve = true;
				list.remove(a);
				System.out.println("Article supprimé !");
				break;
			}
		}
		if (trouve == false) {
			System.out.println("Article introuvable");
		}
	}

	public static void ajouter(int ref, ArrayList<Article> list) {
		Scanner sc = new Scanner(System.in);
		boolean trouve = false;
		for (Article a : list) {
			if (a.numRef == ref) {
				trouve = true;
				System.out.println("Article Existe Deja !");
				break;
			}
		}
		if (trouve == false) {
			System.out.print("Donner le nom de l'article : ");
			String nom = sc.nextLine();
			System.out.print("Donner le prix : ");
			double prix = sc.nextDouble();
			System.out.print("Donner la quantité : ");
			int qte = sc.nextInt();
			list.add(new Article(ref, nom, prix, qte));
			System.out.println("Article Ajouté !");
		}
	}

	public static void modifier(int ref, ArrayList<Article> list) {
		Scanner sc = new Scanner(System.in);

		boolean trouve = false;
		for (Article a : list) {
			if (a.numRef == ref) {
				trouve = true;
				int choix;
				System.out.println("1 - Modifier le nom");
				System.out.println("2 - Modifier le prix");
				System.out.println("3 - Modifier la quantité");
				System.out.print("Donner votre choix : ");
				choix = sc.nextInt();

				switch (choix) {
				case 1:
					System.out.print("Donner le nom de l'article : ");
					sc.nextLine();
					a.nom = sc.nextLine();
					System.out.println("Article modifié !");
					break;
				case 2:
					System.out.print("Donner le prix : ");
					a.prix = sc.nextDouble();
					System.out.println("Article modifié !");
					break;
				case 3:
					System.out.print("Donner la quantité : ");
					a.qte = sc.nextInt();
					System.out.println("Article modifié !");
					break;
				default:
					System.out.println("Choix invalide");
					break;
				}
				break;
			}
		}
		if (trouve == false) {
			System.out.println("Article introuvable");
		}
	}

}
