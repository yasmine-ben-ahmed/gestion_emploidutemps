// Déclare le package dans lequel cette classe se trouve
package emploiDuTemps_java;

// Importation des classes nécessaires pour la gestion de la connexion à la base de données
import java.sql.Connection;
import java.sql.DriverManager;

public class Conneccion {
    // Déclare une variable membre pour stocker l'objet de connexion
    Connection cn;

    // Constructeur de la classe Conneccion
    public Conneccion(){
        try {
            // Charge la classe du driver MySQL
            Class.forName("com.mysql.jdbc.Driver");

            // Établit la connexion à la base de données avec les paramètres URL, utilisateur et mot de passe
            cn = DriverManager.getConnection("jdbc:mysql://localhost/emploidutemps_db", "root", "");
            System.out.println("Connection établie!");
        } catch (Exception e) {
            // Capture les exceptions et affiche un message d'erreur si la connexion échoue
            System.out.println("non connectée!");
        }
    }

    // Méthode pour récupérer l'objet Connection afin de l'utiliser ailleurs dans le programme
    public Connection laConnection() {
        return cn;
    }
}
