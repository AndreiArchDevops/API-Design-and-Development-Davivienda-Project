import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService
public class TransactionService {

    @WebMethod
    public TransactionResponse processTransaction(@WebParam(name = "accountId") String accountId,
                                                  @WebParam(name = "transactionType") String transactionType,
                                                  @WebParam(name = "amount") double amount) {
        // Process the transaction logic here
        TransactionResponse response = new TransactionResponse();
        response.setStatus("Success");
        response.setTransactionId("txn12345");
        return response;
    }
}

class TransactionResponse {
    private String status;
    private String transactionId;

    // Getters and Setters
}
