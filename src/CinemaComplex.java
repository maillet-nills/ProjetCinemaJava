import java.util.ArrayList;

public class CinemaComplex {

    private ArrayList<Cinema> cinemaList;

    public CinemaComplex(ArrayList<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    public void showSessions(){
        getSessions();
    }

    private void getSessions(){
        for (Cinema cinema : cinemaList){
            System.out.println("### " + cinema.getCityName() + " ###");
            cinema.getSessions();
            System.out.println("");
        }
    }

    public void addCinema(Cinema cinema){
        this.cinemaList.add(cinema);
    }
}
