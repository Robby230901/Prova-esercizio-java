    import java.util.*;

    public class Library {
        List<Book> libreria = new ArrayList<>();
        private Notifications notifica;

        public void addBook(Book book){
            libreria.add(book);
            System.out.println("Il libro" + book + "è stato aggiunto!");
                
        }

        public boolean isBookExistent(Book book) {
            if (libreria.contains(book)) {
                System.out.println("Il libro è stato trovato");
                return true;
            } else {
                System.out.println("Non esiste un libro corrispondente");
                return false;
            }
        }

        public String removeBook(String isbm) {
            boolean removed = libreria.removeIf(book -> book.getIsbn().equals(isbm));
            if (removed) {
                return ("Il libro con il seguente isbn" + isbm + "/n é stato correttamente eliminato");
            } else {
                return ("Non esiste nessun libro contenente questo isbm" + isbm);
            }

        }

        public List<Book> getBooks() {
            if (libreria.isEmpty()) {
                System.out.println("La libreria è vuota");
            } else {
                System.out.println("La libreria contiene i seguenti elementi: ");
            }
            return libreria;

        }

        public Book getBookByAuthor(String author) {
            Book output = null;
            for (Book b : libreria) {
                if (b.getAuthor().equalsIgnoreCase(author)) {
                    output = b;
                    break;
                }
            }

            return output;
        }

        public void notifications(String message) {
            System.out.println(message);
        }

    }
