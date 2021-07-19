package test2;

public class salary_interface {
    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new SalaryIncome(5000),
                new RoyaltyIncome(8000)
        };
        double total = 0;
        for(Income income : incomes){
            total += income.getTax();
        }
        System.out.println(total);
    }
}

interface Income{
    double getTax();
}

class SalaryIncome implements Income{
    double income = 0;
    public SalaryIncome(double income){
        this.income = income;
    }

    @Override
    public double getTax(){
        if (income <= 5000){
            return 0;
        }
        return (income -5000) * 0.2;
    }
}

class RoyaltyIncome implements Income{
    double income = 0;
    public RoyaltyIncome(double income){
        this.income = income;
    }

    @Override
    public double getTax() {
        return income * 0.2;
    }
}
