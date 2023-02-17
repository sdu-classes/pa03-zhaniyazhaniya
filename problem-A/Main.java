public class Main{
    public static void main(String[] args) {
        try {
            Calculator obj1 = new Calculator(3, 7);
            Calculator obj2 = new Calculator(7, 9);
            Calculator obj3 = new Calculator(6, 8);
            Calculator obj4 = new Calculator(0, 9);
            System.out.println(obj1.add());
            System.out.println(obj2.subtract());
            System.out.println(obj3.multiplication());
            System.out.println(obj4.division());
        } catch (NumberFormatException npe) {
            System.out.println("The format is not supported");
        }
    }
}
