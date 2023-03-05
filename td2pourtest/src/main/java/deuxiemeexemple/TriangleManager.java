package deuxiemeexemple;

public class TriangleManager {
	 /**
     * Cette fonction statique reçoit en paramètres les longueurs des côtés d'un triangle
     * et retourne un code 0 si le triangle est invalide, 1 si le triangle est équilatéral,
     * 2 si le triangle est isocèle et 3 pour un triangle valide quelconque (ni isocèle, ni équilatéral).
     * @param a La longueur du premier côté du triangle.
     * @param b La longueur du deuxième côté du triangle.
     * @param c La longueur du troisième côté du triangle.
     * @return Un entier correspondant au code du type de triangle.
     */

    public static int triangle(double a, double b, double c) {
    	  // Vérification des conditions d'existence d'un triangle
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            return 0; // Le triangle est invalide
         }
        else if (a == b && b == c) {
            return 1; // Le triangle est équilatéral
        }
        else if (a == b || b == c || a == c) {
            return 2; // Le triangle est isocèle
        } 
        else {  return 3; // Le triangle est quelconque    
        }
        
    
        

       
    }


}
