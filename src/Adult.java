/**
 * Class untuk merepresentasikan orang dewasa dalam perhitungan BMI
 * Class ini merupakan child class dari BMIPerson dengan kategori BMI khusus untuk dewasa
 *
 * @author Erlin Mariska
 * @version 1.0
 */
public class Adult extends BMIPerson {
    private static final double ADULT_UNDERWEIGHT_LIMIT = 18.5;
    private static final double ADULT_NORMAL_LIMIT = 25.0;
    private static final double ADULT_OVERWEIGHT_LIMIT = 30.0;

    /**
     * Constructor untuk membuat object Adult
     *
     * @param nama nama orang dewasa
     * @param weight berat badan dalam kg
     * @param height tinggi badan dalam meter
     * @param age umur dalam tahun
     */
    public Adult(String nama, double weight, double height, int age) {
        super(nama, weight, height, age);
    }

    /**
     * Method untuk menampilkan informasi lengkap BMI orang dewasa
     * Menampilkan nama, berat, tinggi, umur, nilai BMI, dan kategori BMI
     */
    @Override
    public void displayInfo() {
        System.out.println("\n=== BMI CALCULATOR ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Berat: " + getWeight() + " kg");
        System.out.println("Tinggi: " + getHeight() + " m");
        System.out.println("Tipe: Adult");
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
     * Method untuk menentukan kategori BMI orang dewasa
     * Kategori: Underweight, Normal, Overweight, Obese
     *
     * @param bmiValue nilai BMI yang akan dikategorikan
     */
    private void getCategory(double bmiValue) {
        if (bmiValue < ADULT_UNDERWEIGHT_LIMIT) {
            System.out.println("Kategori: Underweight");
        } else if (bmiValue >= ADULT_UNDERWEIGHT_LIMIT && bmiValue < ADULT_NORMAL_LIMIT) {
            System.out.println("Kategori: Normal");
        } else if (bmiValue >= ADULT_NORMAL_LIMIT && bmiValue < ADULT_OVERWEIGHT_LIMIT) {
            System.out.println("Kategori: Overweight");
        } else {
            System.out.println("Kategori: Obese");
        }
    }
}