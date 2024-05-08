### Assignment: Enhance the Student Enrollment System with Advanced Query Features

#### Objective:
Extend the functionality of the existing Student Enrollment System by adding advanced query capabilities to the repository. Implement additional features in the service and controller layers to utilize these queries, and update the Thymeleaf templates to allow users to interact with these new functionalities.

#### Requirements:
1. **Advanced Repository Queries:**
   - Implement custom queries in the repository to allow searching for students based on multiple criteria.
   - Use JPQL or native SQL queries as needed.

2. **Service Layer Updates:**
   - Add methods in the service layer to handle logic for the new repository queries.

3. **Controller Enhancements:**
   - Update the controller to handle new endpoints that will utilize the advanced query methods.

4. **View Modifications:**
   - Modify Thymeleaf templates to include forms and links that allow users to use the new search functionalities.

#### Tasks:

1. **Repository Custom Queries:**
   - Add a method to find students by a combination of name and course.
   - Implement a query to find students who have enrolled within a specific date range.
    > **Hint**
    > ```sql
    > --- *** s.enrollmentDate BETWEEN :start AND :end")
    > ```
   - Create a method to retrieve all students sorted by their enrollment date in descending order.

2. **Service Layer Implementation:**
   - Develop methods in the service class that call the new repository methods.

3. **Controller Adjustments:**
   - Add new routes in the controller to handle requests for each of the new queries.
   - Ensure proper handling of parameters and formatting of the output.

4. **Thymeleaf Template Updates:**
   - Add new forms to the home page to allow searching by the new criteria.
   - Ensure that results are displayed properly on the page.

5. **Testing:**
   - Test all new functionalities to ensure they work as expected without affecting existing features.



#### Evaluation Criteria:
- Correctness: The implemented features should work as specified in the requirements.
- Code Quality: Code should be clean, well-commented, and follow best practices.




This assignment will challenge students to think critically about database interactions, enhance their understanding of Spring Data JPA, and improve their ability to implement user-driven features in a web application.
