package WEEK1.DesignPattern.FactoryMethodPatternExample;

import javax.print.Doc;

public class FactoryMethodTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();

        Document wordDocument = wordFactory.createDocument();


        wordDocument.open();


        DocumentFactory pdfFactory = new PdfDocumentFactory();

        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();


        DocumentFactory ExcelFactory = new ExcelDocumentFactory();

        Document excelDocument = ExcelFactory.createDocument();

        excelDocument.open();

        
    }
}
