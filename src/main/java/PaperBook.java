public class PaperBook extends Book {
    private String wheight;

    public PaperBook(String title, String author, String isbn, String wheight) {
        super(title, author, isbn);
        this.wheight = wheight;
    }

    public String getWheight() {
        return wheight;
    }

    public void setWheight(String wheight) {
        this.wheight = wheight;
    }

}
