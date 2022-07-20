# Richardson Maturity Model ?
<img src="https://github.com/rasitesdmr/Spring-Hateoas/blob/master/images/rm2.png" width="100%" height="50%"/>

## Maven Dependencies 
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-hateoas</artifactId>
    <version>2.6.4</version>
</dependency>
```
## Prerequisites
* Hateoas

## Used Technologies
* Spring Boot Validation
* Lombok
* H2 DB 
* Spring Boot Logging
* Spring Boot Caching
* Spring Boot AOP
* Spring Boot Jpa
* Hateoas

### H2 DB Access
```xml
http://localhost:8080/h2-console
```
## Richardson Maturity Model (Richardson Olgunluk Modeli) ? 
+ Rest API'lerimizi hangi seviyede olgun olduğunu gösteren bir olgunluk seviyesidir.
+ 4 seviyeden oluşur.
+ 0 dan 3'e çıktıkça daha etkin kullanıldığını ifade etmektedir . 

### Bir hizmetin olgunluğunu belirtirken üç ana faktör vurgulanır .
+ En yukarıdaki resimde görüldüğü gibi 
1-) URI(Uniform Resource Identifier)(Tekdüzen Kaynak Tanımlayıcı)
2-) HTTP yöntemleri
3-) HATEOAS(Hypermedia as the Engine of Application State) 
