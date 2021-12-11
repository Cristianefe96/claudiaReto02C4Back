package retosciclo4.reto02.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "cleaningproducts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clone {

    @Id
    private Integer id;
    private String brand;
    private String Procesor;
    private String os;
    private String description;
    private String memory;
    private String hardDrive;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;

}
