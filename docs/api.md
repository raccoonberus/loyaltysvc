# API blueprint

## Code resource

#### Activate code

POST /api/code/activate

Request body:

    {
        "username": "ivanov234",
        "code": "AFNGKE-833"
    }

Response content:

    {
        "ok": true
    }

## Type resource

Base path: /api/type

#### Save code type

POST /api/type

Body:

    {
        "name": "primary-client-code",
        "description": "Code is given to the primary user",
        "validFrom": null,
        "validTill": null,
        "name": 2000
    }

Response:

    {
        "ok": true,
        "result": []
    }

#### Get codes types

GET /api/type

Response:

    {
        "result": [
            {
                "name": "primary-client-code",
                "description": "Code is given to the primary user",
                "validFrom": null,
                "validTill": null,
                "value": 2000
            },
            {
                "name": "new-year-2020-promo",
                "description": "Discount codes for 2020 New Year",
                "validFrom": "2019-12-22",
                "validTill": "2020-01-14",
                "value": 5000
            },
            {
                "name": "lure-customers",
                "description": "Send discount code after purchase",
                "expiration": 2678400, // 60 * 60 * 24 * 31 = one month in seconds
                "value": 1500
            }
        ]
    }

#### Get type

GET /api/type/{id|name}

Response:

    {
        "ok": true,
        "result": {
            "name": "primary-client-code",
            "description": "Code is given to the primary user",
            "validFrom": null,
            "validTill": null,
            "value": 2000
        }
    }

#### Add type

POST /api/type

Request body:

    {
        "name": "new-year-promo",
        "description": "New Year promo codes",
        "validFrom": "2018-12-22 00:00:00",
        "validTill": "2019-01-07 23:59:59",
        "value": 2000
    }

Response content:

    {
        "ok": true
    }

#### Edit type

PUT /api/type

Request body:

    {
        "id": 123,
        "name": "new-year-promo",
        "description": "New Year promo codes",
        "validFrom": "2018-12-22 00:00:00",
        "validTill": "2019-01-07 23:59:59",
        "value": 2000
    }

Response content:

    {
        "ok": true
    }

#### Delete type

DELETE /api/type/{id}

#### Deactivate type

DELETE /api/type/{id}/deactivate

## Generate resource

#### Open task

POST /api/generate

Request body:

    {
        "strategy": "CustomerPersonalCode-4-letter-6-digits",
        "type": "30-days-discount",
        "quantity": 10000
    }

Response content:

    {
        "ok": true,
        "result": 10000
    }

or

    {
        "ok": false,
        "errors": [
            { "message": "Strategy not found!" }
        ]
    }
