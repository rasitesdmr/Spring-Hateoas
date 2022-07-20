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

## H2 DB Access
```xml
http://localhost:8080/h2-console
```
## Richardson Maturity Model (Richardson Olgunluk Modeli) ? 
+ Rest API'lerimizi hangi seviyede olgun olduğunu gösteren bir olgunluk seviyesidir.
+ 4 seviyeden oluşur.
+ 0 dan 3'e çıktıkça daha etkin kullanıldığını ifade etmektedir . 

### Bir hizmetin olgunluğunu belirtirken üç ana faktör vurgulanır .
  Yukarıdaki resimde görüldüğü gibi 
* URI(Uniform Resource Identifier)(Tekdüzen Kaynak Tanımlayıcı)
* HTTP yöntemleri
* HATEOAS(Hypermedia as the Engine of Application State) 

## URI(Uniform Resource Identifier)(Tekdüzen Kaynak Tanımlayıcı) ?
* İnternet üzerindeki bir kaynağın tam yerini işaret eden (resim veya belge ) standart formata uygun bir karakter dizisidir.
* Kısacası bir URL'nin altında bulunan kaynağın tam yolunu işaret eder .
* Örneğin ( https://github.com/rasitesdmr/rasitesdmr )
* URL ile URI arasındaki fark kısacası URL ana kaynağı gösterir , URI ise detayları .
