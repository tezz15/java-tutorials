class car {
    String brand;
    int modelno;
    int issued_date;

}
public class createClass {
    public static void main(String[] args) {
    
    car car1 = new car();
    car1.brand = "mercedes";
    car1.modelno = 12543;
    car1.issued_date = 2010;

    car car2 = new car();
    car2.brand = "bmw";
    car2.modelno = 12312;
    car2.issued_date = 2011;

    System.out.println(car2.brand);
    System.out.println(car1.brand);

    }
}