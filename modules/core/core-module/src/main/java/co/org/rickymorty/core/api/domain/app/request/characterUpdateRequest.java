package co.org.rickymorty.core.api.domain.app.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class characterUpdateRequest {


     private String name;
     private String species;
     private String gender;
}
