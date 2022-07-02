## Scala 3 with Spring Boot?

I must be mad, but, someone tried to convince me it was worth it.

Well, it took a morning, but I got a rest end point up with a JPA reading from
postgres, and its, well, really a nothing.  ie if you do this it pulls you back 
from fs2, doobie, monads and you are swimming in the imperative annotation sea again.
May as well code in Java and ... why would you do that?

## Building

### Prerequisites
You'll need to have Java 11 installed and on your PATH. Alternatively, if you're importing this into IntelliJ,
make sure that you are using Java 11 as the project JDK.

### Compiling
This is a Scala sbt (1.6.2 as of this writing) application that can be built simply by running:
```shell
$ sbt compile
```

## Running

### Database
By default the service expects there to be a local instance of PostgreSQL running with the `postgres` user available.

The main entry point of the service is `MainController`, see the file
[src/main/scala/com/jgibbons/scala3springboot/MainController.scala]

Once you launch the service, it will be listening on port 8080 by default.

### Adding a game
You can use `curl` to add a new game as follows:

```shell
$ curl -H "Content-Type: application/json" --data @game.json http://localhost:8080/game
```

### Listing games
```shell
$ curl http://localhost:8080/games
```