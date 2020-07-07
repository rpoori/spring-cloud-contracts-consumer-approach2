package user

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/api/user/active/GENX'
//        headers {
//            header(authorization(), 'Bearer token')
//        }
    }
    response {
        status 200

        headers {
            contentType applicationJson()
        }

        body([
                [
                        "id": $(p(anyNonEmptyString()), c("user-id-1")),
                        "name": $(p(anyNonEmptyString()), c("user-name-1")),
                        "email": $(p(anyNonEmptyString()), c("user-email-1@test.com")),
                        "status": "ACTIVE"
                ],
                [
                        "id": $(p(anyNonEmptyString()), c("user-id-2")),
                        "name": $(p(anyNonEmptyString()), c("user-name-2")),
                        "email": $(p(anyNonEmptyString()), c("user-email-2@test.com")),
                        "status": "ACTIVE"
                ],
                [
                        "id": $(p(anyNonEmptyString()), c("user-id-3")),
                        "name": $(p(anyNonEmptyString()), c("user-name-3")),
                        "email": $(p(anyNonEmptyString()), c("user-email-3@test.com")),
                        "status": "ACTIVE"
                ]
        ])
    }
}
