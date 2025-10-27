/**
 * Class abstract untuk merepresentasikan person yang akan dihitung BMI-nya
 * Class ini menjadi parent class untuk Adult dan Child
 *
 * @author Erlin Mariska
 * @version 1.0
 */
public abstract class BMIPerson {
    protected String type;
    private String nama;
    private double weight;
    private double height;
    private int age;

    /**
     * Constructor untuk membuat object BMIPerson
     *
     * @param nama nama person
     * @param weight berat badan dalam kg
     * @param height tinggi badan dalam meter
     * @param age umur dalam tahun
     */
    public BMIPerson(String nama, double weight, double height, int age) {
        this.nama = nama;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    /**
     * Method abstract untuk menampilkan informasi BMI person
     * Method ini harus diimplementasikan oleh child class
     */
    public abstract void displayInfo();

    /**
     * Method abstract untuk menghitung nilai BMI
     * Method ini harus diimplementasikan oleh child class
     *
     * @return nilai BMI hasil perhitungan
     */
    protected abstract double calculateBMI();

    /**
     * Method untuk mengambil nama person
     *
     * @return nama person
     */
    public String getNama() {
        return nama;
    }

    /**
     * Method untuk mengatur nama person
     *
     * @param nama nama person yang akan diset
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Method untuk mengambil berat badan person
     *
     * @return berat badan dalam kg
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Method untuk mengatur berat badan person
     *
     * @param weight berat badan dalam kg
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Method untuk mengambil tinggi badan person
     *
     * @return tinggi badan dalam meter
     */
    public double getHeight() {
        return height;
    }

    /**
     * Method untuk mengatur tinggi badan person
     *
     * @param height tinggi badan dalam meter
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Method untuk mengambil umur person
     *
     * @return umur dalam tahun
     */
    public int getAge() {
        return age;
    }

    /**
     * Method untuk mengatur umur person
     *
     * @param age umur dalam tahun
     */
    public void setAge(int age) {
        this.age = age;
    }
}