package basics.lines;

public class LineDemo {
    public static void main(String[] args) {
        Line line1 = new Line(40,'#');
        Line line2 = new Line(4, '-');
        Line line3 = new Line(10, 'V');

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        line1.print();
        line2.print();
        line3.print();
    }
}


/*   twórz klasę Linia. Obiekty tej klasy powinny mieć dwie
 cechy: długość i wypełnienie. W metodzie main stwórz 3
 obiekty linni i nadaj im różne długości i symbole
 wypełnienia. Następnie stwórz metodę void drukujLinie(),
  która ma drukować symbol ustawiony jako wypełnienie tyle
  razy, jaka jest ustawiona długość linii. np: przy
  ustawionej długości 6 i wypełnieniu "@" wydrukuje
  następującą linię:

@@@@@@

        Przy długości 20 i  wypełnieniu "*" powinna
        wydrukować linię:

        ********************

        wypełnienie -
        długość 4
*/

