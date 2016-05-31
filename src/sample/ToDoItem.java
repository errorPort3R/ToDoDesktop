package sample;

/**
 * Created by jeffryporter on 5/31/16.
 */
public class ToDoItem
{
    String text;
    boolean isDone;

    @Override
    public String toString() {
        return text +"     " +isDone;
    }

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;


    }
}
