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

##  H2 DB Access
```xml
http://localhost:8080/h2-console
```
## 📌 Richardson Maturity Model (Richardson Olgunluk Modeli) ? 
+ Rest API'lerimizi hangi seviyede olgun olduğunu gösteren bir olgunluk seviyesidir.
+ 4 seviyeden oluşur.
+ 0 dan 3'e çıktıkça daha etkin kullanıldığını ifade etmektedir . 

### 📌 Bir hizmetin olgunluğunu belirtirken üç ana faktör vurgulanır .
  Yukarıdaki resimde görüldüğü gibi 
* URI(Uniform Resource Identifier)(Tekdüzen Kaynak Tanımlayıcı)
* HTTP yöntemleri
* HATEOAS(Hypermedia as the Engine of Application State) 

## 📌 URI(Uniform Resource Identifier)(Tekdüzen Kaynak Tanımlayıcı) ?
* İnternet üzerindeki bir kaynağın tam yerini işaret eden (resim veya belge ) standart formata uygun bir karakter dizisidir.
* Kısacası bir URL'nin altında bulunan kaynağın tam yolunu işaret eder .
* Örneğin ( https://github.com/rasitesdmr/rasitesdmr )
* URL ile URI arasındaki fark kısacası URL ana kaynağı gösterir , URI ise detayları .

## 📌 HTTP (Hyper Text Transfer Protokol) ?
* Tarayıcı ile sunucu arasında iletişim kurmamıza olanak tanıyan bir protokoldür.
* HTTP metodları şunlarıdır.
+ GET : Sunucudaki kaynaklara erişmek için kullanılır
+ POST : Sunucuya veri göndermek için kullanılır . Fakat bu metotda göndereceğimiz parametreler yalnızca mesaj gövdesinde (body) gönderilmektedir   
+ PUT : Servis sağlayıcı üzerindeki kaynağa Id aracılığıyla güncelleriz .
+ HEAD : Servis sağlayıcı hakkında bilgi almak için kullanılır .
+ PATCH : Kısmi kaynakları güncellemek için kullanılabilir. Örneğin, kaynağın yalnızca bir alanını güncellemeniz gerektiğinde, PUT yöntemiyle eksiksiz bir kaynak gösterimi göndermek yavaş olabilir ve daha fazla bant genişliği kullanır.
+ DELETE : Belirtilen kaynağı kaldırır.

## 📌 HATEOAS ? 
* HATEOAS İngilizce “Hypermedia as the Engine of Application State” cümlesindeki kelimelerin baş harflerinden oluşturulmuş bir kısaltma ve REST API mimarisinin temel özelliklerinden biri. HATEOAS sayesinde istemciler bir REST API’yi nasıl tüketeceklerini bilmeden  o REST API’yi kullanabilirler.
* Bir web sitesine girdiğinizde sayfada yapabileceğiniz işlemlerin linklerini açık bir şekilde görüp, “şuraya tıklarsam giriş yaparım”, “şuraya tıklarsam kategorileri görürüm”, “şuraya tıklarsam önceki sayfaya” giderim demeniz gibi, bir HATEOAS yapısına uygun bir RestApi’de istemciye hangi kaynakla ilgili ne yapabileceğini açıkça söyler.

