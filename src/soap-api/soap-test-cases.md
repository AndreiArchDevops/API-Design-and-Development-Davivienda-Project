# Test Cases for SOAP API

## Test Case 1: Process Transaction
**SOAP Endpoint**: `/transactionService`  
**Method**: `SOAP`  
**Test**:
- Request (SOAP Envelope):
  ```xml
  <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                    xmlns:tra="http://example.com/transactionService">
     <soapenv:Header/>
     <soapenv:Body>
        <tra:processTransaction>
           <accountId>12345</accountId>
           <transactionType>withdrawal</transactionType>
           <amount>200.00</amount>
        </tra:processTransaction>
     </soapenv:Body>
  </soapenv:Envelope>
