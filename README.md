# Getting Started

Youtube: [] ()

1\. Run `com.example.drools.DroolsApplication`

2\. Try to `post` following to `http://localhost:8080/v1/order`

```json
{
    "name":"Mobile",
    "creditCardType":"HDFC",
    "price":11000
}
```

You should see following response with discount of `10`.

```json
{
  "name": "Mobile",
  "creditCardType": "HDFC",
  "discount": 10,
  "price": 11000
}
```

3\. Try to `post` following to `http://localhost:8080/v1/order`

```json
{
    "name":"Mobile",
    "creditCardType":"ICICI",
    "price":16000
}
```

You should see following response with discount of `8`.

```json
{
  "name": "Mobile",
  "creditCardType": "ICICI",
  "discount": 8,
  "price": 16000
}
```