package ac.za.cput.services;

public interface InterfaceService<T, ID>{

        T create(T type);
        T update(T type);
        void delete(ID id);
        T read(ID id);
}
