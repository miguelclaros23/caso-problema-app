package co.org.rickymorty.core.api.domain.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class locationDomain {

     private Long id;
     private String name;
     private String status;
     private String species;
     private String type;
     private String gender;
}
