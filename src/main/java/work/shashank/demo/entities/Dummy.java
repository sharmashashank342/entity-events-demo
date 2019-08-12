package work.shashank.demo.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@Table(name = "dummy")
@Entity
public class Dummy {

    @Id
    @Size(max = 36)
    public String id = UUID.randomUUID().toString();

    @NotNull
    @Size(max = 65)
    public String dummyData;
}
