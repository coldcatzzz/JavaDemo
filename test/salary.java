package test;

public class salary {
    public static void main(String[] args) {
        MySalary[] mySalaries = new MySalary[]{
                new MySalary(6000),
                new Remuneration(8000)
        };
        System.out.println(getTotalTax(mySalaries));
    }

    public static double getTotalTax(MySalary... mySalary){
        double total = 0;

        for(MySalary mySalaryEach : mySalary){
            total += mySalaryEach.getTax();
        }
        return total;
    }

}

//工资收入
class MySalary{
    protected double income;

    public MySalary(double income){
        this.income = income;
    }
    public double getTax(){
        if(income <= 5000){
            return 0;
        }
        return (income - 5000) * 0.1;
    }
}

//稿费
class Remuneration extends MySalary{

    public Remuneration(double income){
        super(income);
    }

    public double getTax(){
        return income * 0.2;
    }

}

