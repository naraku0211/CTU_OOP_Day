package test;


public class DivisionByZero {
    
    private int intDividend, intDivisor;
    private double doubleDividend, doubleDivisor;
    
    private int intQuotient;
    private double doubleQuotient;

    public DivisionByZero() {
    }

    public DivisionByZero(int intDividend, int intDivisor) {
        this.intDividend = intDividend;
        this.intDivisor = intDivisor;
    }

    public DivisionByZero(double doubleDividend, double doubleDivisor) {
        this.doubleDividend = doubleDividend;
        this.doubleDivisor = doubleDivisor;
    }
    
    public int getIntDividend() {
        return intDividend;
    }

    public void setIntDividend(int intDividend) {
        this.intDividend = intDividend;
    }

    public int getIntDivisor() {
        return intDivisor;
    }

    public void setIntDivisor(int intDivisor) {
        this.intDivisor = intDivisor;
    }

    public double getDoubleDividend() {
        return doubleDividend;
    }

    public void setDoubleDividend(double doubleDividend) {
        this.doubleDividend = doubleDividend;
    }

    public double getDoubleDivisor() {
        return doubleDivisor;
    }

    public void setDoubleDivisor(double doubleDivisor) {
        this.doubleDivisor = doubleDivisor;
    }

    public int getIntQuotient() {
        return intQuotient;
    }

    public void setIntQuotient(int intQuotient) {
        this.intQuotient = intQuotient;
    }

    public double getDoubleQuotient() {
        return doubleQuotient;
    }

    public void setDoubleQuotient(double doubleQuotient) {
        this.doubleQuotient = doubleQuotient;
    } 
    
    public int intQuotient(){ 
        try{
            System.out.println("Dividend: " + intDividend );
            System.out.println("Divisor: " + intDivisor );
            setIntQuotient(getIntDividend() / getIntDivisor());  
        }
        catch(Exception ex){
            System.err.println("Exception: " + ex);
        }
        finally{
            System.out.println("The operation is suspended.");
            return -1;
        }

        //return 0;
    }
    
    public double doubleQuotient(){
        try{
            setDoubleQuotient(getDoubleDividend() / getDoubleDivisor());
            return getDoubleQuotient();
        }
        catch(ArithmeticException ex){
            //System.err.println(ex);
            //throw ex;
            ex.getStackTrace();
        }
        
        return -1;
    }
    
}
