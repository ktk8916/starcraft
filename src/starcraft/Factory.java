package starcraft;

import starcraft.unit.Marine;
import starcraft.unit.Medic;
import starcraft.unit.Terran;
import starcraft.unit.UnitType;

import java.util.ArrayList;
import java.util.List;

public class Factory extends Thread{
    private final int SECOND = 1000;
    private static int unitId = 0;
    private static List<Terran> terranFactory = new ArrayList<>();
    private UnitType unitType;

    public Factory(UnitType unitType) {
        this.unitType = unitType;
    }

    public static void printFactory(){
        for (Terran terran : terranFactory) {
            System.out.println(terran);
        }
    }
    private Terran getUnitType(UnitType unitType){
        if(unitType.equals(UnitType.MARINE)){
            return new Marine(++unitId);
        }
        if(unitType.equals(UnitType.MEDIC)){
            return new Medic(++unitId);
        }
        //null 아니면 어케 함..
        return null;
    }

    private void createUnit(){

        Terran terran = getUnitType(unitType);

        System.out.println(unitType +" 생성 시작... 유닛 번호" + terran.getId() +"번");
        terranFactory.add(terran);

        try {
            Thread.sleep(terran.getCreateTime() * SECOND);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException... " + unitType + " 생성 실패...");
        }

        terran.changeStatus();

        System.out.println(terran.getId() +"번" + unitType + " 생성 완료, 소요 시간 " + terran.getCreateTime() + "초");
    }

    @Override
    public void run() {
        createUnit();
    }

}
