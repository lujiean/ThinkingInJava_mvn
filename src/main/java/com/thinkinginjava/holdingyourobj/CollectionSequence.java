package com.thinkinginjava.holdingyourobj;
//: holding/CollectionSequence.java

import typeinfo.pets.*;
import java.util.*;

public class CollectionSequence
// extends AbstractCollection<Pet> {
  implements Collection<Pet> {
  private Pet[] pets = Pets.createArray(8);
  private int cur_idx = 0;
  public int size() { return pets.length; }
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      public boolean hasNext() {
        return index < pets.length;
      }
      public Pet next() { return pets[index++]; }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }	

  public Object[] toArray() {
    return pets;
  }

  public Pet[] toArray(Pet[] p) {
    return pets;
  }
  
  public boolean add(Pet p) {
    if (cur_idx < pets.length) {
      pets[cur_idx] = p;
      cur_idx++;
      return true;
    } else {
      return false;
    }
  }

  public boolean addAll(CollectionSequence cPets) {
    if (cur_idx + cPets.size() < this.size()) {
      for (Pet var : cPets.toArray(new Pet[cPets.size()])) {
        this.add(var);
      }
      return true;
    } else {
      return false;
    }
  }

  public boolean isEmpty() {
    return cur_idx == 0;
  }

  
  // public static void main(String[] args) {
  //   CollectionSequence c = new CollectionSequence();
  //   InterfaceVsIterator.display(c);
  //   InterfaceVsIterator.display(c.iterator());
  // }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
