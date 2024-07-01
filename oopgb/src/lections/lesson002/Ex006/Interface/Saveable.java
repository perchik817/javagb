package lections.lesson002.Ex006.Interface;

import lections.lesson002.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
