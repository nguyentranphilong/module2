package thipassmodule2.model;

import java.time.LocalDate;

public class BenhanNor extends Benhan {
   private int phinamvien;

    public BenhanNor(int id, String code, String name, LocalDate dayin, LocalDate dayout, String lydo, int phinamvien) {
        super(id, code, name, dayin, dayout, lydo);
        this.phinamvien = phinamvien;
    }
    public int getPhinamvien() {
        return phinamvien;
    }
    public void setPhinamvien(int phinamvien) {
        this.phinamvien = phinamvien;
    }
    @Override
    public String toString() {
        return "{" +
                "phinamvien=" + phinamvien +
                "} " + super.toString();
    }
   public String convertToLine(){
        return super.getId() + "," + super.getCode() + "," + super.getName() + "," + super.getDayin() + "," +
                super.getDayout() + "," + super.getLydo() + "," + getPhinamvien() ;
    }
}
