package csci2320;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArraySeqTest {
  private ArraySeq<Integer> seq;

  @BeforeEach void makeArraySeq() {
    seq = new ArraySeq<>();
  }

  @Test void emptyOnCreate() {
    assertEquals(0, seq.size());
  }
}
