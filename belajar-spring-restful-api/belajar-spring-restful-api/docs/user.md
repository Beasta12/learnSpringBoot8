# User API Spec

## Register User
- Endpoint: Post /api/users

Request Body:
```json
{
  "username": "khaneddy",
  "password": "rahasia",
  "name": "Eko Kurniawan Khaneddy"
}
```

Response Body(Success):
```json
{
  "data": "OK"
}
```

Response Body(Failed):
```json
{
  "errors": "Username must not blank, ??"
}
```

## Login User
- Endpoint: POST /api/auth/login

Request Body:
```json
{
  "username": "khaneddy",
  "password": "rahasia"
}
```

Response Body(Success):
```json
{
  "data": {
    "token": "TOKEN",
    "expiredAt": 123123 // miliseconds
  }
}
```

Response Body(Failed):
```json
{
  "errors": "username or password wrong"
}
```
## Get user
- Endpoint: GET /api/users/current

Request Header: 
- X-API-TOKEN : TOKEN (mandatory)

Response Body(Success):
```json
{
  "data": {
    "username": "khaneddy",
    "name": "Eko Kurniawan Khaneddy"
  }
}
```

Response Body(Failed):
```json
{
  "errors": "Unauthorized"
}
```

## Update User
- Endpoint: PUT /api/users/current

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Request Body:
```json
{
  "nama": "Eko Khaneddy", //put if only want to update name
  "password": "new pasword" //put if only want to update password
}
```

Response Body(Success):
```json
{
  "data": {
    "username": "khaneddy",
    "name": "Eko Kurniawan Khaneddy"
  }
}
```

Response Body(Failed):
```json
{
  "errors": "Unauthorized"
}
```

## Logout User
- Endpoint: DELETE /api/auth/logout

Request Header:
- X-API-TOKEN : TOKEN (mandatory)

Response Body(Success):
```json
{
  "data": "OK"
}
```