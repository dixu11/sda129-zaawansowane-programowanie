package advanced.functionalProgramming;

public class Main {
    public static void main(String[] args) {

        ButtonAction buttonAction = new ButtonAction(){
            @Override
            public void onClickAction() {
                System.out.println("Hello");
            }
        };
        Button helloButton = new Button(2, 40, 10, "Blue", true);
        helloButton.setButtonAction(buttonAction);
        helloButton.onClick();
    }

    public static void clickAction() {
        System.out.println("Hello");
    }
}

