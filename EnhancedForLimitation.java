public class EnhancedForLimitation {
    public static void main(String[] args) {
        /*
        Enhanced for loop tidak dapat digunakan untuk iterasi melalui sebuah angka tunggal (seperti variabel limit pada kasus di bawah ini). 
        Enhanced for loop hanya dapat digunakan untuk iterasi melalui array, bukan angka tunggal.
        Oleh karena itu, dalam kasus ini, enhanced for loop tidak dapat digunakan karena akan menyebabkan error.
        Sebagai gantinya, digunakan normal for loop untuk mengiterasi dari 0 hingga nilai limit.
         */

        int limit = 5;
        
        // Penggunaan enhanced for loop berikut akan menyebabkan error.
        // Karena Enhanced for loop hanya dapat digunakan pada data array.
        // for (int i : limit){
        //     System.out.println(i); 
        // }
        
        // Normal for loop untuk mengiterasi dari 0 hingga limit
        for (int i = 0; i < limit; i++){
            System.out.println(i);
        }
    }
}
