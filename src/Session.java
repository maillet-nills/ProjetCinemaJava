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

    public void reservation(){
        if (seatTotal>0){
            this.seatTotal-=1;
            System.out.println("Vous avez reservé 1 place ! ");
        }
        else{
            System.out.println("Il ne reste pas assez de places !");
        }
    }
    public void reservation(int seatAmount){
        if (seatAmount<=seatTotal){
            this.seatTotal-=seatAmount;
            System.out.println("Vous avez reservé "+seatAmount+" places."+" Il reste donc "+seatTotal+" places!");
        }
        else{
            System.out.println("Il ne reste pas assez de places pour le nombres que vous avez demandé");
        }
    }

}
