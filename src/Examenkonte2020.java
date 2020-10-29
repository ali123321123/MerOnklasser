class Bok {
    private String tittel ;
    private Forfatter forfatter;

    public Bok(String tittel, Forfatter forfatter) {
      /*  this.tittel = tittel;
        this.forfatter = forfatter;*/

        setForfatter(forfatter);
        setTittel(tittel);
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public Forfatter getForfatter() {
        return forfatter;
    }

    public void setForfatter(Forfatter forfatter) {
        this.forfatter = forfatter;
    }

    public String toString(){

        String ut = "Tiitel :"+getTittel() +" Forfatter "+getForfatter();
        return ut ;

    }
}

class Forfatter{

    private String navn ;
     private String født ;


    public Forfatter(String navn, String født) {
        this.navn = navn;
        this.født = født;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFødt() {
        return født;
    }

    public void setFødt(String født) {
        this.født = født;
    }

    public String toString(){
        String ut = "Navn : "+ navn +" født "+født;
        return ut ;

    }
}




public class Examenkonte2020 {
    public static void main(String[] args) {
        Forfatter forfatter = new Forfatter("Per hansen","1/1/1990");
        Bok bok1 = new Bok("bok1",forfatter);
        Bok bok2 = new Bok("bok2",forfatter);


        System.out.println(bok1);
        System.out.println(bok2);

    }
}
