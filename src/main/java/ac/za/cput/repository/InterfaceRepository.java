package ac.za.cput.repository;

public interface InterfaceRepository<T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
