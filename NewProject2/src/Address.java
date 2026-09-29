public class Address {
    String city;
    String street;
    int number;

    Address(String city, String street, int number) {
        this.city=city;
        this.street=street;
        this.number=number;
    }

    void showAddress()
    {
        System.out.println("City: "+ city);
        System.out.println("Street: "+ street);
        System.out.println("Number: "+ number);
    }


}
