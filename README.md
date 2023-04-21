# User Management System
This is a API project for insert, read, update, and delete User.

![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot) ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

## Frameworks and Languages
![Java v17](https://img.shields.io/badge/Java-v17-green) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-v3.0.5-brightgreen)

---

## Model
- ### User Properties
    - UserId
    - UserName
    - Address
    - PhoneNumber
---
## Dataflow
- ### End Points / Controllers
    - `addUser` 
    - `getUser/{userId}`
    - `getAllUser`
    - `updateUserInfo`
    - `deleteUser/{userId}`
- ### Services
    - For adding user
        ```java
        public String addUser(User newUser)
        ```
    - For getting user based on Id
        ```java
        public User getUserById(int userId)
        ```
    - For getting all the users
        ```java
        public List<User> getAllUsers() 
        ```
    - For updating user info
        ```java
        public String updateUser(User updatedUser) 
        ```
    - For deleting an user
        ```java
        public List<User> getAllUsers() 
        ```
- ### Repository
    - Getting all the users from data source
        ```java
        public List<User> getAllUsersFromDataSource()
        ```
    - Saving the user into the data source
        ```java
        public boolean insertUser(User newUser)
        ```
    - Removing user from the data source
        ```java
        public void remove(User user)
        ```
- ### Database
I haven't used any **Database** in this project yet. But for data storing I have used an `Collections`.

```java
private List<User> userList;
```
---
## Datastructures
- `List<>`
---
## Summary
This API is a `Spring Boot` project that is about managing users. We can create, read, update, and delete user.

