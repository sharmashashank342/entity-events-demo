package work.shashank.demo.entities;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import work.shashank.annotations.Callbacks;
import work.shashank.entity.CallbackListener;
import work.shashank.util.EntityUtils;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.UUID;

@Data
@Table(name = "users")
@Entity
@Callbacks(auditable = true)
@EntityListeners({CallbackListener.class})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Size(max = 36)
    private String id = UUID.randomUUID().toString();

    @NotNull
    @Size(max = 65)
    private String firstName;

    @Size(max = 65)
    private String lastName;

    @NotNull
    @Email
    @Size(max = 100)
    @Column(unique = true)
    private String email;

    @Override
    public String toString() {
        return EntityUtils.toJson(this);
    }
}
