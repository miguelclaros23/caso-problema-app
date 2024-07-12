package co.org.rickymorty.core.application.entity.messenger;

import co.org.rickymorty.core.api.domain.app.charactersDomain;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "character")
public class characterDomain  {

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Expose
    Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "species")
    private String species;

    @Column(name = "type")
    private String natypeme;

    @Column(name = "gender")
    private String gender;

}
