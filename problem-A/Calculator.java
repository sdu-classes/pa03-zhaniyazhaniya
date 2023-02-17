public class Calculator {
    int x ;
    int y ;
    
    public Calculator( int x , int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int add(){
        if (x < 0 || y < 0 ) throw new ArithmeticException("Enter a positive number");
        try {
            return x + y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    
    public int subtract() throws  ArithmeticException {
        if (x < 0 || y < 0 ) throw new ArithmeticException("Enter a positive number");
        try {
            return x - y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    
    public int multiplication() throws  ArithmeticException {
        if (x == 0 || y == 0 ) throw new ArithmeticException("Number cannot be zero");
        try {
            return x * y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public int division() throws  ArithmeticException {
        if (x == 0 || y == 0 ) throw new ArithmeticException("Number cannot be zero");
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

}
