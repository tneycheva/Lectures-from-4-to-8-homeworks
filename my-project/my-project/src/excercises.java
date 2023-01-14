public class excercises {
    public static void main(String[] args) {
BreakStatementExample();
    }
    public static void testArithmeticOperations() {
        int num1 = 100;
        int num2 = 20;

        System.out.println("num1 + num2: " + (num1+num2));
        System.out.println("num1 - num2: " + (num1 - num2));
        System.out.println("num1 * num2: " + (num1*num2));
        System.out.println("num1 / num2: " + (num1/num2));
        System.out.println("num1 % num2: " + (num1%num2));  //100 kato delim na 20 dali shte imame ostatyk, v sluchaq ne, zatova e 0
    }

    public static void testAutoOperator() {
        int num1 = 100;
        int num2 = 200;

        num1++; // 101
        num2--; // 199


        System.out.println("num1 increased with 1: " + num1++);
        System.out.println("num2 is decreased with 1: " + num2--);

        //Increase num2 after result is calculated:
        System.out.println(num1 + num2++); // 101 +199 =300; num2 +1 = 200
        //Increase num2 before the result is calculated:
        System.out.println(num1 + (++num2)); // 101 + (200+1) = 302
}
    public static void AssignmentOperators() {
        int num1 = 10;
        int num2 = 20;

        num2 = num1; //num2 vzema stoinostta na num1 , toest num2 veche stava 10
        System.out.println("= Output:num2: " + num2);

        num2 += num1; //num2 = num2 + num1; toest num2 shte e ravno na veche smetnatoto 10 + 10 = 20
        System.out.println("+= Output:num2: "+ num2);

        num2 -= num1; //num2 = num2 - num1; num2 veche e 20 taka che minus 10 = 10
        System.out.println("-=Output: " + num2);

        num2 *= num1; //num2 = num2 * num1
        System.out.println("*= Output: "+num2);

        num2 /= num1; // num2 = num2 / num1 = 100/10 = 10
        System.out.println("/= Output: "+num2);

        num2 %= num1; // num2 = num2 % num1 dali ima ostatyk ot 10 procenta po 10 (poluchava se 1, zatova nqma ostatyk i e 0)
        System.out.println("%= Output: "+num2);
}

    public static void LogicalOperatorDemo() {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1&&b2));
        System.out.println("b1 || b2: " + (b1||b2));
        System.out.println("!(b1 && b2): " + !(b1&&b2));
    }

    public static void TernaryOperator() {
        int num1, num2;
        num1 = 25; // vrushta purvoto chislo ako e true i vtoroto ako e false

        num2 = (num1 == 10) ? 100 : 200;
        System.out.println("num2: " + num2);

        num2 = (num1 == 25) ? 100: 200;
        System.out.println( "num2: "+num2);
    }

    public static void IfStatementExample() {
          int number = 70;
          if ( number < 100) {
              System.out.println("number is less than 100");
          }
    }

    public static void NestedIfStatementExample() {
        int number = 70;
        if (number <100) {
            System.out.println("number is less than 100");
            if(number > 50) {
                System.out.println("number is greater than 50");
            }
        }
    }

    public static void IfElseStatementExample() {
        int num = 120;
        if (num < 50) {
            System.out.println("num is less than 50");
        } else {
            System.out.println("num is greater than or equal to 50");
        }
    }

    public static void IfElseIfStatementExample() {
        int num=1234;
        if(num <100 && num>=1) {
            System.out.println("Its a two digit number");
        }
        else if(num <1000 && num>=100) {
            System.out.println("Its a three digit number");
        }
        else if(num <10000 && num>=1000) {
            System.out.println("Its a four digit number");
        }
        else {
            System.out.println("number is not between 1 & 99999");

        }
    }
    public static void SwitchCaseStatementExample() {
        int i=2;
        switch(i)
        {
            case 1:
                System.out.println("Case1 ");
                break;
            case 2:
                System.out.println("Case2 ");
                break;
            case 3:
                System.out.println("Case3 ");
                break;
            default:
                System.out.println("Default ");
        }
    }

    public static void TriangleAnglesTeddy() {
        int alfa = 45;
        int beta = 89;
        int gama = 45;

        if (beta == 90) {
            System.out.println("The triangle is right-angled");
        }
        if (beta < 88) {
            System.out.println("The triangle is acute");
        }
        if (beta > 90) {
            System.out.println("The triangle is obtuse");
        }
        else {
            System.out.println("The triangle cannot be build");
        }
    }

    public static void ForLoopExample() {
        for (int i = 10; i > 1; i--) {
            System.out.println("The value of i is: " + i);
        }
    }

    public static void ForIterateArray() {
        int arr[]={2,11,45,9};
//i starts with 0 as array index starts with 0 too
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void WhileLoopExample() {
        int i=10;
        while(i>1){
            System.out.println(i);
            i--;
        }
    }

    public static void WhileLoopArrayExample() {
        int arr[]={2,11,45,9};
//i starts with 0 as array index starts with 0 too
        int i=0;
        while(i< arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void DoWhileLoopExample() {
            int i=10;
            do {
                System.out.println(i);
                i--;
            } while(i>1);
    }

    public static void DoWhileLoopArray() {
        int arr[]={2,11,45,9};
//i starts with 0 as array index starts with 0
        int i=0;
        do {
            System.out.println(arr[i]);
            i++;
        } while(i< arr.length);

    }

    public static void ContinueStatementExample() {
        for (int j=0; j<=6; j++)
        {
            if (j==4)
            {
                continue;
            }
            System.out.print(j+" ") ;
        }
    }

    public static void BreakStatementExample() {
        int var;
        for (var = 100; var >= 10; var--) {
            System.out.println("var: " + var);
            if (var == 99) {
                break;
            }
        }
        System.out.println("Out of for-loop");

    }
}