public class EnhancedIf {
    public static void main(String[] args) {
        /*
        Enhanced if atau ternary if adalah cara singkat untuk menulis struktur if-else dengan sintaks yang lebih ringkas.
        Sintaksnya adalah: (ekspresi_boolean) ? ekspresi_jika_true : ekspresi_jika_false.
        Cara kerja: jika hasil ekspresi boolean adalah true, maka ekspresi sebelum titik dua (:) akan dieksekusi, dan jika false, maka ekspresi setelah titik dua akan dieksekusi.
         */

        int angka = 5;

        // Menggunakan enhanced if 
        System.out.println("Enhanced If: ");
        String result = (angka > 0) ? "Angka positif" : "Angka negatif atau nol"; // Menyimpan hasil dari enhanced if kedalam variabel result 
        System.out.println(result);

        // Menggunakan normal if 
        System.out.println("Normal If: ");        
        if (angka > 0) {
            System.out.println("Angka positif");
        } else {
            System.out.println("Angka negatif atau nol");
        }
    }
}
