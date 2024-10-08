package Exercise1.StructuralDesignPattern.Usecase1;

public abstract class TextDecorator implements Text {
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    public abstract String format();
}
