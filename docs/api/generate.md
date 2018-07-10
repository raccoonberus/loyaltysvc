# Generate resource

## Open task

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