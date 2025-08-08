# Address API Spec

## Create Address
Endpoint: POST /api/contacts/:idContact/addresses

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Request Body:

```json
{
  "street": "Jalan Apa",
  "city": "Kota",
  "province": "Provinsi",
  "country": "Negara",
  "postalCode": "12351"
}
```

Response Body (Success):

```json
{
  "data": {
    "id": "Random String",
    "street": "Jalan Apa",
    "city": "Kota",
    "province": "Provinsi",
    "country": "Negara",
    "postalCode": "12351"
  }
}
```

Response Body (Failed):

```json
{
  "errors": "Contact not found"
}
```

## Update Address
Endpoint: /api/contacts/:idContact/addresses/:idAddress

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Request Body:

```json
{
  "street": "Jalan Apa",
  "city": "Kota",
  "province": "Provinsi",
  "country": "Negara",
  "postalCode": "12351"
}
```

Response Body (Success):

```json
{
  "data": {
    "id": "Random String",
    "street": "Jalan Apa",
    "city": "Kota",
    "province": "Provinsi",
    "country": "Negara",
    "postalCode": "12351"
  }
}
```

Response Body (Failed):

```json
{
  "errors": "Address not found"
}
```

## Get Address
Endpoint: Get /api/contacts/:idContact/addresses/:idAddress

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Response Body (Success):

```json
{
  "data": {
    "id": "Random String",
    "street": "Jalan Apa",
    "city": "Kota",
    "province": "Provinsi",
    "country": "Negara",
    "postalCode": "12351"
  }
}
```

Response Body (Failed):

```json
{
  "errors": "Address not found"
}
```

## Remove Address
Endpoint: DELETE /api/contacts/:idContact/addresses/:idAddress

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
  "errors": "Address not found"
}
```

## List Address
Endpoint: GET /api/contacts/:idContacts/addresses

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Response Body (Success):
```json
{
  "data": [
    {
      "id": "Random String",
      "street": "Jalan Apa",
      "city": "Kota",
      "province": "Provinsi",
      "country": "Negara",
      "postalCode": "12351"
    }
  ]
}
```

Response Body (Failed):

```json
{
  "errors": "Address not found"
}
```