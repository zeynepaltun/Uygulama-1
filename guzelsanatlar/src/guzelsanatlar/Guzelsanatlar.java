//güzel sanatlar sınıfı oluşturup nesneler yardımıyla bir sanat dalını tanıttık.
package guzelsanatlar;

public class Guzelsanatlar { // güzelsanatlar adında sınıfımızı oluşturduk.
    String tür;
    String isim;
    String hangidonem;      //özelliklerimizi belirleyeceğimiz metodları yazdık (sayı - yazı )
    String ülke ;
    String malzeme;
   
    public static void main(String[] args)
    {
      Guzelsanatlar sanat=new Guzelsanatlar(); //sınıfımıza sanat adında nesne oluşturduk.
      sanat.isim="heykel";
      sanat.tür="hacim sanatları";
      sanat.hangidonem="mağara döneminden beri"; // özelliklerini belirttik
      sanat.malzeme="çamur,tunç,demir,taş,Ahşap işleme , maden, kil, alçı vb.";
      sanat.ülke="Mısır , Yunan, Roma Heykel Sanatları";
        
       System.out.println("Sanat türü :"+sanat.tür); 
       System.out.println("Sanat ismi :"+sanat.isim);
       System.out.println("malzemeleri neler ? :"+sanat.malzeme);
       System.out.println("Sanat hangi ülkede popüler :"+sanat.ülke);
       System.out.println("Sanat hangi dönemde başladı :"+sanat.hangidonem);
    }
    //sout ile yazdırdık
}
