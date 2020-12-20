package interfaces;

import locations.Location;
import entities.Entity;

public interface Flyable {
    void flyUp();
    void changeAltitude(Diretion direction);
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
    enum Diretion{
        UP,
        DOWN
    }
}

