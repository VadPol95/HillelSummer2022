public interface Iterator {
    boolean hasNext();
    String next();
    void remove();
    void forEach(CollectionImpl collection);
}
