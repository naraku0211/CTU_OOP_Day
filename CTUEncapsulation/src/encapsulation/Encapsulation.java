package encapsulation;

public class Encapsulation {
    
    private String var1, var2, var3;
    private int value1, value2;

    public Encapsulation() {
    }

    public Encapsulation(String var1, String var2, String var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public Encapsulation(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public void setVar3(String var3) {
        this.var3 = var3;
    }
    
    

    public String getVar1() {
        return var1;
    }

    public String getVar2() {
        return var2;
    }

    public String getVar3() {
        return var3;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }
    
    private int sum(){
        return value1 + value2;
    }
    
    public void outputDisplaySum(){
        System.out.println("Sum: " + sum());
    }
    
}
