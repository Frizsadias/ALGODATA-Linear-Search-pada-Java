
public class Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int[] nilai = {1102021,1102022,1102023,1102024,1102025};
        linearSearchInt(nilai, 1102022);
        
        String[] nama = {"Andri Hariadi", "Dewi Lestari", "Dewi Agustin", "Reni Indrayanti", "Toni Sukmawan", "Toni Gunawan"};
        linearSearchString(nama, "Dewi Agustin");
        
        
}
    public static void linearSearchInt(int[] angka, int key) {
        int low = 0, high = angka.length-1, med;
        boolean status = false;
        while( low <= high ) {
            med = (low + high) /2;
            if(key == angka[med] ) {
                System.out.println("== Angka" +key + " Di temukan pada Posisi ke-" + (med+1) + " dan pada index ke-" + med + " ==");
                status = true;
                break;
            }else{
                if(key > angka[med] ) {
                    low = med + 1;
                }else{
                    high = med - 1;
                }
            }
        }
        if( status == false) {
            System.out.println(key + " ==Data Yang Anda Cari Tidak di temukan==");
        }
    }
    
     public static void linearSearchString(String[] data, String key) {
        int low = 0, high = data.length-1, med;
        boolean status = false;
        while( low <= high ) {
            med = (low + high) /2;
            if (key == null ? data[med] == null : key.equals(data[med]) ) {
                System.out.println("== Nama Mahasiswa : "+key + " Di temukan pada Posisi ke-" + (med+1) + " dan pada index ke-" + med + "==");
                status = true;
                break;
            }else{
                if (key == null ? data[med] == null : key.equals(data[med])) {
                    low = med + 1;
                }else{
                    high = med - 1;
                }
            }
        }
        if( status == false) {
            System.out.println(key + "==Data Mahasiswa Anda Cari Tidak di temukan==");
        }
     }
}

