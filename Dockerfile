~~(Missing HEALTHCHECK instruction)~~>FROM dragonwell-registry.cn-hangzhou.cr.aliyuncs.com/dragonwell/dragonwell:17
# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring
copy newrelic.jar /newrelic.jar
COPY ./target/account-access-consents-services.jar account-access-consents-services.jar
ENTRYPOINT ["java", "-javaagent:/newrelic.jar" "-jar", "/account-access-consents-services.jar"]
USER appuser
