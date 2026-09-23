//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    CinemaComplex patheCinemaComplex = new CinemaComplex(new ArrayList<Cinema>());

    Cinema toulouse = new Cinema("Toulouse", new ArrayList<Room>());
    Cinema muret = new Cinema("Muret", new ArrayList<Room>());

    patheCinemaComplex.addCinema(toulouse);
    patheCinemaComplex.addCinema(muret);

    Room toulouseR1 = new Room(1, 20, new ArrayList<Session>());
    Room toulouseR2 = new Room(2, 20, new ArrayList<Session>());

    toulouse.addRoom(toulouseR1);
    toulouse.addRoom(toulouseR2);

    Room muretR1 = new Room(1, 20, new ArrayList<Session>());
    Room muretR2 = new Room(2, 20, new ArrayList<Session>());

    muret.addRoom(muretR1);
    muret.addRoom(muretR2);

    Movie movie1 = new Movie(
            "Le Seigneur des anneaux : La Communauté de l'Anneau",
            "Peter Jackson",
            Duration.ofHours(2).plusMinutes(58)
    );

    Movie movie2 = new Movie(
            "Resident Evil",
            "Zach Cregger",
            Duration.ofHours(1).plusMinutes(34)
    );
    Movie movie3= new Movie(
            "Cars",
            "John Lasseter",
            Duration.ofHours(1).plusMinutes(56)
    );

    Movie movie4= new Movie(
            "F1 Movie",
            "Joseph Kosinski",
            Duration.ofHours(2).plusMinutes(35)
    );


    Session session1 = new Session(movie1, muretR1);
    Session session2 = new Session(movie2, muretR2);
    Session session3 = new Session(movie3, toulouseR1);
    Session session4 = new Session(movie4, toulouseR2);

    muretR1.addSession(session1);
    muretR2.addSession(session2);
    toulouseR1.addSession(session3);
    toulouseR2.addSession(session4);


    patheCinemaComplex.showSessions();


    session3.reservation(5);
    session4.reservation();
    session1.reservation(31);
    session2.reservation(20);
    session2.reservation();
}
