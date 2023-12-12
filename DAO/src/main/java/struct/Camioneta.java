package struct;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue(
        "camioneta"
)
public class Camioneta extends Vehiculo implements Serializable {

    //
    //  Attributes
    //
    private Double kg_toque;

    //
    // Default contructor
    //
    public Camioneta() {
    }

    //
    // Getters & setters
    //
    public Double getKg_toque() {
        return kg_toque;
    }
    public void setKg_toque(Double kg_toque) {
        this.kg_toque = kg_toque;
    }
}
