public class Session {

    private Movie movie;
    private Room room;

    public Session(Movie movie, Room room) {
        this.movie = movie;
        this.room = room;
    }

    public String ToString(){
        return movie.getTitle() + " - Salle " + room.getNumber();
    }
}
