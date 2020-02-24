#FROM java
FROM ibmjava:jre
#ADD ./target/qs-action-1.0.0.jar /qs-action-1.0.0.jar
ADD ./target/qs-action-1.0.0-jar-with-dependencies.jar /qs-action-1.0.0-jar-with-dependencies.jar
ADD ./run.sh /run.sh
RUN chmod a+x /run.sh
CMD /run.sh
