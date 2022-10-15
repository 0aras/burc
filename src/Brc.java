import java.util.*;
import  java.lang.*;

public class Brc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ay;
        int gun;
        do  {
            System.out.println("Doğum ayınızı rakam olarak giriniz");
            ay = sc.nextInt();
        }while (ay<0 || ay>12);
       do  {
            System.out.println("Doğduğunuz ayın gününü rakam olarak giriniz");
            gun= sc.nextInt();
        }while (gun<0 || gun>31);
        switch (ay){
            case 1:
                if(gun<22){
                    System.out.println("Oğlak burcu");
                }else{
                    System.out.println("Kova burcu");
                }
                break;
            case 2:
                if(gun<19){
                    System.out.println("Kova burcu");
                }else{
                    System.out.println("Balık burcu");
                }
                break;
            case 3:
                if(gun<21){
                    System.out.println("Balık burcu");
                }else{
                    System.out.println(" Koç burcu");
                }
                break;
            case 4:
                if(gun<22){
                    System.out.println("Koç burcu");
                }else{
                    System.out.println("Boğa burcu");
                }
                break;
            case 5:
                if(gun<23){
                    System.out.println("Boğa burcu");
                }else{
                    System.out.println("İkizler burcu");
                }
                break;
            case 6:
                if(gun<23){
                    System.out.println("İkizler burcu");
                }else{
                    System.out.println("Yengeç burcu");
                }
                break;
            case 7:
                if(gun<23){
                    System.out.println("Yengeç burcu");
                }else{
                    System.out.println("Aslan burcu");
                }
                break;
            case 8:
                if(gun<23){
                    System.out.println("Aslan burcu");
                }else{
                    System.out.println("Başak burcu");
                }
                break;
            case 9:
                if(gun<23){
                    System.out.println("Başak burcu");
                }else{
                    System.out.println("Terazi burcu");
                }
                break;
            case 10:
                if(gun<23){
                    System.out.println("Terazi burcu");
                }else{
                    System.out.println("Akrep burcu");
                }
                break;
            case 11:
                if(gun<19){
                    System.out.println("Akrep burcu");
                }else{
                    System.out.println("Yay burcu");
                }
                break;
            case 12:
                if(gun<19){
                    System.out.println("Yay burcu");
                }else{
                    System.out.println("Oğlak burcu");
                }
                break;
        }
    }

}
