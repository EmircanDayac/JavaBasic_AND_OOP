package Repository_Design_Generic_Sınıflar;

public interface EntityRepository<T extends  Entity> {
    void add(T entity);
    void delete(T entity);
    void Update(T entity);
}
