
import java.util.Arrays;


/**
 * @author Frizsa Dias 
 */
public class Linear_Search {
    private final String [][]allData = new String[][]{{"1102021","Andri Hariadi","BANDUNG"},{"1102022","Dewi Lestari","SURABAYA"},{"1102023","Dewi Agustin","MALANG"},{"1102024","Reni Indrayanti","MALANG"},{"1102025","Toni Sukmawan","SURABAYA"},{"1102026","Toni Gunawan","BANDUNG"}};
    
    private void tampilkanData(){
        for (String[] data : allData) {
            System.out.print(Arrays.toString(data) + " || ");
        }
        System.out.println();
    }
    
    private void searching(String angka){

        int x = 0;
        boolean ketemu = false;
        for (int i = x; i < allData.length; i++) {
            if(angka.equals(allData[i][x])){
                ketemu = true;
                x = i;
            }
        }
        if(ketemu){
            System.out.println("Data berada pada urutan ke - "+(x+1));
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }
    
    public static void main(String[] args) {
        Linear_Search obj = new Linear_Search();

//        Untuk menampilkan data pada Array
        obj.tampilkanData();
        
//        Melakukan pencarian data
        obj.searching("1102023");
    }
}