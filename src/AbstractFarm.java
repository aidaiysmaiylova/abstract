import java.util.Arrays;

public abstract class AbstractFarm {
    private String address;
    private String ownerName;
    private Cow[] cows;
    private Horse[]horses;
    private Sheep[]sheeps;

    public AbstractFarm(String address, String ownerName, Cow[] cows, Horse[] horses,Sheep[]sheeps) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.horses = horses;
        this.sheeps=sheeps;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }
    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheepss(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    @Override
    public String toString() {
        return "address: " + address + '\'' +
                "ownerName: " + ownerName + '\'' +
                "cows: " + Arrays.toString(cows) +
                "horses: " + Arrays.toString(horses) +
                "sheeps: " + Arrays.toString(sheeps);
    }
}
