# :airplane: Credit Rewards Converter :airplane:

This is the project repo for the JPMC Software Engineering Lite Program, consult the program instructions for more information.

## Building with Maven

The project uses [Maven](https://maven.apache.org/) for dependency management and building. To compile the code and create the project JAR run:

```bash
mvn package
```

This will download any required dependencies and place the compiled classes and a JAR file in the `target/` directory.

## Running the tests

To execute the unit tests simply run:

```bash
mvn test
```

The tests are located under `src/test/java` and will be run automatically by Maven.

## Running RewardsConverter

After building the project you can execute the `RewardsConverter` program. One simple way is to use the compiled classes in `target/classes`:

```bash
java -cp target/classes RewardsConverter
```

You will be prompted to enter a cash value and the program will output the equivalent number of airline miles.
