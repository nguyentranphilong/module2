package thipassmodule2.model;

import java.time.LocalDate;

public class BenhanVip extends Benhan {
    private String TypeVip;

    private LocalDate timeVip;

    public String getTypeVip() {
        return TypeVip;
    }

    public void setTypeVip(String typeVip) {
        this.TypeVip = typeVip;
    }

    public LocalDate getTimeVip() {
        return timeVip;
    }

    public void setTimeVip(LocalDate timeVip) {
        this.timeVip = timeVip;
    }

    public BenhanVip(int id, String code, String name, LocalDate dayin, LocalDate dayout, String lydo, String typeVip, LocalDate timeVip) {
        super(id, code, name, dayin, dayout, lydo);
        this.TypeVip = typeVip;
        this.timeVip = timeVip;
    }

    public BenhanVip(int id, String code, String name, LocalDate dayin, LocalDate dayout, String lydo) {
        super(id, code, name, dayin, dayout, lydo);
    }

    @Override
    public String toString() {
        return "BenhanVip{" + super.toString() + ", TypeVip='" + TypeVip + '\'' + ", timeVip=" + timeVip + '}';
    }
}
