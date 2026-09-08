
public class Projectile {
	
	public Projectile() {
		
	}
	
	public void runIteration(World world, EventManager em) {
      	
		boolean isOut = false;
		boolean hasCollided = false;
        // TODO: Détection de collision (si une case est occupé).        
		
		if (isOut)
		{
			// TODO: Détruire le projectile.
			return;
		}
			
		
		if (hasCollided) {		        
	        // TODO: Trouver une façon d'appliquer du dommage à un objet, puis détruire le projectile.
	        //       Astuce: implémenter une méthode de conversion "asDamageable".
		} else {
            // TODO: Déplacer le projectile.
		}
	}	
}
