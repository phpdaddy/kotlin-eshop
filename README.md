# KotlinEshop: A Kotlin Full-stack Eshop Example

## Backend

The backend of KotlinEshop is built using [Ktor](https://github.com/kotlin/ktor), a Web framework built by the Kotlin team.
For data persistence, it uses [H2](http://www.h2database.com), allowing you to run the example without the need to configure
an external SQL server. The HTTP server implementation is provided by [Jetty](http://www.eclipse.org/jetty/).

To run the backend, use `./gradlew backend:run`, or open KotlinEshop as a project in IntelliJ IDEA and execute the shared 
run configuration `Backend :: Jetty`. This will start serving the REST API of the backend on port 9090.

## Frontend

The frontend of KotlinEshop is built using [React](https://facebook.github.io/react/). To adapt the Vue APIs to Kotlin,
it incorporates a set of wrappers, which
you can also use in your projects and adapt to your needs.

The project is built using webpack and the [Kotlin frontend plugin](https://github.com/kotlin/kotlin-frontend-plugin). 

To run the frontend, use `./gradlew frontend:run`. This will start a webpack server on port 8080. Navigate to http://localhost:8080 
to start using the application.
