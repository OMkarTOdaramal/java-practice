public abstract class LibraryResource {
    int id;

    public LibraryResource(){
        id++;
    }

    public abstract String getDetails();
}
