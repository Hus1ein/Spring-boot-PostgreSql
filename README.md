# Spring-boot-PostgreSql
Connecting Spring boot web application with PostgreSQL

## Pull PostgreSQL image and run new container
```bash
docker container run -d -p 5432:5432 --name container_name -e POSTGRES_PASSWORD=PASSWORD -e POSTGRES_USER=USERNAME -e POSTGRES_DB=db_name postgres
```
This command will pull postgreSQL image, run container, create user, set password and create default database.


