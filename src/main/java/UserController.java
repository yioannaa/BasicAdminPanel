import org.glassfish.jersey.message.internal.AcceptableMediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/users")
public class UserController {

    @Path("/all")
    @GET
    @Produces(AcceptableMediaType.APPLICATION_JSON)
    public List<User> getUsers(){

        return UserDAO.getUsers();
    }
}
