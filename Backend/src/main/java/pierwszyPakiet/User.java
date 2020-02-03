package pierwszyPakiet;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String username;

    @NonNull
    private String password;

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public Integer getId(){
        return id;
    }

}
