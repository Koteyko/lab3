package locations;

public enum Location {
    ROOF("крыша"),
    PIPE("труба"),
    WINDOW("окно"),
    ROOM("комната"),
    UNDEFINED("неопределено");

    private String location;

    Location(String location){
        this.location = location;
    }

    @Override
    public String toString(){
        return location;
    }
}
