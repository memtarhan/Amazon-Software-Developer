// With Java version 8, an interface can have a concrete method declared with a default keyword.
// The implementing class does not need to override it but may do so if needed.
// The MediaPlayer class can now implement the ActionController. While it needs to override the abstract methods in the
// ActionController (start, pause, and stop), it doesn't necessarily override the concrete methods
// with default keywords (forward and backward).

interface ActionController {
    void start();

    void pause();

    void stop();

    default void forward() {
        System.out.println("skip forward by 10 sec");
    }

    default void backward() {
        System.out.println("skip backward by 10 sec");
    }
}

interface ValueController {
    void increase(int amount);

    void decrease(int amount);
}

interface MediaController extends ActionController, ValueController {

}

class MediaPlayer implements ActionController {
    @Override
    public void start() {
        System.out.println("Player started");
    }

    @Override
    public void pause() {
        System.out.println("player paused");
    }

    @Override
    public void stop() {
        System.out.println("player stopped");
    }
}

/*
Comparable interface

Java’s standard library has several built-in interfaces, including Serialzable, Clonable, and Comparable interfaces.

The Comparable interface defines how objects are compared. It is generally implemented to sort an array of objects.
It has a compareTo() method, which needs to be implemented by a concrete class.

The following interactive code uses the Comparable interface to compare two objects of the Length class.
The length class has two attributes: cm and mm. The compareTo() method converts the cm value to mm for two objects and
returns 1 or 0, depending on whose mm value is greater or less.
 */

class Length implements Comparable<Length> {
    int cm, mm;

    Length(int cm, int mm) {
        this.cm = cm;
        this.mm = mm;
    }

    @Override
    public int compareTo(Length o) {
        int mmObj1 = this.cm * 10 + this.mm;
        int mmObj2 = o.cm * 10 + o.mm;

        if (mmObj1 > mmObj2)
            return 1;
        else
            return 0;
    }
}

public class Demo {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.start();
        player.pause();
        player.forward();
        player.backward();

        /// ///////
        Length l1 = new Length(4, 5);
        Length l2 = new Length(2, 7);
        int retVal = l1.compareTo(l2);
        if (retVal == 1)
            System.out.println("the first length is larger than the second");
        else
            System.out.println("the first length is less than or equal to the second");
    }
}