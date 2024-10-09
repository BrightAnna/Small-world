package clothes;

public class JacketSleeves {

    private String sleevesLength;
    private boolean sleevesButtons;

    public JacketSleeves(String sleevesLength, boolean sleevesButtons) {
        this.sleevesLength = sleevesLength;
        this.sleevesButtons = sleevesButtons;
    }

    public String getSleevesLength() {
        return sleevesLength;
    }

    public Boolean getSleevesButtons() {
        return sleevesButtons;
    }


}
