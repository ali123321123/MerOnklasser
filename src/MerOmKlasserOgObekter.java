import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Student {
    public int id ;
    public String navn;
    public String enavn;

    public static String skolenavn;

    public Student(int id, String navn, String enavn) {
        this.id = id;
        this.navn = navn;
        this.enavn = enavn;

    }





   @Override
    public String toString() {
        return
                "id=" + id +
                ", navn='" + navn + '\'' +
                ", enavn='" + enavn + " Skole "+ skolenavn +'\'' ;
    }
}




public class MerOmKlasserOgObekter {
    public static void main(String[] args) {
        Student.skolenavn="Oslomet";
        Student student1 = new Student(1,"Per","Hansen");
        Student student2 = new Student(2,"Ola","Olsen");
        Student student3 = new Student(3,"Ali","Zedan");




        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);















    }
}
