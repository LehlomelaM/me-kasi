# me-kasi


Website that will empower users to discover hidden treasures and unique shops in their neighborhoods.




## Domain Model
Here's a breakdown of the business logic and **potential** Java classes for the app:

**Business**
- `name` (String)
- `address` (Address class) - holds street, city, state, zip code
- `phoneNumber` (String)
- `website` (String)
- `category` (String) - niche category if applicable
- `description` (String)
- `photos` (List<String>) - URLs or file paths for photos
- `videos` (List<String>) - URLs for videos (optional)
- `averageRating` (double) - calculated based on reviews
- `reviews` (List<Review>) - references Review class

**Address**
- `street` (String)
- `city` (String)
- `state` (String)
- `zipCode` (String)

**Review**: This class will represent a user review with details like:
- `userId` (int) - foreign key referencing User class
- `businessId` (int) - foreign key referencing Business class
- `rating` (int) - star rating
- `comment` (String)

## User Model
   
User: registered user with details:
- `id` (int) - primary key
- `username` (String)
- `password` (String) - securely hashed and stored
- `firstName` (String)
- `lastName` (String)
- `favorites` (List<Business>) - businesses marked as favorites 

## Data Access Layer

BusinessRepository:
ReviewRepository:
UserRepository: 

## Service Layer

- **BusinessService**: This class will handle business logic related to searching for businesses, retrieving details, and potentially managing user interactions like adding favorites. It would interact with the BusinessRepository.
- **ReviewService**: This class will manage functionalities related to user - reviews, like adding, retrieving, and calculating average ratings for businesses.
- **UserService**: this class will manage user registration, login, and profile management.

## Presentation Layer

    

## Relationships and Connections

- A Business object can have many Review objects.
- A Review object belongs to a specific Business.
- A User object can have many favorite Businesses.
- A Business object can have one Address object.
- Each Repository class interacts with its corresponding domain object(Business, Review, User) for data access.
Service classes use repositories to perform business logic and retrieve data.

