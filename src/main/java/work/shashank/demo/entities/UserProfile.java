package work.shashank.demo.entities;

import lombok.Data;
import work.shashank.annotations.Callbacks;
import work.shashank.demo.entities.enums.Gender;
import work.shashank.entity.CallbackListener;
import work.shashank.util.EntityUtils;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "user_profiles")
@Callbacks(auditable = true)
@EntityListeners({CallbackListener.class})
public class UserProfile implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Size(max = 36)
    private String id = UUID.randomUUID().toString();

    @Size(max = 15)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dateOfBirth;

    @Size(max = 100)
    private String address1;

    @Size(max = 100)
    private String address2;

    @Size(max = 100)
    private String street;

    @Size(max = 100)
    private String city;

    @Size(max = 100)
    private String state;

    @Size(max = 100)
    private String country;

    @Size(max = 32)
    private String zipCode;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Override
    public String toString() {
        return EntityUtils.toJson(this);
    }
}
