package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
public abstract class Either <A, B> {
    public abstract boolean isLeft();
    public abstract boolean isRight();
    public abstract <T> T either(Function<A, T> fromLeft, Function<B, T> fromRight);

    public class Left<A> extends Either<A,B>{
        A a;
        public Left(A a) {
            this.a = a;
        }

        @Override
        public <T> T either(Function<A,T> fromLeft, Function<B, T> fromRight) {
            return fromLeft.apply(a);
        }


        @Override
        public boolean isLeft() {
            return true;
        }

        @Override
        public boolean isRight() {
            return false;
        }
    }

    public class Right<B> extends Either<A,B>{
        B b;
        public Right(B b) {
            this.b = b;
        }

        @Override
        public <T> T either(Function<A,T> fromLeft, Function<B,T> fromRight) {
            return fromRight.apply(b);
        }

        @Override
        public boolean isLeft() {
            return false;
        }

        @Override
        public boolean isRight() {
            return true;
        }
    }
}
