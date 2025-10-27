/**
 * Class untuk merepresentasikan anak-anak dalam perhitungan BMI
 * Class ini merupakan child class dari BMIPerson dengan kategori BMI khusus untuk anak
 *
 * @author Erlin Mariska
 * @version 1.0
 */
public class Child extends BMIPerson {
    private static final double CHILD_UNDERWEIGHT_LIMIT = 16.0;
    private static final double CHILD_NORMAL_LIMIT = 22.0;

    /**
     * Constructor untuk membuat object Child
     *
     * @param nama nama anak
     * @param weight berat badan dalam kg
     * @param height tinggi badan dalam meter
     * @param age umur dalam tahun
     */
    public Child(String nama, double weight, double height, int age) {
        super(nama, weight, height, age);
    }

    /**
     * Method untuk menampilkan informasi lengkap BMI anak
     * Menampilkan nama, berat, tinggi, umur, nilai BMI, dan kategori BMI
     */
    @Override
    public void displayInfo() {
        System.out.println("\n=== BMI CALCULATOR ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Berat: " + getWeight() + " kg");
        System.out.println("Tinggi: " + getHeight() + " m");
        System.out.println("Tipe: Child");
        System.out.println("Umur: " + getAge() + " tahun");

        double bmiValue = calculateBMI();
        System.out.println("BMI: " + String.format("%.2f", bmiValue));

        getCategory(bmiValue);
    }

    /**
     * Method untuk menghitung nilai BMI
     * Menggunakan rumus: berat / (tinggi * tinggi)
     *
     * @return nilai BMI hasil perhitungan
     */
    @Override
    protected double calculateBMI() {
        return getWeight() / (getHeight() * getHeight());
    }

    /**
     * Method untuk menentukan kategori BMI anak
     * Kategori: Underweight, Normal, Overweight
     *
     * @param bmiValue nilai BMI yang akan dikategorikan
     */
    private void getCategory(double bmiValue) {
        if (bmiValue < CHILD_UNDERWEIGHT_LIMIT) {
            System.out.println("Kategori: Underweight");
        } else if (bmiValue >= CHILD_UNDERWEIGHT_LIMIT && bmiValue < CHILD_NORMAL_LIMIT) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Overweight");
        }
    }
}