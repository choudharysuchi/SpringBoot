SpringBoot with Keycloak Mock

Start the server with any IDE. By default it will be started on port:8080 with keycloak mock server running on port:8000.

To get token - POST http://localhost:8000/auth/realms/composer/protocol/openid-connect/token
To shutdown the server - GET http://localhost:8080/shutdown

To start the server without keycloak, comment out KeycloakMockConfigurer.java file.