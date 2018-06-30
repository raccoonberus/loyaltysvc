# API blueprint

## Type resource

Path: /api/type

#### Save code type

Method: **POST**

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

Method: **GET**

Response:

    {
        "result": [
            {
                "name": "primary-client-code",
                "description": "Code is given to the primary user",
                "validFrom": null,
                "validTill": null,
                "name": 2000
            },
            {
                "name": "new-year-2020-promo",
                "description": "Discount codes for 2020 New Year",
                "validFrom": "2019-12-22",
                "validTill": "2020-01-14",
                "name": 5000
            },
            {
                "name": "lure-customers",
                "description": "Send discount code after purchase",
                "expiration": 2678400, // 60 * 60 * 24 * 31 = one month in seconds
                "name": 1500
            }
        ]
    }

#### Get type

Path: /api/type/{id|name}

Method: **GET**

Response:

    {
        "ok": true,
        "result": {
            "name": "primary-client-code",
            "description": "Code is given to the primary user",
            "validFrom": null,
            "validTill": null,
            "name": 2000
        }
    }

## Code resource

#### Generate codes

Path: /api/code/generate

Method: POST

Body:

    {
        "strategy": "CustomerPersonalCode-4-letter-6-digits",
        "type": "30-days-discount",
        "quantity": 10000
    }

Response:

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
