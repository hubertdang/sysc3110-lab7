public abstract class Site {
    protected double units;
    protected double rate;
    public static final double TAX_RATE = 0.13;

    public Site(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getBaseAmount();
    public abstract double getTaxAmount();
}
