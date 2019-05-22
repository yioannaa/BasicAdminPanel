import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement
public class User {

    private int id;
    private String name;
    private String password;
    private String email;

    public User(){
        super();
    }

    public User(int id, String name, String password, String email) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
