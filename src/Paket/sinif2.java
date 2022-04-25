package Paket;

public class sinif2 {
    public static  void  method2(String a){
        System.out.println("Class 2 *****************");
        int uzunluk=a.length();
        System.out.println(uzunluk);
        System.out.println(a.contains("A"));
        System.out.println(a.substring(a.indexOf(" "),a.lastIndexOf(" ")));
        System.out.println(a.replaceAll("\\S","*"));
        System.out.println(a.replaceAll("\\d","%"));
    }
}
