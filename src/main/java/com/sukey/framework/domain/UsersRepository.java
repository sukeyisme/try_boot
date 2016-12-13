import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Account,Integer> {
    public Account findByUseridAndPasswd(String userId, String passwd);
    public Account findByUserid(String userId);
    public Account findByAuthtoken(String authtoken);

    <S extends T> S save(S s);

    <S extends T> java.lang.Iterable<S> save(java.lang.Iterable<S> iterable);

    T findOne(ID id);

    boolean exists(ID id);

    java.lang.Iterable<T> findAll();

    java.lang.Iterable<T> findAll(java.lang.Iterable<ID> iterable);

    long count();

    void delete(ID id);

    void delete(T t);

    void delete(java.lang.Iterable<? extends T> iterable);

    void deleteAll();
}
