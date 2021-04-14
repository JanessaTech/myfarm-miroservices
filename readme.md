This project is about to refactor myfarm project into microservice version project
however I just successfully refactored user module, for the rest of modules, I haven't done it because of time shortage
Besides the user module, I added some modules to show how spring cloud works.
Here are steps to run this demo:
- make sure vm(driver and bigdisk are running)
- run register-server micro service in 2 instances by setting vm parameter --spring.profiles.active=replica1 and --spring.profiles.active=replica2 for each instance
- launch http://127.0.0.1:8761/ verify register-server micro service running well
- run config-server micro service in 2 instances by setting vm parameter --spring.profiles.active=replica1 and --spring.profiles.active=replica2 for each instance
- launch http://127.0.0.1:8761/ to check if config-server is registered successfully
- run example-service micro service in 2 instances by setting vm parameter --spring.profiles.active=replica1 and --spring.profiles.active=replica2 for each instance
- launch http://127.0.0.1:9000/examples/msg ("updated3 config info for dev(master)" will show)
- check http://127.0.0.1:8761/ to verify if EXAMPLE and MYFARM-USER	are registered successfully
- launch http://localhost:8080/v1.0/api/swagger-ui.html