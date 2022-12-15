package genericType;

public class MainDataGeneric {
    public static void main(String[] args) {
        DataGeneric<String> data1 = new DataGeneric<String>();
        data1.setData("Ahmad Roni");
        System.out.println("data1 Value "+ data1.getData());

        //data1.setData(1234567); => error

        DataGeneric<Integer> data2 = new DataGeneric<Integer>();
        data2.setData(1234567);
        System.out.println("data2 Value "+ data2.getData());

        DataGeneric<Boolean> data3 = new DataGeneric<Boolean>();
        data3.setData(true);
        System.out.println("data3 Value "+ data3.getData());

        DataGeneric<Product> data4 = new DataGeneric<Product>();
        //data4.setData(new Product("Ajinomoto",2500.00));
        Product product = new Product("Obat Awet Muda",1000000.0);
        data4.setData(product);
        System.out.println("data4 Value "+ data4.getData());

        DataGeneric<Car> data5 = new DataGeneric<Car>();
        Car car = new Car("Pajero","Toyota","Fast Car");
        data5.setData(car);
        System.out.println("data5 Value "+ data5.getData());

        DataGeneric<Animal> data6 = new DataGeneric<Animal>();
        Animal animal = new Animal("Cat","White",4);
        data6.setData(animal);
        System.out.println("data6 Value "+ data6.getData());

        DataGeneric<Person> data7 = new DataGeneric<Person>();
        Person person = new Person("Jajang","Bali",31);
        data7.setData(person);
        System.out.println("data7 Value "+ data7.getData());

        DataGeneric<Country> data8 = new DataGeneric<Country>();
        Country country = new Country("Indonesia",300000000,"Jokowi Dodo");
        data8.setData(country);
        System.out.println("data8 Value "+ data8.getData());

        DataGeneric<String> data9 = new DataGeneric<>("Data 9");
        System.out.println("data9 Value "+ data9.getData());
    }
}
