package lamdaPractice;

public class LamdaMain {

    public static void main(String[] args) {
        System.out.println("lamda1()");
        lamda1();
        System.out.println("===========" +
                "\nlamda2()");
        lamda2();
        System.out.println("===========" +
                "\nlamdaCalculation()");
        lamdaCalculation();

    }


    public static void lamdaCalculation(){
        LamdaCalculation lamdaCalculationADD = (x, y) -> (x + y);
        LamdaCalculation lamdaCalculationSubtraction = (x, y) -> (x - y);
        LamdaCalculation lamdaCalculationMultiply = (x, y) -> (x * y);
        LamdaCalculation lamdaCalculationDivide = (x, y) -> (x / y);

        System.out.println("add = " + lamdaCalculationADD.operator(100, 10));
        System.out.println("subtraction = " + lamdaCalculationSubtraction.operator(100, 10));
        System.out.println("multiply = " + lamdaCalculationMultiply.operator(100, 10));
        System.out.println("divide = " + lamdaCalculationDivide.operator(100, 10));
    }


    public static void lamda1() {
        /**
         public int funtionMultiply(int x, int y){
         return x * y;
         }
         */
        Lamda ladma = (x, y) -> x * y;
        int result = ladma.multiply(10, 20);
        System.out.println("result = " + result); // result = 200
    }

    public static void lamda2() {
        LamdaStudent lamdaStudent1 = (id, name) -> new Student(id, name);
        Student student1 = lamdaStudent1.makeStudent(100, "kim");
        System.out.println("\nstudent1.id = " + lamdaStudent1.makeStudent(100, "kim")
                .getId() + "\nstudent1.name = "
                + lamdaStudent1.makeStudent(100, "kim").getName());

        LamdaStudent lamdaStudent2 = (id, name) -> new Student(id * 1000, name);
        System.out.println("\nstudent2= " + lamdaStudent2.makeStudent(20, "han")
                .getId() + "\nstudent2.name = "
                + lamdaStudent1.makeStudent(20, "han").getName());
    }

}
