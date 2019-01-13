Pain Point:

(1) It's the first time that I run the db on another server, which leads to that everytime I send Repo REST GET request, the result is always null. After digging around, I realize the Date setup does matter. The root cause is the timezone which solution is to set UTC both in your JVM app and Database. In my example, my service is written in JAVA and running on Spring Boot. So the setup could be like below:
application.yml
  spring:
    properties:
      jdbc:
      time_zone : UTC
https://dba.stackexchange.com/questions/20217/mysql-set-utc-time-as-default-timestamp