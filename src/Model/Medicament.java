package Model;

public class Medicament {
    private  final String id;
    private  final String nom;
    private final String type;
    private  final String prix;

    public Medicament(String id, String nom, String type, String prix) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.prix = prix;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public String getPrix() {
        return prix;
    }
}
