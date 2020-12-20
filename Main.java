import entities.Carlson;
import entities.Human;
import interfaces.Flyable;
import locations.Location;

public class Main {
    public static void main(String[] args) {
        Carlson carlson = new Carlson();
        Human kid = new Human("Малыш", Location.ROOM);

        carlson.lookAt(kid); //Карлсон окинул Малыша внимательным, долгим взглядом
        carlson.changeAltitude(Flyable.Diretion.UP); //Набрав высоту
        carlson.flyAround(Location.ROOF); //сделал небольшой круг над крышей
        carlson.flyAround(Location.PIPE); //облетел вокруг трубы
        carlson.flyTo(Location.WINDOW); //повернул назад, к окну
        carlson.changeSpeed(1); //прибавил скорость
        carlson.flyAround(kid); //пронесся мимо Малыша
        for(int i=0; i<2; i++)carlson.flyAround(Location.ROOF); //Потом сделал второй круг. Потом третий
        kid.stand(); //Малыш стоял не шелохнувшись
        kid.waiting("что будет дальше"); //ждал, что будет дальше
        kid.breathTaking(); //У него просто дух захватило
    }
}
