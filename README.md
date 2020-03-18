# agent-api

AAFC DINA agent module implementation.

See DINA agent module [specification](https://github.com/DINA-Web/agent-specs).


## Documentation

To generate the complete documentation:
```
mvn clean compile
```

The single HTML page will be available at `target/generated-docs/index.html`

## To Run

For testing purpose or local development a [Docker Compose](https://docs.docker.com/compose/) example file is available in the `local` folder.
Please note that the jar running in the container will be the jar currently available in the `target` folder.

Create a new docker-compose file from the example:
```
cp local/docker-compose.yml.example docker-compose.yml
```

Start the app:
```
docker-compose up --build
```

