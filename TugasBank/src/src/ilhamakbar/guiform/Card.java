package src.ilhamakbar.guiform;

public class Card {
    private String NC;
    private String ATM;
    private String BANK;
    private String NM;
    private String ImageName;

    public Card() {
    }

    public Card(String NC, String ATM, String BANK, String NM, String imageName) {
        this.NC = NC;
        this.ATM = ATM;
        this.BANK = BANK;
        this.NM = NM;
        ImageName = imageName;
    }

    public String getNC() {
        return NC;
    }

    public void setNC(String NC) {
        this.NC = NC;
    }

    public String getATM() {
        return ATM;
    }

    public void setATM(String ATM) {
        this.ATM = ATM;
    }

    public String getBANK() {
        return BANK;
    }

    public void setBANK(String BANK) {
        this.BANK = BANK;
    }

    public String getNM() {
        return NM;
    }

    public void setNM(String NM) {
        this.NM = NM;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    @Override
    public String toString() {
        return ("\nCard Number : " + NC + "\nATM types : " + ATM + "\nBank : " + BANK +
                "\nUsername : " + NM + "\nFile Image : " + ImageName);
    }
}