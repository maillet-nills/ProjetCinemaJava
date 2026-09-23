import java.util.ArrayList;

public class Room {

    private int number;
    private int seatTotal;
    private ArrayList<Session> sessionList;

    public Room(int number, int seatTotal, ArrayList<Session> sessionList) {
        this.number = number;
        this.seatTotal = seatTotal;
        this.sessionList = sessionList;
    }


    public void addSession(Session session){
        this.sessionList.add(session);
    }

    public void showSession(){
        for(Session session : sessionList){
            System.out.println(session.ToString());
        }
    }

    public int getNumber() {
        return number;
    }
}