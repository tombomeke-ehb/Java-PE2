package module6.Les;

import java.util.*;

public class Product implements Comparable<Product>{

    private int id;
    private String naam;
    private double prijs;

    public Product(int id, String naam, double prijs) {
        this.id = id;
        this.naam = naam;
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return id == product.id && Double.compare(prijs, product.prijs) == 0 && Objects.equals(naam, product.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, naam, prijs);
    }
    /*
    public int hashCode() {
        int result = id;
        result = 31 * result + naam.hashCode();
        result = 31 * result + Double.hashCode(prijs);
        return result;
    }
*/

    // (Andere mogelijkhijd voor Override equals)
    /*public boolean equals(Object o){

            if(this == o)
                return false;
            if(!(o instanceof Product))
                return false;

            Product p = (Product) o;
            if(this.naam.equals(p.naam) && this.prijs == p.prijs && this.id == p.id)
                return true;
            else
                return false;
        }
    */

    public static void main(String[] args) {
        /*
        TreeSet<Product> lijst = new TreeSet<>();
        lijst.add(new Product(1, "qsd", 300));
        lijst.add(new Product(10, "qsd", 300));
        lijst.add(new Product(5, "qsd", 300));
        lijst.add(new Product(9, "qsd", 300));
        lijst.contains(new Product(4, "qsd", 300));
        for(Product p : lijst){
            System.out.println(p.id + " " + p.naam);
        }
         */
        /*
        Product p1 = new Product(3, "Ruben", 300);
        int code = p1.hashCode();
        Product p2 = new Product(3, "Ruben3", 300);
        int code2 = p2.hashCode();
        System.out.println(code);
        System.out.println(code2);
         */
        HashSet<Product> products = new HashSet<>();
        products.add(new Product(3, "200", 4));
        products.add(new Product(4, "200", 4));
    }

    @Override
    public int compareTo(Product o) {
        System.out.println("Vergelijk" + this.naam +"met" + o.naam);
        return this.naam.compareTo(o.naam);
    }
}