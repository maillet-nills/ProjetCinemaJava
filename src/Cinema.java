import java.util.ArrayList;

public class Cinema {
    private String cityName;
    private ArrayList<Room> roomList;

    public Cinema(String cityName, ArrayList<Room> roomList) {
        this.cityName = cityName;
        this.roomList = roomList;
    }

    public void addRoom(Room room){
        this.roomList.add(room);
    }

    public void getSessions(){
        for (Room room : roomList){
            room.showSession();
        }
    }

    public String getCityName() {
        return cityName;
    }
}
