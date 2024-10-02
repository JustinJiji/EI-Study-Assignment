package Exercise2;

public class Rover {
    private int x, y;
    private Direction direction;
    private Grid grid;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void moveForward() {
        Position newPos = direction.move(x, y);
        if (grid.isValidPosition(newPos)) {
            this.x = newPos.getX();
            this.y = newPos.getY();
        } else {
            System.out.println("Obstacle detected or out of bounds!");
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public String getStatus() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction;
    }
}
