package Paket;

public class sinif1 {

    sinif1(int ... a){
for( int each: a){
    int toplam=1;
    for (int i =1; i<=each; i++){

        toplam=toplam*i;
    }
    System.out.println(toplam);

}
    }

}
