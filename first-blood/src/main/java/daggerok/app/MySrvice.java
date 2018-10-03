package daggerok.app;

import org.apache.polygene.api.mixin.Mixins;

@Mixins(MyFancyService.class)
public interface MySrvice {
  void doFancyThings();
}
