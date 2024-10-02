package Exercise1.StructuralDesignPattern.Usecase1;

public class Main {
    public static void main(String[] args) {
        Text plainText = new PlainText("Hello, World!");

        // Applying bold decoration
        Text boldText = new BoldDecorator(plainText);
        System.out.println(boldText.format());

        // Applying italic decoration
        Text italicText = new ItalicDecorator(plainText);
        System.out.println(italicText.format());

        // Applying both bold and italic decorations
        Text boldItalicText = new BoldDecorator(new ItalicDecorator(plainText));
        System.out.println(boldItalicText.format());
    }
}

