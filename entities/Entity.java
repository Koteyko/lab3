package entities;

import locations.Location;

import java.util.Objects;

public abstract class Entity {
    protected String name;
    protected Location currentLocation;

    public String getName() {
        return name;
    }
    public Location getLocation(){
        return currentLocation;
    }

    public Entity(){
        name = "undefined";
        currentLocation = Location.UNDEFINED;
    }
    public Entity(String name, Location location){
        this.name = name;
        currentLocation = location;
    }

    @Override
    public String toString(){
        return "Entity{" + "name=" + name + "}";
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
