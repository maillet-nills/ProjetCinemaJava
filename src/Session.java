public class Session {

    private Movie movie;
    private Room room;
    private int seatTotal;

    public Session(Movie movie, Room room) {
        this.movie = movie;
        this.room = room;
        this.seatTotal= room.getSeatTotal();
    }

    public String ToString(){
        return movie.getTitle() + " - Salle " + room.getNumber();
    }
}
