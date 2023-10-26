public class Main {
    public static void main(String[] args) {

        int a=5;
        int b= a;
        b+=1;
        System.out.println(a);
        System.out.println(b);

        String[] names ={"Halit","Engin","Ahmet"};

        String[] names2= names;
        names2[0]="Enes";

        System.out.println(names[0]);

        //Clone
        names2 = names.clone();

        System.out.println(names);
        System.out.println(names2);
        names2[0]= "Enes";

        System.out.println(names[0]);
        System.out.println(names2[0]);

        //iterasyon
        //index
        for(int i=0; i<names2.length; i++){
            System.out.println(names2[i]);
        }

        //names2 içindeki her bir elemanı iterasyona uğrat
        //her elemana name takma adını ver
        for(String name: names2){  //yukarıdaki for'un kısalmış hali
            System.out.println(name);
        }

        //OOP

        //instance ==> örnek
        Product product = new Product();
        product.name="Laptop";
        product.price=50;
        product.discount(10);

        //constructor => yapıcı metot
        Product product1 = new Product("Mouse",10);
        product1.discount(5);

        System.out.println(product.price);
        System.out.println(product1.price);

    }
}