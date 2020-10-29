import static javax.swing.JOptionPane.showInputDialog;

class Dato1 {
    private int dag, måned, år;

    public Dato1( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

   public String toString(){
        // lag denne
        String ut = "Dag :"+dag+" Måned "+månedsnavn(måned) +" År"+år;
        return ut;
    }
}

class Bil{
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer

    // lag også konstruktør for alle attributtene

    // lag så en toString metode for å vise alle attributtene


  public  String typebetegnelse ;
  public Dato1 førstegangsregistrert;
  public String kjennetegn;

    public Bil(String typebetegnelse, Dato1 førstegangsregistrert, String kjennetegn) {
        this.typebetegnelse = typebetegnelse;
        this.førstegangsregistrert = førstegangsregistrert;
        this.kjennetegn = kjennetegn;
    }

    public String toString(){
      String ut =  "Typebetegnelse :"+typebetegnelse+" Førstegangsregistrert  :"
              +førstegangsregistrert+
              " Kjennetegn"+kjennetegn;

      return ut;
    }
}

public class MotorvognReg {

    public static void main(String[] args) {
        // opprett et array av Biler

        // Sett inn noen biler i arrayet

        // List motorvognregisteret (arrayet) ved hjelp av en løkke


        Bil bilarray [] = new Bil [3];
       Dato1 dato1 = new Dato1(1,1,2020);
        Bil bil1 = new Bil("Audi A6",dato1 ,"123456");

        Dato1 dato2 = new Dato1(1,5,2019);
        Bil bil2 = new Bil("Tesla s4 ",dato2,"54321");

       bilarray[0] = bil1;
        bilarray[1] = bil2;

        // et eksample på å fylle array med en for løkke
/*

      for ( int i = 0; i<bilarray.length; i++){
          String type =showInputDialog("Skriv inn typebetgenelse");
          String dag = showInputDialog("Skriv inn dag");
          String måned = showInputDialog("Skriv inn måned");
          String år = showInputDialog("Skriv inn år");
          String skillenummer = showInputDialog("Skriv inn skilleNummer");

          Dato dato = new Dato(Integer.parseInt(dag),Integer.parseInt( måned),Integer.parseInt( år));
          Bil bil = new Bil(type,dato,skillenummer);

          bilarray[i] = bil;

      }
*/

      for ( Bil bil : bilarray){
          System.out.println(bil);
      }

    }
}