package java_fundamentals.design_patterns.memento;

public class Editor {
    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void restoreState(EditorState state) {
        content = state.getContent();
    }

    
}