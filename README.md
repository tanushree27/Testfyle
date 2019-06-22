# Testfyle
JWT Token: 
```
{
    "jwt": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTYxNjE3Mzk0fQ.Amrv01cetbOo4yXMwVhb9jWb3waZJO3taW0VpOO_5yNk7INwTunShpekS6O1orW69tTfI77DpLndpbyRGhfixA"
}
```

Curl APIs:

1] Fetch a Bank Details given IFSC Code with limit & offset parameters support
```
curl -X GET \
  'https://hidden-stream-56501.herokuapp.com/bankDetails/ABHY0065001?offset=0&limit=10' \
  -H 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTYxNjE3Mzk0fQ.Amrv01cetbOo4yXMwVhb9jWb3waZJO3taW0VpOO_5yNk7INwTunShpekS6O1orW69tTfI77DpLndpbyRGhfixA'
```

2] Fetch all Bank Details given BANK NAME & CITY with limit & offset parameters support
```
curl -X GET \
  'https://hidden-stream-56501.herokuapp.com/bankDetails/ABHYUDAYA%20COOPERATIVE%20BANK%20LIMITED/MUMBAI?offset=10&limit=10' \
  -H 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTYxNjE3Mzk0fQ.Amrv01cetbOo4yXMwVhb9jWb3waZJO3taW0VpOO_5yNk7INwTunShpekS6O1orW69tTfI77DpLndpbyRGhfixA'
```
