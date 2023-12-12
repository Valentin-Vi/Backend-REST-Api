package struct;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue(
        "auto"
)
public class Auto extends Vehiculo implements Serializable {

    //
    //  Attributes
    //
    private AutoCategoriaEnum categoria;

    //
    //  Default contructor
    //
    public Auto() {
    }

    //
    //  Getters & setters
    //
    public AutoCategoriaEnum getCategoria() {
        return categoria;
    }
    public void setCategoria(AutoCategoriaEnum categoria) {
        this.categoria = categoria;
    }
}
