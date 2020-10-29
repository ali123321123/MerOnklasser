import java.util.ArrayList;

class Ansatt{
    //	opprett	3	attributter
    //	navn,	født	og	tiltrådt,	de	to	siste	skal	være	av	type	Dato.

    //	opprett	også	en	konstruktør	for	disse
    //	lag	også	en	toString-metode	for	klassens	attributter

    public String navn;
    public Dato født;
    public Dato tiltrådt;

    public Ansatt(String navn, Dato født, Dato tiltrådt) {
        this.navn = navn;
        this.født = født;
        this.tiltrådt = tiltrådt;
    }

    public String toString(){
      return  "Navn : "+navn+" født "+født + "tiltrådt : "+tiltrådt;

    }
}
class Dato {
    private int dag,	måned,	år;
    public Dato(	int dag,	int måned,	int år	)	{
        this.dag =	dag;
        this.måned =	måned;
        this.år =år;
    }
    private static String	månedsnavn(	int mnd	)	{
        String[]	navn	=	{	"januar",	"februar",	"mars",	"april",	"mai",
                "juni",	"juli",	"august",	"september",	"oktober",	"november",
                "desember" };
        if (	mnd	>	0	&&	mnd	<	13	)
            return navn[	mnd	- 1	];
        else
            return "ukjent	måned";
    }

    public String toString(){

        return dag+" "+månedsnavn(måned)+" "+år;

    }

    //	skriv	en	toString	metode	slik	at	datoen	kommer	ut	på	følgende	format:
    //	dd	månedsnavn	år,	f.eks	1	januar	2019

}
public class Eksamen2018 {
    public static void main(String[]	args)	{
        //	opprett	en	ArrayListe	og	legg	to	ansatte	inn	i	denne
        //	skriv	så	alt	innholdet	i	arrraylisten	ut	på	system.out.

        ArrayList<Ansatt> ansattArrayList = new ArrayList<>();
        Dato født = new Dato(1,1,1990);
        Dato tiltrådt = new Dato(1,1,2010);

       Ansatt ansatt1 = new Ansatt("Per hansen",født,tiltrådt);
        ansattArrayList.add(ansatt1);


        Dato født1 = new Dato(1,1,1989);
        Dato tiltrådt1 = new Dato(1,1,2013);

        Ansatt ansatt2 = new Ansatt("Ola hansen",født1,tiltrådt1);
        ansattArrayList.add(ansatt2);
     //   ansattArrayList.add(new Ansatt("Per hansen",født,tiltrådt))

        for(Ansatt ansatt : ansattArrayList){
            System.out.println(ansatt);
        }



    }
}