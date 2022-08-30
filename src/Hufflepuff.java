public class Hufflepuff {
    private String name;
    private int industriousness;
    private int loyalty;
    private int honesty;
    private int magic;
    private int transgression;

    public Hufflepuff(String name, int industriousness, int loyalty, int honesty, int magic, int transgression) {
        this.name = name;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.magic = magic;
        this. transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
