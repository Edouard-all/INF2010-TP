import java.util.Random;

// Ennemi #1
public class Goblin {
	
	private Random rand = new Random(globalId);

	public Goblin() {

	}

	public void runIteration(World world, EventManager em) {
		
		final Vec2[] POSSIBLE_DIR = {
				new Vec2(0,-1),
				new Vec2(0,1),
				new Vec2(-1,0),
				new Vec2(1,0),
		};
		if (rand.nextInt(10) < 7)
		{
	        // TODO: Déplacer l'unité dans la direction POSSIBLE_DIR[rand.nextInt(4)].
		}
		else
		{
		    // TODO: Tirer dans la direction POSSIBLE_DIR[rand.nextInt(4)].
		}
		
	}
}
