# Rest-API-with-MySQL
This project is a Spring Boot-based RESTful API for managing user information. It allows users to perform common operations such as creating, updating, retrieving, and deleting user data. The project is built using the Spring MVC framework and leverages Spring Dependency Injection to manage service layers. It includes:

User Controller: Exposes several API endpoints for CRUD operations on user data.
UserDTO: Data transfer object used for managing user details.
UserService: Contains the business logic for handling user operations.
Key Features:

GET /getUser: Retrieves a list of all users.
POST /saveUser: Saves a new user to the database.
PUT /updateUser: Updates an existing user's information.
DELETE /deleteUser: Deletes a user from the database.
GET /getUserByUserId/{userId}: Retrieves a user by their unique user ID.
GET /getUserByIDAndEmail/{userId}/{email}: Retrieves a user based on both user ID and email.
This API uses Cross-Origin Resource Sharing (CORS) to allow requests from different origins and follows standard RESTful principles.

