import java.util.ArrayList;

public class CinemaComplex {

    private ArrayList<Cinema> cinemaList;

    public CinemaComplex(ArrayList<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }



    public void addCinema(Cinema cinema){
        this.cinemaList.add(cinema);
    }
}
