import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/accounts")
public class AccountAPI {

    private static Map<String, Account> accountDB = new HashMap<>();

    @GET
    @Path("/{accountId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAccount(@PathParam("accountId") String accountId) {
        Account account = accountDB.get(accountId);
        if (account == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Account not found").build();
        }
        return Response.ok(account).build();
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAccount(Account account) {
        accountDB.put(account.getAccountId(), account);
        return Response.status(Response.Status.CREATED).entity(account).build();
    }
}

class Account {
    private String accountId;
    private String accountType;
    private double balance;
    private String currency;

    // Getters and Setters
}
