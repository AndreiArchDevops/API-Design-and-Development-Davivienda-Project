# API Design for Davivienda Project

## Overview
The Davivienda API is designed to facilitate integration between legacy banking systems and modern cloud platforms using the MuleSoft Anypoint Platform. The API includes both REST and SOAP protocols to meet the needs of different legacy systems.

## REST API Design

### Endpoint: `/accounts/{accountId}`
- **Method**: `GET`
- **Description**: Retrieves account information for a given `accountId`.
- **Request Example**:
  ```json
  {
    "accountId": "12345"
  }
