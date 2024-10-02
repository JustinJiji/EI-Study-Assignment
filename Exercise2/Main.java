package Exercise2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define grid with obstacles
        List<Position> obstacles = Arrays.asList(new Position(2, 2), new Position(3, 5));
        Grid grid = new Grid(10, 10, obstacles);

        // Initialize rover
        Rover rover = new Rover(0, 0, Direction.N, grid);

        // Create commands
        Command moveForward = new MoveCommand(rover);
        Command turnLeft = new TurnLeftCommand(rover);
        Command turnRight = new TurnRightCommand(rover);

        // Execute command sequence
        List<Command> commands = Arrays.asList(moveForward, moveForward, turnRight, moveForward, turnLeft, moveForward);
        for (Command command : commands) {
            command.execute();
        }

        // Final status
        System.out.println(rover.getStatus());
    }
}

