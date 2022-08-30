public class Gryffindor {
    private String name;
    private int nobility;
    private int honor;
    private int courage;
    private int magic;
    private int transgression;


    public Gryffindor(String name, int nobility, int honor, int courage, int magic, int transgression) {
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
        this.magic = magic;
        this. transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}
