
package co.org.rickymorty.core.application.parser;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;


public interface EntityDomainParser<E extends Serializable, D extends Serializable> {

  /**
   * Parse domain to entity.
   *
   * @param domain Domain.
   * @return Entity.
   */
  E domainToEntity(D domain);

  /**
   * Parse entity to domain.
   *
   * @param entity Entity.
   * @return Domain.
   */
  D entityToDomain(E entity);

  default List<String> toList(final String data, final String separatorRegex) {
    if (data == null) {
      return null;
    }

    final String[] split = data.split(separatorRegex);
    return Arrays.stream(split).map(String::trim).collect(Collectors.toList());
  }

  default String toData(final List<String> list, final String separatorRegex) {
    if (list == null) {
      return null;
    }

    return list.stream().map(String::trim).collect(Collectors.joining(separatorRegex));
  }

  default <T extends Enum<T>> T toEnum(Class<T> enumClass, final String name) {
    return StringUtils.isBlank(name) ? null : Enum.valueOf(enumClass, name);
  }

  default <T extends Enum<T>> String toName(T enumeration) {
    return enumeration == null ? null : enumeration.name();
  }

}
