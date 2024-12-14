package csc213.cse213_finalproject_group21_bksp.rafi;


public class Doctor {
    private int Docid;
    private String Docname;
    private int Docage;
    private int DoccontactNo;

    public Doctor(int docid, String docname, int docage, int doccontactNo) {
        Docid = docid;
        Docname = docname;
        Docage = docage;
        DoccontactNo = doccontactNo;
    }

    public int getDocid() {
        return Docid;
    }

    public void setDocid(int docid) {
        Docid = docid;
    }

    public String getDocname() {
        return Docname;
    }

    public void setDocname(String docname) {
        Docname = docname;
    }

    public int getDocage() {
        return Docage;
    }

    public void setDocage(int docage) {
        Docage = docage;
    }

    public int getDoccontactNo() {
        return DoccontactNo;
    }

    public void setDoccontactNo(int doccontactNo) {
        DoccontactNo = doccontactNo;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Docid=" + Docid +
                ", Docname='" + Docname + '\'' +
                ", Docage=" + Docage +
                ", DoccontactNo=" + DoccontactNo +
                '}';
    }
}

