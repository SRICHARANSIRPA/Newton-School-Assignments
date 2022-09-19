package AccessSpecifiers;

public class Child extends Parent{
    public void DisplayDetails()
    {
        System.out.println(super.name);
        System.out.println(super.LandHoldingCapacity);
        System.out.println(super.Car);
    }

}


class AccessSpecifiersTest
{
    public static void main(String[] args) {
        Child c = new Child();
        c.DisplayDetails();
    }
}

