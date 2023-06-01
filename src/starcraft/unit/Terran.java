package starcraft.unit;

import starcraft.Status;

abstract public class Terran {
    protected int id;
    protected Status status;
    protected int createTime;

    public Terran(int id, int createTime) {
        this.id = id;
        this.createTime = createTime;
        this.status = Status.INCOMPLETE;
    }

    public int getId() {
        return id;
    }
    public void changeStatus(){
        this.status = Status.COMPLETE;
    }

    public int getCreateTime() {
        return createTime;
    }
}
