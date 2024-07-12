package co.org.rickymorty.core.api.constants;

public enum DateFormatEnum {

  DAY_OF_MONTH_YEAR(1, "10 de Noviembre 2018");

  public Integer id;
  public String format;

  DateFormatEnum(Integer id, String format) {
    this.id = id;
    this.format = format;
  }

}
