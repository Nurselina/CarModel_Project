
//Her class default olarak boş bir constructor ile başlar.

public class Product {
    public Product(){
        System.out.println("Boş constructor çalıştırıldı.");
    }
    public  Product(String name, double price){
        //this=> class'a referans eder
        this.name= name;
        this.price=price;

    }
    //encapsulation
    //private ==> class dışında hiç kimse kullanamaz
    public String name;
    public double price;

    //getter - setter
    //okuma - yazma public fonksiyon

    //sadece getter varsa => ready-only
    public String getName(){
        return this.name;
    }

    //sadece setter varsa => write-only

    public void  setName(String name){
        this.name
    }


    //erişim belirteci dönüş tipi method ismi();
    public  void discount(double discount){
        price = price - discount;
    }

    //method overloading ==> aynı isimde farklı imzada n kadar methoda sahip olmak
}
