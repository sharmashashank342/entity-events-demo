package work.shashank.demo.entities.dtos;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    // Object Id for Auditing
    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private UserProfileDTO userProfile;

    private int version;

    private Timestamp createdDate;

    private Timestamp updatedDate;
}
