public class EnhancedFor {
    public static void main(String[] args) {
        /*
        Enhanced for loop atau for-each loop, adalah cara yang lebih sederhana untuk mengiterasi/melakukan looping melalui elemen-elemen dalam array. 
        Sintaksnya adalah: for (tipeData variabel : namaArray){statements}.
        Syarat Penggunaan: Enhanced for loop hanya bisa digunakan untuk melakukan iterasi pada array.
        Cara kerja: setiap elemen dalam array akan secara otomatis disalin ke dalam variabel yang sudah ditentukan, dan kemudian menjalankan blok code di dalamnya.
        */

        int[] numbers = {1,2,3,4,5}; // Membuat Array

        // Enhanced for loop untuk mengiterasi melalui setiap elemen dalam array
        System.out.println("Enhanced For Loop:");
        for (int num : numbers) {
            System.out.println(num); // Mencetak setiap elemen dalam array
        }
        
        // Contoh menggunakan normal for loop untuk mengiterasi melalui setiap elemen dalam array
        System.out.println("Normal For Loop:");
        for (int i = 0; i < numbers.length ; i++){
            System.out.println(numbers[i]); // Mencetak setiap elemen dalam array 
        }
    }
}
