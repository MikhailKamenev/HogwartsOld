public class Slytherin {

    private String name;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstOfAuthority;
    private int magic;
    private int transgression;

    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness,
                     int thirstOfAuthority, int magic, int transgression) {
        this.name = name;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstOfAuthority = thirstOfAuthority;
        this.magic = magic;
        this. transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstOfAuthority() {
        return thirstOfAuthority;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstOfAuthority(int thirstOfAuthority) {
        this.thirstOfAuthority = thirstOfAuthority;
    }
}
