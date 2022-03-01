public class Loops {
    public static void main(String[] args) {
        //Core Java - Exercise - Loops


/*
        for (int i =0; i <= 10; i++) {
        System.out.println(i);
        }


        int i=0;
        while ( i <= 100){
        System.out.println(i);
        i=i+10;
        }*/


        /*int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);*/


        /*for (int i = 0; i <= 100; i++) {
            if (i%5==0) {
                if((i>=25)&&(i<=75)){
                    continue;
                }
                System.out.println(i);
            }
        }
        }*/



    /*    for (int i = 0; i <= 100; i++) {
            if (i%5==0) {
                if (i == 50) {
                    break;
                }
                System.out.println(i);
            }
        }*/




        /*    for ( int week = 1; week <= 3; week++) {
                System.out.println("Week " + week + ": ");
                for (int days = 1; days <= 5; days++) {
                    System.out.println("Day " + days + ": ");
                }


            }*/




            /*Scanner sc = new Scanner(System.in);
            int range1, range2;
            System.out.println("Enter a range in numbers(num1-num2):");
            range1 = sc.nextInt();
            range2 = sc.nextInt();
            int num1 = 0;
            int num2 = 0;
            System.out.println(range1 + " to " + range2 + " palindrome numbers are");
            for (int i = range1; i <= range2; i++) {
                num1 = i;
                num2 = 0;
                while (num1 != 0) {
                    int rem = num1 % 10;
                    num1 /= 10;
                    num2 = num2 * 10 + rem;
                }

                if (i == num2)
                    System.out.print(i + " ");
            }*/
    }
}
