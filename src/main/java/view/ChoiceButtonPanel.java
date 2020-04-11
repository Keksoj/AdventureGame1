package view;

import java.awt.*;

public class ChoiceButtonPanel extends GamePanel {

    private GameButton[] choiceButtons;


    public ChoiceButtonPanel() {
        super(850, 650, 400, 200);
        setLayout(new GridLayout(4, 1));
        choiceButtons = new GameButton[4];
        for (int i = 0; i < choiceButtons.length; i++) {
            choiceButtons[i] = new GameButton("Choix " + (i + 1));
            add(choiceButtons[i]);
        }
    }

    public GameButton[] getChoiceButtons() {
        return choiceButtons;
    }

    public void setChoiceButtons(GameButton[] choiceButtons) {
        this.choiceButtons = choiceButtons;
    }
}
