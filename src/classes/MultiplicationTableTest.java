package classes;

/**
 * Created by jyheo on 2016-03-26.
 */
public class MultiplicationTableTest {
    public static void main(String[] args) {
        MultiplicationTable mtable = new MultiplicationTable();
        MultiplicationTable mtable9 = new MultiplicationTable();

        mtable.setMaxNumber(19);

        for (int i = 2; i <= mtable.getMaxNumber(); i++) {
            mtable.setNumber(i);
            mtable.printTable();
        }

        System.out.println("---------");

        for (int i = 2; i <= mtable9.getMaxNumber(); i++) {
            mtable9.setNumber(i);
            mtable9.printTable();
        }
    }
}
