package java_fundamentals.java_basics.inheritance_6;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled){
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
