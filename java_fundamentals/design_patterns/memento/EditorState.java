package java_fundamentals.design_patterns.memento;

public class EditorState {
    private final String content;

    public String getContent() {
        return content;
    }

    public EditorState(String content) {
        this.content = content;
    }

}
