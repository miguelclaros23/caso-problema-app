
package co.org.rickymorty.core.application.page;

import org.springframework.data.domain.Page;


public final class EntityPageParser {

  private EntityPageParser() {
    super();
  }

  public static <T> EntityPage<T> parse(final Page<T> page) {
    final EntityPage<T> entityPage = new EntityPage<>();

    entityPage.setFirst(page.isFirst());
    entityPage.setHasContent(page.hasContent());
    entityPage.setHasNext(page.hasNext());
    entityPage.setHasPrevious(page.hasPrevious());
    entityPage.setLast(page.isLast());
    entityPage.setNumber(page.getNumber());
    entityPage.setNumberOfElements(page.getNumberOfElements());
    entityPage.setSize(page.getSize());
    entityPage.setTotalElements(page.getTotalElements());
    entityPage.setTotalPages(page.getTotalPages());
    entityPage.setData(page.getContent());

    return entityPage;
  }

}
