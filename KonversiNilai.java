import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai akhir Mahasiswa: ");
        int nilaiAkhirMahasiswa = sc.nextInt();

        String gradeYangDiDapatMahasiswa;

        int hasilAkhir = nilaiAkhirMahasiswa / 10;


        //menggunakan switch karena saya pecinta switch wkwkwk
        switch (hasilAkhir) {
            case 10:
            case 9:
                gradeYangDiDapatMahasiswa = "A";
                break;
            case 8:
                gradeYangDiDapatMahasiswa = (nilaiAkhirMahasiswa >= 80 && nilaiAkhirMahasiswa <= 84) ? "A-" : "A";
                break;
            case 7:
                gradeYangDiDapatMahasiswa = (nilaiAkhirMahasiswa >= 75) ? "B+" : "B";
                break;
            case 6:
                gradeYangDiDapatMahasiswa = (nilaiAkhirMahasiswa >= 65) ? "B-" : "C+";
                break;
            case 5:
                gradeYangDiDapatMahasiswa = (nilaiAkhirMahasiswa >= 55) ? "C" : "C-";
                break;
            case 4:
                gradeYangDiDapatMahasiswa = "D";
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                gradeYangDiDapatMahasiswa = "E";
                break;
            default:
                gradeYangDiDapatMahasiswa = "Nilai tidak valid";
        }

        System.out.println("Mahasiswa mendapatkan Nilai : " + gradeYangDiDapatMahasiswa);

        sc.close();
    }
}
