/**
 * Class Main sebagai entry point program BMI Calculator
 * Program ini menghitung dan menampilkan BMI untuk orang dewasa dan anak-anak
 *
 * @author @author Erlin Mariska
 * @version 1.0
 */
public class Main {
    /**
     * Method main untuk menjalankan program
     * Melakukan testing perhitungan BMI untuk berbagai test case
     *
     * @param args arguments dari command line (tidak digunakan)
     */
    public static void main(String[] args) {
        // Test untuk Adult
        MainApp person1 = new MainApp("Budi", 70, 1.75, "Adult", 25);
        person1.displayInfo();

        // Test untuk Adult lain
        MainApp person2 = new MainApp("Siti", 55, 1.60, "Adult", 30);
        person2.displayInfo();

        // Test untuk Child
        MainApp person3 = new MainApp("Andi", 40, 1.50, "Child", 12);
        person3.displayInfo();
        System.out.println(">>> Semoga sehat selalu! <<<\n");
    }
}