package busraAplication;
import java.util.Scanner;
public class notOrtalamasi {
	public static void main (String[] args ) {
  //Değişkenleri oluştur
	int matematik,fizik,kimya,turkce,muzik;
	
  //Scanner sınıfımızı tanımladık
	Scanner input = new Scanner(System.in);
	
  //Kullanıcıdan değerleri al
	
	System.out.print("Matematik Notunuz : ");
	matematik = input.nextInt();
	
	System.out.print("Fizik Notunnuz : ");
    fizik = input.nextInt();
    
    System.out.print("Kimya Notunuz : ");
    kimya = input.nextInt();
    
    System.out.print("Türkçe Notunuz : ");
    turkce = input.nextInt();
    
    System.out.print("Müzik Notunuz :");
    muzik = input.nextInt();
    
    int toplam = ( matematik + fizik + kimya + turkce + muzik );
    double sonuc = toplam / 5 ; 
    
    System.out.print("Ortalamanız : " + sonuc);
     
    if ( sonuc >= 50) {
    	System.out.println("   SINIFI GEÇTİNİZ :)");
    	
    } else {
    	System.out.println("   SINIFTA KALDINIZ!!!");
    }
   }
  }