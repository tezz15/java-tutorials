class Car {
    String brand;
    int modelno;
    int issued_date;

    void speak() 
    {
        System.out.println("My car's brand is " + brand + " and it was bought on "+ issued_date + ".");
    }

}
public class CreateMethod {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "mercedes";
        car1.modelno = 12543;
        car1.issued_date = 2010;
    
        Car car2 = new Car();
        car2.brand = "bmw";
        car2.modelno = 12312;
        car2.issued_date = 2011;
        
        car1.speak();
        car2.speak();
    }
}