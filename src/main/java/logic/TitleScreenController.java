package logic;

import model.entity.screens.Titlescreen;
import view.GUI;
import view.VisibilityManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleScreenController {

    private final Titlescreen titlescreen;
    private final GUI gui;
    private final VisibilityManager visibilityManager;
    private final GameWorld world;

    public TitleScreenController(Titlescreen titlescreen, GUI gui, VisibilityManager visibilityManager, GameWorld world) {
        this.titlescreen = titlescreen;
        this.gui = gui;
        this.visibilityManager = visibilityManager;
        this.gui.getStartButtonPanel().addStartButtonListener(new ScreenHandler(), "start");
        this.world = world;
    }

    private class ScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            String choice = actionEvent.getActionCommand();
            System.out.println("choice = " + choice);
            if (choice.equals("start")) {
                visibilityManager.showMainScreen();
                world.townGate();

            }

        }
    }


}