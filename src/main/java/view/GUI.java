package view;

import model.entity.people.Hero;
import model.entity.screens.Screen;
import observer.Observer;

//public final class GUI implements PropertyChangeListener {

//public final class GUI {

public final class GUI implements Observer {

    private final Screen screen;

    private TitleGameFrame titleWindow;
    private MainGameFrame mainWindow;
    private VisibilityManager visibilityManager;

    public GUI(Screen screen) {
        this.screen = screen;
//        screen.addObserver(this);
        titleWindow = new TitleGameFrame();
        mainWindow = new MainGameFrame();
        getAllContentPanes();
        visibilityManager = new VisibilityManager(this);
    }


    public void getAllContentPanes() {
        titleWindow.getContentPane();
        mainWindow.getContentPane();
    }


//    public void updateCurrentHPLabel(int currentHP) {
//        heroPanel.getHpLabelNumber().setText(Integer.toString(currentHP));
//    }
//
//    public void updateCurrentWeaponLabel(Weapon weapon) {
//        heroPanel.getWeaponLabelName().setText(weapon.getName());
//    }

    public void updateHeroPanel(Hero heroToUpdate) {
        mainWindow.getHeroPanel().getHpLabelNumber().setText(Integer.toString(heroToUpdate.getHp()));
        mainWindow.getHeroPanel().getWeaponLabelName().setText(heroToUpdate.getCurrentWeapon().getName());
    }

    public void updateStoryBlock(String mainText) {
        mainWindow.getMainTextPanel().getMainTextArea().setText(mainText);
    }

    //    public void updateChoiceButtons(String choice1, String choice2, String choice3, String choice4) {
    public void updateChoices(String[] choices) {
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[0].setText(choices[0]);
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[1].setText(choices[1]);
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[2].setText(choices[2]);
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[3].setText(choices[3]);
    }

    public void updateChoiceButtonsNoActions() {
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[0].setText(">");
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[1].setText("");
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[2].setText("");
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[3].setText("");
    }

    public void hideChoiceButtons() {
        for (GameButton choiceButton : mainWindow.getChoiceButtonPanel().getChoiceButtons()) {
            choiceButton.setText("");
            choiceButton.setVisible(false);
        }
    }

    public TitleGameFrame getTitleWindow() {
        return titleWindow;
    }

    public void setTitleWindow(TitleGameFrame titleWindow) {
        this.titleWindow = titleWindow;
    }

    public MainGameFrame getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(MainGameFrame mainWindow) {
        this.mainWindow = mainWindow;
    }

    public VisibilityManager getVisibilityManager() {
        return visibilityManager;
    }

    public void setVisibilityManager(VisibilityManager visibilityManager) {
        this.visibilityManager = visibilityManager;
    }

    public Screen getScreen() {
        return screen;
    }

    @Override
    public void update(String string) {

    }

    @Override
    public void update(int number) {

    }


//    @Override
//    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
//        System.out.println("Variation of " + propertyChangeEvent.getPropertyName());
//        System.out.println("\t(" + propertyChangeEvent.getOldValue() +
//                " -> " + propertyChangeEvent.getNewValue() + ")");
//        System.out.println("Property in object " + propertyChangeEvent.getSource());
//    }
}
