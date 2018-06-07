package com.example.pawel.projekt_appmob.um;

public class Um {


    public static String[] Title = new String[]{
      "Temperatura + linie powieszchni",
      "Ciśnienie",
            "Opady",
            "Burze",
            "Wiatr",
            "Maksymalny poryw wiatru",
            "Widizlaność",
            "Mgła",
            "Zachmurzenie ogólne"

    };

    public static String[] Description = new String[]{
            "wykaz temeperatury oraz kierunek przepływu",
            "Cisnienie zredukowane do poziomu morza",
            "maksymalna odbiciowość",
            "Prawdopodobieństwo wystapienia wyładowań atmosferyczanych",
            "Uśredniony wskaźnik wiartru na wysokości 10m oraz kierunek",
            "Maksymalny poryw wiatru",
            "maksymalna widzialnośc wyrażona w km",
            "Indeks mgły",
            "Piętro niskie, średnie i wysokie"
    };
    public static String[] Link = new String[]{
    "http://www.meteo.pl/um/php/pict_show.php?cat=1&time=0",
                "http://www.meteo.pl/um/php/pict_show.php?cat=0&time=0",
                "http://www.meteo.pl/um/php/pict_show.php?cat=3&time=1",
                "http://www.meteo.pl/um/php/pict_show.php?cat=4&time=1",
                "http://www.meteo.pl/um/php/pict_show.php?cat=5&time=0",
                "http://www.meteo.pl/um/php/pict_show.php?cat=6&time=1",
                "http://www.meteo.pl/um/php/pict_show.php?cat=7&time=0",
                "http://www.meteo.pl/um/php/pict_show.php?cat=8&time=0",
                "http://www.meteo.pl/um/php/pict_show.php?cat=15&time=0"
};


    public Um( String[] Title, String[] Description, String[] Link){
        this.Title=Title;
        this.Description=Description;
        this.Link=Link;
    }


    public static String[] getTitle() {
        return Title;
    }

    public static String[] getDescription() {
        return Description;
    }

    public static String[] getLink() {
        return Link;
    }
}