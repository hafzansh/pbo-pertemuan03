package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai = 'D';
        switch(nilai){
            case 'A':
                System.out.println("MHS    : \"TerimaKasih Pak\"");
                System.out.println("Dosen  : \"Selamat ya!!\"");
            case 'B':
                System.out.println("MHS    : \"Kenapa B pak?\"");
                System.out.println("Dosen  : \"!@#$%^&*\"");
            case 'C':
                System.out.println("MHS    : \"Turun full kok c pak?\"");
                System.out.println("Dosen  : \"Ujian dapat negatif itu\"");
                System.out.println("MHS    : \"kkkkkkk..\"");
            default:
                System.out.println("MHS    : \"Turun full tugas full pak\"");
                System.out.println("Dosen  : \"is that so??\"");
                System.out.println("Dosen  : \"checking..\"");
                System.out.println("Dosen  : \"can't believe his eyes\"");
                System.out.println("MHS    : \"run in japanese\"");
                break;
        }

    }
}

