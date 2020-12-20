package entities;

import interfaces.ISimpleActions;
import locations.Location;

import java.util.Objects;

public class Human extends Entity implements ISimpleActions {

    @Override
    public void lookAt(Entity entity) {
        System.out.println(getName() + " окинул взглядом " + entity.getName());
    }
    @Override
    public void stand() {
        System.out.println(getName() + " стоит не шелохнувшись");
    }
    @Override
    public void waiting(String expectedEvent) {
        System.out.println(getName() + " ждёт " + expectedEvent);
    }

    @Override
    public void breathTaking() {
        System.out.println("У " + name + " захватило дух");
    }


    public Human(String name, Location location){
        super(name, location);
    }
    public Human(){
        super("unnamed person", Location.UNDEFINED);
    }

    @Override
    public String toString(){
        return "Human{" + "name=" + getName() + ", currentLocation=" + currentLocation.toString() +"}";
    }
    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Human human = (Human) object;
        return name == human.getName();
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
