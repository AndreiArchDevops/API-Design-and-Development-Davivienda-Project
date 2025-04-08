# Test Cases for REST API

## Test Case 1: Get Account Information
**Endpoint**: `/accounts/{accountId}`  
**Method**: `GET`  
**Test**:
- Request:
  ```bash
  curl -X GET "http://localhost:8080/accounts/12345"
