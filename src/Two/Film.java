package Two;

public class Film {

    private String filmTitel;
    private int udgivelsesYear;
    private producer producer;


    public Film(String filmTitel, int udgivelsesYear) {
        this.filmTitel = filmTitel;
        this.udgivelsesYear = udgivelsesYear;
    }

    public Film(String filmTitel) {
        this.filmTitel = filmTitel;
        udgivelsesYear = 2023;
    }

    public void setProducer(producer producer) {
        this.producer = producer;
    }


}
