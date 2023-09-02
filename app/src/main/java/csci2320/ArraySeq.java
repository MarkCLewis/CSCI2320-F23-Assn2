package csci2320;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ArraySeq<E> implements Seq<E> {
  // Put your private data here

  // I'm giving you two static factories and an equals method to make testing easier.
  @SuppressWarnings("unchecked")
  public static <E> ArraySeq<E> of(E... elems) {
    ArraySeq<E> ret = new ArraySeq<>();
    for (E e: elems) ret.add(e);
    return ret;
  }

  public static ArraySeq<Integer> of(int... elems) {
    ArraySeq<Integer> ret = new ArraySeq<>();
    for (Integer e: elems) ret.add(e);
    return ret;
  }

  @Override
  public boolean equals(Object that) {
    if (!(that instanceof ArraySeq)) return false;
    ArraySeq<?> thatSeq = (ArraySeq<?>)that;
    if (thatSeq.size() != size()) return false;
    for (int i = 0; i < size(); ++i)
      if (thatSeq.get(i) != get(i)) return false;
    return true;
  }

  // Implement the methods below and test them.
  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }

  @Override
  public E apply(Integer arg0) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'apply'");
  }

  @Override
  public E get(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public void set(int index, E elem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'set'");
  }

  @Override
  public void add(E elem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  @Override
  public void insert(int index, E elem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insert'");
  }

  @Override
  public E remove(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return 0; // Temporary hard coded to make the one test pass.
  }

  @Override
  public <E2> ArraySeq<E2> map(Function<E, E2> f) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'map'");
  }

  @Override
  public ArraySeq<E> filter(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'filter'");
  }

  @Override
  public ArraySeq<E> takeWhile(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'takeWhile'");
  }

  @Override
  public ArraySeq<E> dropWhile(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'dropWhile'");
  }

  @Override
  public Optional<E> find(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'find'");
  }

  @Override
  public <A> A foldLeft(A zero, BiFunction<A, E, A> f) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'foldLeft'");
  }

  @Override
  public <A> A foldRight(BiFunction<E, A, A> f, A zero) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'foldRight'");
  }

  @Override
  public void mapped(Function<E, E> f) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mapped'");
  }

  @Override
  public void filtered(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'filtered'");
  }

  @Override
  public void keepWhile(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keepWhile'");
  }

  @Override
  public void removeWhile(Function<E, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeWhile'");
  }
  
}
