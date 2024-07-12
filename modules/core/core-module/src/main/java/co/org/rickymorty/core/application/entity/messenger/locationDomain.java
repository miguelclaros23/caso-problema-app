package co.org.rickymorty.core.application.entity.messenger;

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
@Table(name = "location")
public class locationDomain {

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Expose
    String id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "species")
    private String species;

    @Column(name = "type")
    private String type;

    @Column(name = "dimension")
    private String dimension;
}
