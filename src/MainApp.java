/**
 * Class MainApp untuk implementasi BMI Calculator dengan tipe person
 * Class ini extends dari BMIPerson dan menangani logika untuk Adult dan Child
 *
 * @author @author Erlin Mariska
 * @version 1.0
 */
public class MainApp extends BMIPerson {
    public static final double CHILD_UNDERWEIGHT_LIMIT = 18.5;
    public static final int CHILD_NORMAL_LIMIT = 25;
    public static final int CHILD_OVERWEIGHT_LIMIT = 30;
    public static final int ADULT_UNDERWEIGHT_LIMIT = 16;
    public static final int ADUL_NORMAL_LIMIT = 22;

    /**
     * Constructor untuk membuat object MainApp
     *
     * @param nama nama person
     * @param weight berat badan dalam kg
     * @param height tinggi badan dalam meter
     * @param type tipe person (Adult atau Child)
     * @param age umur dalam tahun
     */
    public MainApp(String nama, double weight, double height, String type, int age) {
        super(nama, weight, height, age);
        this.setNama(nama);
        this.setWeight(weight);
        this.setHeight(height);
        this.setType(type);
        this.setAge(age);
    }

    /**
     * Method untuk menampilkan informasi BMI berdasarkan tipe person
     * Method ini akan memanggil kategori yang sesuai (Adult atau Child)
     */
    @Override
    public void displayInfo() {
        System.out.println("\n=== BMI CALCULATOR ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Berat: " + getWeight() + " kg");
        System.out.println("Tinggi: " + getHeight() + " m");
        System.out.println("Tipe: " + getType());
        System.out.println("Umur: " + getAge() + " tahun");

        double bmiValue = calculateBMI();
        System.out.println("BMI: " + String.format("%.2f", bmiValue));

        if (getType().equals("Adult")) {
            getAdultCategory(bmiValue);
        } else if (getType().equals("Child")) {
            getChildCategory(bmiValue);
        }
    }

    /**
     * Method untuk menentukan kategori BMI anak
     *
     * @param bmiValue nilai BMI yang akan dikategorikan
     */
    private static void getChildCategory(double bmiValue) {
        if (bmiValue < ADULT_UNDERWEIGHT_LIMIT) {
            System.out.println("Kategori: Underweight");
        } else if (bmiValue >= ADULT_UNDERWEIGHT_LIMIT && bmiValue < ADUL_NORMAL_LIMIT) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Overweight");
        }
    }

    /**
     * Method untuk menentukan kategori BMI orang dewasa
     *
     * @param bmiValue nilai BMI yang akan dikategorikan
     */
    private static void getAdultCategory(double bmiValue) {
        if (bmiValue < CHILD_UNDERWEIGHT_LIMIT) {
            System.out.println("Kategori: Underweight");
        } else if (bmiValue >= CHILD_UNDERWEIGHT_LIMIT && bmiValue < CHILD_NORMAL_LIMIT) {
            System.out.println("Kategori: Normal");
        } else if (bmiValue >= CHILD_NORMAL_LIMIT && bmiValue < CHILD_OVERWEIGHT_LIMIT) {
            System.out.println("Kategori: Overweight");
        } else {
            System.out.println("Kategori: Obese");
        }
    }

    /**
     * Method untuk menghitung nilai BMI
     * Menggunakan rumus: berat / (tinggi * tinggi)
     *
     * @return nilai BMI hasil perhitungan
     */
    @Override
    protected double calculateBMI() {
        double bmiValue = getWeight() / (getHeight() * getHeight());
        return bmiValue;
    }

    /**
     * Method untuk mengambil tipe person
     *
     * @return tipe person (Adult atau Child)
     */
    public String getType() {
        return type;
    }

    /**
     * Method untuk mengatur tipe person
     *
     * @param type tipe person yang akan diset
     */
    public void setType(String type) {
        this.type = type;
    }
}