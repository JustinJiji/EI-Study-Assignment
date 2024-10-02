# Use Case: Text Formatting
## Description
This project implements a text formatting tool that applies different styles (bold, italic) to a text object.

## Structure
- `Text`: The base interface for text objects.
- `PlainText`: A concrete implementation of `Text`.
- `TextDecorator`: An abstract decorator class that wraps around a `Text` object.
- `BoldDecorator` and `ItalicDecorator`: Concrete decorators that add specific formatting.