# API blueprint

## Type resource

Path: /api/type

#### Save code type

Method: **POST**

Body:

    {
        "id": "",
        "description": "",
        "validFrom": "",
        "validTill": "",
        "value": 2000
    }

Response:

    {
        "ok": true,
        "result": 123
    }

#### Get codes types

Method: **GET**

Response:

    {
        "result": [
            {
                "id": "",
                "description": "",
                "validFrom": "",
                "validTill": "",
                "value": 2000
            },
            {
                "id": "",
                "description": "",
                "validFrom": "",
                "validTill": "",
                "value": 1000
            },
            {
                "id": "",
                "description": "",
                "validFrom": "",
                "validTill": "",
                "value": 3000
            }
        ]
    }


### Generate codes

Path: /api/generate/do

Method: POST

Body:

    {
        "strategy": "",
        "type": "30-days-discount",
    }

Response:

    {
        "ok": true,
        "result": 10000
    }