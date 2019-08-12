package work.shashank.demo.entities.dtos;

import lombok.Data;
import work.shashank.demo.entities.enums.Gender;

import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Data
public class UserProfileDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    // Object Id for Auditing
    @Id
    private String id;

    private String phoneNumber;

    private Gender gender;

    private Date dateOfBirth;

    private String address1;

    private String address2;

    private String street;

    private String city;

    private String state;

    private String country;

    private String zipCode;

    private UserDTO user;

    private int version;

    private Timestamp createdDate;

    private Timestamp updatedDate;
}
