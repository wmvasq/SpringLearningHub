# SpringLearningHub
Welcome to SpringLearningHub. Contains some solved exercises about tests and video tutorials.
## How to setup
1. Clone the repository: `git clone -b develop https://github.com/wmvasq/SpringLearningHub.git`
2. Install the required dependencies using Maven: `./mvnw install`
3. Run the application: `/mvnw spring-boot:run`

## Project progress
You can see the progress here [Jira Link](https://wmvasq1.atlassian.net/jira/software/projects/SPRIN/boards/2/roadmap?shared=&atlOrigin=eyJpIjoiMWI3N2IyZGE2NTUxNDY1N2IwZTViOWRjYWE1NjU0NTgiLCJwIjoiaiJ9)

## Usage

Once the application is up and running, you can access it at `http://localhost:8088/api/`. SpringLearningHub provides the following functionality:

Decryptor

Provided a text string, each word delimited by [,: space] must be separated and if the words contain numbers, each word must be ordered according to the total of the sum from minor to major and the numbers will not be displayed

Example

input: he1ll5o,wo2r6ld ho1la2:mu3ndo1

output:
hola mundo world hello world

url:
http://localhost:8088/api/decryptor?token=he1ll5o,wo2r6ld ho1la2:mu3ndo1

## Project Structure

The project follows a standard Spring Boot structure. Here are the key directories and files:

- `src/main/java`: Contains the Java source code.
- `src/main/resources`: Contains configuration files and static resources.
- `src/test`: Contains unit and integration tests.
- `pom.xml`: Maven project configuration file.

## Documentation

You can see  the documentation and try the SpringLearningHub's endpoints in the following link

[Swagger UI](http://localhost:8088/swagger-ui/index.html)

## Contributing

Coming soon...

## License

Coming soon...

## Acknowledgments

Special thanks to the Spring team for their excellent framework and to the community for providing valuable resources and support.

## Contact

For any questions or feedback regarding the SpringLearningHub, feel free to reach out to the project maintainer at wmvasq1@gmail.com
