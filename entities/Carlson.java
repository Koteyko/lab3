package entities;

import interfaces.Flyable;
import locations.Location;

import java.util.Objects;

public class Carlson extends Human implements Flyable {
    private FlyMode flyMode;

    //----------------Flyable methods-------------------------
    @Override
    public void flyUp() {
        if(flyMode == FlyMode.ON_GROUND) flyMode = FlyMode.FLOATING;
    }

    @Override
    public void changeAltitude(Direction direction) {
        if     (direction == Direction.UP)                                   System.out.println(name + " набрал высоту");
        else if(direction == Direction.DOWN && flyMode != FlyMode.ON_GROUND) System.out.println(name + " снизил высоту");
    }

    @Override
    public void flyTo(Location location) {
        if(location == Location.UNDEFINED) throw new RuntimeException("Объекту " + name + " не удалось перейти в несуществующую локацию");
        flyMode = FlyMode.FLYING;
        currentLocation = location;
        System.out.println(name + " полетел к " + location.toString());
    }
    @Override
    public void flyTo(Entity entity) {
        flyTo(entity.getLocation());
    }

    @Override
    public void flyAround(Location location) {
        if(currentLocation != location) flyTo(location);
        System.out.println(name + " облетел " + location.toString());
    }

    @Override
    public void flyAround(Entity entity) {
        System.out.println(name + " пронёсся мимо " + entity.getName());
    }

    @Override
    public void changeSpeed(int number) {
        if(number > 0) System.out.println(name + " прибавил скорость");
        else if(number < 0) System.out.println(name + " снизил скорость");
    }

    //----------------Constructor------------------------------
    public Carlson() {
        super("Карлсон", Location.WINDOW);
        flyMode = FlyMode.FLOATING;
    }
    //---------------------------------------------------------
    @Override
    public String toString(){
        return "Carlson{" + "name=" + name + ", currentLocation=" + currentLocation.toString() + ", flyMode=" + flyMode + "}";
    }
    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Carlson impostor = (Carlson) object;
        return name == impostor.getName();
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
