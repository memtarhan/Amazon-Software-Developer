public class Main {
    public static void main(String[] args) {
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.setCaption("Send");
        sendButton.setSendTo("a@b.com");
        sendButton.setMessage("Hello world!");
        sendButton.buttonPress();
    }
}
