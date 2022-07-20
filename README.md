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

## 📌 Bir hizmetin olgunluğunu belirtirken üç ana faktör vurgulanır .
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
* Başka örnek verecek olursam bir kişinin kaydını getirmek için rest üzerinden gelen cevabın içerisinde o restin diğer yapabileceği tüm yeteneklerinde görülebileceği bir yapı sağlamaktadır. Projemizde başka Rest işlemleri eklediysek silme, güncelleme gibi işlemleri yapabilmek için hangi rest yolunun kullanılması gerektiği gibi bilgileri görüntüler.
* Şimdi gelelim 0 dan 3' e kadar olan adımlara .

<img src="https://github.com/rasitesdmr/Spring-Hateoas/blob/master/images/rm3.jpg" width="100%" height="50%"/>

## 📌 Level 0 : The Swamp of POX (POX bataklığı ) ?
* Sıfır olgunluk düzeyi URI , http yöntemleri ve hateoas yeteneklerinden hiçbirini kullanamaz.
* Tek bir URI sahiptir.
* Tek bir HTTP yöntemine sahiptir.
* Örnek verirsek : 
* Verileri almak için       POST http://localhost:8080/users
* Verileri göndermek için   POST http://localhost:8080/users 

## 📌 LEVEL 1 : Multiple URI based resource and single verb ? 
* Birçok URI'yi kullanır.
* Tek bir HTTP yöntemine sahiptir.
* Örnek verirsek : Bir şirkette çalışanlara erişmemiz gerekiyor.
* Belirli bir departmana bir çalışan eklemek için (POST/department/department-id/employee)
* Belirli bir çalışana erişmek için (POST/department/department-id/employee/employee-id)
    
## 📌 LEVEL 2 : Multiple URI based resource and HTTP verbs ?
*	Çok sayıda URI ‘ yi kullanabiliriz.
*	HTTP yöntemlerini kullanırız (CRUD işlemleri).
    
## 📌 LEVEL 3: HATEOAS ? 
* Level 3 en olgun seviyedir .
* Hizmet tüketicileri bir kaynak iz boyunca yönlendirerek, sonuç olarak uygulama geçişlerine yardımcı olur.

## 📌 Şimdi gelelim kodlara

<img src="https://github.com/rasitesdmr/Spring-Hateoas/blob/master/images/rm4.jpg" width="35%" height="50%"/>       

* RepresentationModel - bir Bağlantı koleksiyonu için bir kapsayıcıdır ve bu bağlantıları modele eklemek için API'ler sağlar.

<img src="https://github.com/rasitesdmr/Spring-Hateoas/blob/master/images/image.png" width="65%" height="50%"/>   

* WebMvcLinkBuilder – Spring MVC denetleyicilerine işaret eden Link örnekleri oluşturmayı kolaylaştırmaya yardımcı olur.
* linkTo() yöntemi , denetleyici sınıfını inceler ve kök eşlemesini alır.
* methodOn - Gelen isteğin kullanılacağı class ve hangi metodun hangi parametre olarak işlem yapacağını belirtir.
* withSelfRel() - Aynı URI'ye işaret eden ancak kendi kendine ilişkisi olan bir Bağlantı döndürür.

## 📌 Uygulamamızı çalıştırıp Postman de görelim

* Postman'den kullanıcılarımızı listeleyelim .

<img src="https://github.com/rasitesdmr/Spring-Hateoas/blob/master/images/rm5.jpg" width="35%" height="50%"/>

