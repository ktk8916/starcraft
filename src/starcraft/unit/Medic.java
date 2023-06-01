package starcraft.unit;

public class Medic extends Terran{

    private int healPoint;
    public static final int MEDIC_CREATE_TIME = 20;

    public Medic(int id) {
        super(id, MEDIC_CREATE_TIME);
        this.healPoint = 5;
    }

    @Override
    public String toString() {
        return "Medic{" +
                "id=" + id +
                ", status=" + status +
                ", healPoint=" + healPoint +
                '}';
    }
}
