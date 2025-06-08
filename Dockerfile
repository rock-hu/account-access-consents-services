FROM dragonwell-registry.cn-hangzhou.cr.aliyuncs.com/dragonwell/dragonwell:17
# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring
ADD ./target/account-access-consents-services.jar account-access-consents-services.jar
ENTRYPOINT ["java","-jar","/account-access-consents-services.jar"]
