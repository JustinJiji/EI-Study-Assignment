package Exercise2;

public enum Direction {
    N, E, S, W;

    public Direction turnLeft() {
        return values()[(ordinal() + 3) % 4];
    }

    public Direction turnRight() {
        return values()[(ordinal() + 1) % 4];
    }

    public Position move(int x, int y) {
        switch (this) {
            case N: return new Position(x, y + 1);
            case E: return new Position(x + 1, y);
            case S: return new Position(x, y - 1);
            case W: return new Position(x - 1, y);
        }
        return null;
    }
}
