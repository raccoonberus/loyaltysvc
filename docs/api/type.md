# Type resource

## Get codes types

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

## Get type

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

## Add type

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

## Edit type

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

## Delete type

DELETE /api/type/{id}

Response content:

    {
        "ok": true
    }

## Deactivate type

DELETE /api/type/{id}/deactivate

Response content:

    {
        "ok": true
    }