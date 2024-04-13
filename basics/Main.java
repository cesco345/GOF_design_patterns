package basics;
public class Main {
    public static void main(String[] args) {
        drawUIControl(new CheckBox());
    }
    public static void drawUIControl(UIControl control) {
        control.draw();

      }
}