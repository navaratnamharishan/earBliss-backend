
Ear-Bliss-Backend

Overview
Ear-Bliss is a full-stack e-commerce website that includes a backend built with Java using Spring Boot. This backend supports the Ear-Bliss front end, allowing users to log in, register, and manage their shopping cart for earphones (wired and wireless).

Features
- User authentication (login and registration)
- API endpoints for product management
- Database connection to store user and product information
- Seamless integration with the Ear-Bliss front end

 Technologies Used
- Java
- Spring Boot
- MySQL


 Getting Started

Prerequisites
- JDK (Java Development Kit)
- IntelliJ IDEA (or any preferred IDE)
- MySQL Server

 Installation
1. Clone the repository:
   bash
   git clone https://github.com/yourusername/Ear-Bliss-Backend.git
  
2. Open the project in IntelliJ IDEA.

3. Configure the MySQL database:
   - Ensure your MySQL server is running.
   - Create a database for the project.
   - Update the database connection settings in the `application.properties` file.

4. Build and run the application:
   - Use IntelliJ IDEA to run the Spring Boot application.
   - The backend server will start, typically on `http://localhost:8080`.

Running the Application
Before running the front end, ensure the backend and MySQL server are running. Once the backend is up and running, you can start the front end by navigating to its directory and running:
bash
npm start

Then, open your browser and go to `http://localhost:3000`.

 Important Note
To ensure everything works perfectly, always start the backend first, followed by the front end. The front end relies on the backend for data retrieval and user authentication.

 Contributing
If you'd like to contribute to the project, please fork the repository and submit a pull request.

 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

