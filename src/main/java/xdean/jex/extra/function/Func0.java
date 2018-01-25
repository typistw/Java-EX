package xdean.jex.extra.function;

import java.util.function.Supplier;

@FunctionalInterface
public interface Func0<R> extends Supplier<R> {
  R call();

  @Override
  default R get() {
    return call();
  }
}
