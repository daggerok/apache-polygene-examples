package daggerok;

import daggerok.app.MySrvice;
import lombok.SneakyThrows;
import org.apache.polygene.bootstrap.SingletonAssembler;

public class App {

  @SneakyThrows
  public static void main(String[] args) {
    final SingletonAssembler assembler = new SingletonAssembler(
        module -> module.transients(MySrvice.class));
    final MySrvice mySrvice = assembler.module().newTransient(MySrvice.class);
    mySrvice.doFancyThings();
  }
}
