# Mars Rover Simulation

## Overview

This project implements a console-based Mars Rover simulation using object-oriented programming principles, design patterns. The Rover navigates a grid-based terrain, following a series of commands to move forward, turn left, or turn right, while avoiding obstacles.

## Class Structure

- **`Rover.java`**: Represents the Mars Rover, handling its movement and direction.
- **`Command.java`**: Command interface for implementing various rover commands.
  - **`MoveCommand.java`**: Handles forward movement.
  - **`TurnLeftCommand.java`**: Handles left turns.
  - **`TurnRightCommand.java`**: Handles right turns.
- **`Direction.java`**: Enum representing the four possible directions (N, S, E, W) and their corresponding movement and rotation logic.
- **`Grid.java`**: Represents the 10x10 grid and manages obstacle detection and boundary enforcement.
- **`Position.java`**: Represents a specific (x, y) coordinate on the grid.
- **`Main.java`**: Entry point of the application, where the grid, rover, and commands are initialized and executed.