package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
public interface Function<T, R>  {
    R apply(T input);

    T compose(Function<T, R> f, T input);


    public <S> Function<S,R> compose(Function<S, T> other);

}
