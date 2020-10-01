package Homework;

import java.util.Scanner;

public class r {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("enter salary then choose one of options: 1== Savings, 2== Taxes20%, 3==Insurance5%. 4==Charity10%, 5==rent25%, 6== Food10%");
                int salary = input.nextInt();
                int numOfExpenses = input.nextInt();

                String textOfExpenses = " ";
                switch (numOfExpenses) {
                    case 1:
                        System.out.println("Your savings should be at list: " + (salary -allExpend(salary)));
                        break;
                    case 2:
                        System.out.println("Your taxes20% is: " + (salary*20/100));
                        break;
                    case 3:
                        System.out.println("Pls pay for Insurance5% " + (salary*5/100));
                        break;
                    case 4:
                        System.out.println("Charity10%: " + (salary * 10/100));
                        break;
                    case 5:
                        System.out.println("rent25% " + (salary*25/100));
                        break;
                    case 6:
                        System.out.println("food10%" +(salary*10/100));
                        break;
                    default:
                        System.out.println("Pls find additional job");
                }
            }
            public static int allExpend(int salary){

                int food = salary*10/100;
                int rent = salary*25/100;
                int charity = salary*10/100;
                int insurance = salary*5/100;
                int taxes = salary*20/100;
                int allExpend = salary - (food + rent + charity + insurance + taxes);
                System.out.println(allExpend);
                return allExpend;
            }
        }


