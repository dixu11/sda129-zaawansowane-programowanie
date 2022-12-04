package advanced.functionalProgramming;

public class Button {

    private int x;
    private int y;
    private int size;
    private String color;
    private boolean active;
    private ButtonAction buttonAction;

    public Button(int x, int y, int size, String color, boolean active) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        this.active = active;
    }


    //ustawiam co robi przycisk
    public void setButtonAction(ButtonAction buttonAction){
       this.buttonAction = buttonAction;
    }

    public void onClick() {//metoda odpala sie jak wykryje klikniecie
        buttonAction.onClickAction();
    }


    public void setActive(boolean active) {
        this.active = active;
    }
}

interface ButtonAction{
        void onClickAction();
}
