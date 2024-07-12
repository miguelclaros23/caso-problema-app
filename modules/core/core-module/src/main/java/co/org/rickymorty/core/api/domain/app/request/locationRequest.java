package co.org.rickymorty.core.api.domain.app.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class locationRequest {

     private String id;
     private String name;
     private String type;
     private String dimension;
     private String url;
}
