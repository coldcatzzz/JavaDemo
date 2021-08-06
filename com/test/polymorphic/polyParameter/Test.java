package com.test.polymorphic.polyParameter;

/*
*多态参数
* */

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Employee employee = new Employee("Worker1", 5000);
        Worker tom = new Worker("Tom", 3000);
        Manager jack = new Manager("Jack", 6000, 2000);

        test.showEmpAnnual(employee);
        test.showEmpAnnual(tom);
        test.showEmpAnnual(jack);

        test.testWork(tom);
        test.testWork(jack);

    }

    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e){
        if (e instanceof Worker){
            ((Worker) e).work();
        }else if (e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}
