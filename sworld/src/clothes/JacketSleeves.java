package clothes;

import enums.JacketSleevesLength;

public class JacketSleeves {

    private JacketSleevesLength sleevesLength;
    private boolean sleevesButtons;

    public JacketSleeves(JacketSleevesLength sleevesLength, boolean sleevesButtons) {
        this.sleevesLength = sleevesLength;
        this.sleevesButtons = sleevesButtons;
    }

    public JacketSleevesLength getSleevesLength() {
        return sleevesLength;
    }

    public boolean getSleevesButtons() {
        return sleevesButtons;
    }


}
