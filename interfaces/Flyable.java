package interfaces;

import locations.Location;
import entities.Entity;

public interface Flyable {
    void flyUp();
    void changeAltitude(Direction direction);
    void flyTo(Location location);
    void flyTo(Entity entity);
    void flyAround(Location location);
    void flyAround(Entity entity);
    void changeSpeed(int number);

    enum FlyMode{
        ON_GROUND,
        FLOATING,
        FLYING,
    }
    enum Direction{
        UP,
        DOWN
    }
}

