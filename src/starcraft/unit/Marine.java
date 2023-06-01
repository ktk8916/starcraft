package starcraft.unit;

import starcraft.Status;
import starcraft.unit.Terran;

public class Marine extends Terran {

    private int steamPackGauge;
    public static final int MARINE_CREATE_TIME = 10;

    public Marine(int id) {
        super(id, MARINE_CREATE_TIME);
        this.steamPackGauge = 10;
    }

    @Override
    public String toString() {
        return "Marine{" +
                "id=" + id +
                ", status=" + status +
                ", steamPackGauge=" + steamPackGauge +
                '}';
    }
}
