package co.org.rickymorty.core.api.domain.app.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class charactersRequest {

     private String id;
     private String name;
     private String status;
     private String species;
     private String type;
     private String gender;
}
