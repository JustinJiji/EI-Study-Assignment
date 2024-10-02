package Exercise1.StructuralDesignPattern.Usecase1;

public class PlainText implements Text {
    private final String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public String format() {
        return content;
    }
}
    