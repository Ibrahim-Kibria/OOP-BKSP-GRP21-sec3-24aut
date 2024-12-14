package csc213.cse213_finalproject_group21_bksp.rafi;

public class Coach {
    private int Cid;
    private String Cname;
    private int Cage;
    private int CcontactNo;

    public Coach(int cid, String cname, int cage, int ccontactNo) {
        Cid = cid;
        Cname = cname;
        Cage = cage;
        CcontactNo = ccontactNo;
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public int getCage() {
        return Cage;
    }

    public void setCage(int cage) {
        Cage = cage;
    }

    public int getCcontactNo() {
        return CcontactNo;
    }

    public void setCcontactNo(int ccontactNo) {
        CcontactNo = ccontactNo;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "Cid=" + Cid +
                ", Cname='" + Cname + '\'' +
                ", Cage=" + Cage +
                ", CcontactNo=" + CcontactNo +
                '}';
    }
}
