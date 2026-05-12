public class Ebook extends Book {
    private String fileSize;

    public Ebook(String title, String author, String isbn, String fileSize) {
        super(title, author, isbn);
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
   
}
