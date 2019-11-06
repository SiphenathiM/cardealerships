package ac.za.cput.cardealership.services.IService;

public interface IService<T, ID>  {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
