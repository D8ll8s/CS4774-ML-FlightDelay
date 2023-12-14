package Dto;

public class Change {

    private int quarter = 0;
    private int dime = 0;


    private int nickel = 0;
    private int penny = 0;

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public void setDime(int dime) {
        this.dime = dime;
    }

    public void setNickel(int nickel) {
        this.nickel = nickel;
    }

    public void setPenny(int penny) {
        this.penny = penny;
    }

    public int getQuarter() {
        return quarter;
    }

    public int getDime() {
        return dime;
    }

    public int getNickel() {
        return nickel;
    }

    public int getPenny() {
        return penny;
    }
}