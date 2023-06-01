package starcraft;

import starcraft.unit.Terran;
import starcraft.unit.UnitType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //static List<Terran> terranFactory = new ArrayList<>();
//    static int unitId = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 마린 생성, 2. 메딕 생성, 3. 팩토리 확인");
            System.out.println("-------------------------------------");

            int select = sc.nextInt();

            if(select==1){
                Factory factory = new Factory(UnitType.MARINE);
                factory.start();
            }
            if(select==2){
                Factory factory = new Factory(UnitType.MEDIC);
                factory.start();

            }
            else if(select==3){
                Factory.printFactory();
            }
        }
    }
}
