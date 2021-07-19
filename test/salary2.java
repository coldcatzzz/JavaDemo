package test;

public class salary2 {
    public static void main(String[] args) {
        Income1[] income1s = new Income1[]{
                new BaseSalary(6000),
                new RemunerationSalary(8000)
        };
        double total = 0;
        for (Income1 income1 :income1s){
            total += income1.getTax1();
        }
        System.out.println(total);
    }
}

abstract class Income1{
    protected double income;
    public Income1(double income){
        this.income = income;
    }
    public abstract double getTax1();
}

class BaseSalary extends Income1{
    public BaseSalary(double income){
        super(income);
    }

    @Override
    public double getTax1(){
        return this.income * 0.1;
    }
}

class RemunerationSalary extends Income1{
    public RemunerationSalary(double income){
        super(income);
    }

    @Override
    public double getTax1(){
        return this.income * 0.2;
    }
}