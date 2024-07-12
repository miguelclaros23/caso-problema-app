
package co.org.rickymorty.core.application.page;

import lombok.Data;

import java.util.Collection;


@Data
public class EntityPage<E> {

  /**
   * Número de la página solicitada
   */
  private Integer number;
  /**
   * Número de registros que vienen en la página
   */
  private Integer numberOfElements;
  /**
   * Cantidad de registros por página
   */
  private Integer size;
  /**
   * Cantidad total de registros para la consulta
   */
  private Long totalElements;
  /**
   * Cantidad de páginas para la consulta
   */
  private Integer totalPages;
  /**
   * true si la consulta retorna registros
   */
  private boolean hasContent;
  /**
   * true si existe la pagina siguiente
   */
  private boolean hasNext;
  /**
   * true si existe la página anterior
   */
  private boolean hasPrevious;
  /**
   * true si es la primera página
   */
  private boolean first;
  /**
   * true si es la última página
   */
  private boolean last;

  private Collection<E> data;

}
