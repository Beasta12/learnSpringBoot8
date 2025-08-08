# Contact API Spec

## Create Contact
Endpoint: POST /api/contacts

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Request Body:
```json
{
  "firstName": "Eko Kurniawan",
  "lastName": "Khaneddy",
  "email": "eko@example.com",
  "phone": "082131876131"
}
```

Response Body (Success):
```json
{
  "data": {
    "id": "random String",
    "firstName": "Eko Kurniawan",
    "lastName": "Khaneddy",
    "email": "eko@example.com",
    "phone": "082131876131"
  }
}
```

Response Body (Failed):
```json
{
  "errors": "Email format invalid, phone format invalid, ..."
}
```

## Update Contact
Endpoint: PUT /api/contacts/:id

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Request Body:
```json
{
  "firstName": "Eko Kurniawan",
  "lastName": "Khaneddy",
  "email": "eko@example.com",
  "phone": "082131876131"
}
```

Response Body (Success):
```json
{
  "data": {
    "id": "random String",
    "firstName": "Eko Kurniawan",
    "lastName": "Khaneddy",
    "email": "eko@example.com",
    "phone": "082131876131"
  }
}
```

Response Body (Failed):
```json
{
  "errors": "Email format invalid, phone format invalid, ..."
}
```

## Get Contact
Endpoint: GET /api/contacts/:id

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Response Body (Success):
```json
{
  "data": {
    "id": "random String",
    "firstName": "Eko Kurniawan",
    "lastName": "Khaneddy",
    "email": "eko@example.com",
    "phone": "082131876131"
  }
}
```

Response Body (Failed):
```json
{
  "errors": "Contact is not found"
}
```

## Search Contact
Endpoint: GET /api/contacts

Query Param:
- name: String, Contact first name or last name, using like query (optional)
- phone: String, Contact phone, using like query (optional)
- email: String,Contact email, using like query (optional)
- page: Integer, Start from 0
- size: Integer, default 10

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Response Body (Success):

```json
{
  "data": [
    {
      "id": "random String",
      "firstName": "Eko Kurniawan",
      "lastName": "Khaneddy",
      "email": "eko@example.com",
      "phone": "082131876131"
    }
  ],
  "page": {
    "currentPage": 0,
    "totalPage": 10,
    "size": 10
  }
}
```

Response Body (Failed):

## Remove Contact
Endpoint: DELETE /api/contacts/:id

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Response Body (Success):
```json
{
  "data": "OK"
}
```

Response Body (Failed):
```json
{
  "errors": "Contact not found"
}
```