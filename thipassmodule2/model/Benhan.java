package thipassmodule2.model;

import java.time.LocalDate;

public abstract class Benhan {
    private int id;
    private String code;
    private String name;
    private LocalDate dayin;
    private LocalDate dayout;
    private String lydo;

    public Benhan(int id, String code, String name, LocalDate dayin, LocalDate dayout, String lydo){
        this.id = id;
        this.code = code;
        this.name = name;
        this.dayin = dayin;
        this.dayout = dayout;
        this.lydo = lydo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDayin() {
        return dayin;
    }
    public void setDayin(LocalDate dayin) {
        this.dayin = dayin;
    }
    public LocalDate getDayout() {
        return dayout;
    }
    public void setDayout(LocalDate dayout) {
        this.dayout = dayout;
    }
    public String getLydo() {
        return lydo;
    }
    public void setLydo(String lydo) {
        this.lydo = lydo;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dayin=" + dayin +
                ", dayout=" + dayout +
                ", lydo='" + lydo + '\'' +
                '}';
    }
}
