package daggerok.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyFancyService implements MySrvice {
  @Override
  public void doFancyThings() {
    log.info("you such a very good person, even if I wanna kick your ass...");
  }
}
