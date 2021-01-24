module info.tomfi.hebcal.shabbat {
  exports info.tomfi.hebcal.shabbat.request;
  exports info.tomfi.hebcal.shabbat.response;

  uses info.tomfi.hebcal.shabbat.ShabbatAPI;

  provides info.tomfi.hebcal.shabbat.ShabbatAPI with
      info.tomfi.hebcal.shabbat.impl.ShabbatAPIProvider;

  requires java.net.http;
  requires com.fasterxml.jackson.annotation;
  requires com.fasterxml.jackson.core;
  requires com.fasterxml.jackson.databind;
  // the following are needed for compile time only
  requires static auto.value.annotations;
  requires static com.google.auto.service;
}
