package logic;

import java.util.Random;

public class Drake extends Mobile {
	public Boolean alive = true;
	public Boolean sleeping = false;

	public void kill() {
		alive = false;
	}

	public void setSleep(Boolean state) {
		sleeping = state;
	}

	public Boolean isAlive() {
		return alive;
	}

	public Boolean isSleeping() {
		return sleeping;
	}

	public void moveDrake(Maze m) {
		Random r = new Random();

		int p = r.nextInt(4);

		if (!isSleeping()) {
		switch (p) {
		// para a esquerda
		case 0:
			if (m.maze[y][x - 1] != 'X' && m.maze[y][x - 1] != 'S')
				move(0);
			break;
		// para a direita
		case 1:
			if (m.maze[y][x + 1] != 'X' && m.maze[y][x + 1] != 'S')
				move(1);
			break;
		// para a cima
		case 2:
			if (m.maze[y - 1][x] != 'X' && m.maze[y - 1][x] != 'S')
				move(2);
			break;
		// para a baixo
		case 3:
			if (m.maze[y + 1][x] != 'X' && m.maze[y + 1][x] != 'S')
				move(3);
			break;

		}
		}
		
		
		p = r.nextInt(10);

		switch (p) {
		// dormir
		case 0:
		case 1:
		case 2: setSleep(true);
				break;
		default : setSleep(false);
					break;
		

		}

	}

}
