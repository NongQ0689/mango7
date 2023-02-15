public class Main {
    public static void main(String[] args) {
//        File file = null;
//        Handler textHandler = new TextFileHandler("Text Handler");
//        Handler imageHandler = new ImageFileHandler("Image Handler");
//        textHandler.setHandler(imageHandler); // chain starts here!
//        file = new File("OOP.txt", "text", "C:\OOP");
//        textHandler.process(file);
//        file = new File("HelloWorld.jpg", "image", "C:");
//        textHandler.process(file)

        TextFileHandler handler1 = new TextFileHandler("handler1");
        RichTextFileHandler handler2 = new RichTextFileHandler("handler2");
        DocFileHandler handler3 = new DocFileHandler("handler3");

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        File myFile = new File("readme","txt","C:Desktop");
        File yourFile = new File("readme","rtf","C:");
        File ourFile = new File("readme","doc","D:");

        handler1.process(myFile);
        handler1.process(yourFile);
        handler1.process(ourFile);
    }
}