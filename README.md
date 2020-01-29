# Microservices application with Java, Rest and Spring Boot
The purpose of this project is to demonstrate the use of **Spring Boot** and Http Rest service to create a simple Microservices application.
# Flow
```mermaid
graph LR
A[Angular] -- HTTP --> B[Rest Api Service] 
B -- HTTP--> C[Rest Api Service]
```
# Run
You can run this application in three way:
- In starting the three apps individually.
- Using Docker-compose included.
- Minikube with de yaml deployment files in k8s
## Configurations
- Enter these lines in the hosts file
127.0.0.1 api-service
127.0.0.1 sayhello-service
## Individual start
### Steps
- In the folder server : gradle bootRun
- In the folder client : gradle bootRun
- In the folder angular : ng serve --open
### Test
After open the browser to: http://localhost:4200/sayhello
## Docker-compose
### Steps
-Use docker-machine ip to find your ip ex:  192.168.99.100
-Change the docker-compose.yml to correctly setting environment.ts file
-See the environment.ts file sample in docker compose
-In the folder docker-compose : docker-compose ip -d
### Test
After open the browser to: http://192.168.99.100:4200/sayhello
## Minikube
### Steps
- In the folder k8s run: kubectl apply -f *.yaml
- Forward the port: kubectl port-foward my-angular-pod 4200:4200
### Test
After open the browser to: http://localhost:4200/sayhello
# Build Docker
- docker build -t jonathanlareau/spring-boot-java-http-client --build-arg JAR_FILE=./build/libs/client-0.0.1-SNAPSHOT.war .
- docker build -t jonathanlareau/spring-boot-java-http-server --build-arg JAR_FILE=./build/libs/server-0.0.1-SNAPSHOT.war .
- docker build -t jonathanlareau/simple-angular-hello .
- docker login
- docker push jonathanlareau/spring-boot-java-http-client
- docker push jonathanlareau/spring-boot-java-http-server
- docker push jonathanlareau/simple-angular-hello
# ToDo
- Setup a Nginx Ingress
