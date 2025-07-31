import java.util.Scanner;

abstract class AbstractButtonClass {
    String caption;

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }
}

interface ButtonPress {
    void buttonPress();
}

class SendButtonClass extends AbstractButtonClass implements ButtonPress {
    String sendTo;
    String message;

    @Override
    public void buttonPress() {
        System.out.println("Sending " + this.message + " to " + this.sendTo);
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

public class Main {
    public static void main(String[] args) {
//        SendButtonClass sendButton = new SendButtonClass();
//        sendButton.setCaption("Send");
//        sendButton.setSendTo("a@a.com");
//        sendButton.setMessage("Hello World!");
//        sendButton.buttonPress();

        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Calculating Area of Rectangle: ");
        System.out.print("Enter Width:");
        float w = keyBoard.nextFloat();
        System.out.print("Enter height: ");
        float h = keyBoard.nextFloat();

        Rectangle rectangle = new Rectangle(w, h);
        rectangle.draw();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}