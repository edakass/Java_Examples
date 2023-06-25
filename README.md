# Java_Examples

### JAVA NOTLAR

## JAVA - 102 NOTES

### Access Modifiers (Erişim Belirleyiciler) ve Sınıf/Nesne Değişkenleri ve Metotları
- Statik değişkenler ve statik metodlar objelere ait değişken ve metod olmaktan çıkıp sınıflara ait değişkenler ve metodlar oluyorlar ve sınıftan bir nesne üretilmeden program çalışır çalışmaz statik metodlar ve statik değişkenler program tarafından hafızaya alınıyor,hafızada yer kaplamış oluyorlar. O yüzden herhangi bir obje üzerinden çağrılmıyorlar , çağrıldığında da bir hata olmuyor ama kullanımı yanlıştır.
- Eğer sınıfa ait metotlardan bir yada birden fazlasının önüne "static" deyimi yazılırsa, o metotlar sınıf metodu olurlar. Sınıf metotlarının en önemli özelliği, ilgili sınıfa ait nesne oluşturmadan sınıf metodu çağırılabilir. Bir sınıf değişkeninin, henüz nesne oluşturulmasa da bellekte fiziksel olarak yer kaplar
- Static, nesnelerden değilde sınıflardan ulaşılmak isteniyor
- https://academy.patika.dev/courses/java-102/static (tekrar çalış)
-  Javada eğer bir sabit tanımlanıyorsa buyuk harfle tanımlanır
-  Main metodu için hangi erişim belirleyici kullanılmalıdır ? --> public
- Statik metotlar yalnızca diğer statik metotlar tarafından çağrılır.
- Statik metotlar yalnızca statik değişkenlere erişebilir.
- Statik metotlar this anahtar sözcüğünü kullanmaz.
### Nesne Yönelimli Programlamanın 4 Temel İlkesi ve Interface
- Encapsulatıon (Kapsülleme)
- Inheritance (Kalıtım)
- Polimorphism (Çok Biçimlilik)
- Abstraction (Soyutlama)

**public final double  PI_SAYISI = 3.14;**


- Access Modifiers
Sınıflarda sadece public kullnaılabılıyor. Protected ve private kullanılamıyor.
- 


- Singleton |
  
  https://stackoverflow.com/questions/3312611/pipe-operator-in-java
  
  https://stackoverflow.com/questions/32444498/why-is-the-bitwise-or-operator-used-when-catching-multiple-exceptions-in-j




www.patika.dev 


------------------------------------------------------------------------------

Abstract Class

Hiyerarşinin en tepesinde bulunan sınıfın kendisinden türetilecek olan alt sınıflar için ortak bir arayüz (interface) görevi yapması istenebilir. Bunun için çözüm olarak oluşturulan metotlara ve sınıflara soyut metot (abstract method) ya da soyut sınıf (abstract class) denir.

Java'da soyutlama (Abstraction), nesne yönelimli programlamanın yapı taşlarından biridir. Java'da soyutlama, gereksiz ayrıntıları göz ardı ederek bir nesnenin yalnızca gerekli özelliklerini belirleme işlevi olarak da nitelendirilebilir.

İleri seviye git ' teki stash kavramını araştırmalısın

https://www.kodkampusu.com/javada-soyutlama-abstraction/

### Commit Nedir?

Git'e eklediğimiz dosyaları kalıcı olarak Git veri tabanına işlemye denir.

### amend komutu ne işe yarar?

Son commit işleminizi yeniden yapmak için kullanılır.

### Stash pop ile Stash apply arasındaki farklar nelerdir?

git stash pop, üst stashed öğesini uygular ve yığından kaldırır. git stash apply da aynısını yapar, ancak bunu yığın yığınında bırakır.

-----------------------------------------------------------------

Sınıflar birbirlerinin nitelikleri olabilirler.

Çalışmam gerekenler :

- yazılım prensipleri nelerdir

- Design pattern mantığını Singleton,Builder,Factory vb bilmek

- Socket programlama

- File IO(input/output)

- Transaction yönetimi

- Token

- Swagger


### IntelliJ Hakkında

genelde kullanacağım alt+insert

Spring Boot bir framework değildir. Sadece Spring Framework kütüphanelerini kullanır.

Spring Data:ORM(Jpa,Hibernate) temelli database işlemlerimizi java classları üzerinde yazmak ve yönetmeyi sağlar.

Spring Rest:Yazdığımız projemizi diğer teknolojilerle haberleşmesini sağlamak için kullanıyoruz.

Spring Security:Projemizin daha güvenilir olmasını sağlar. Roller verebiliriz, hangi classın url izin vermemizi veya izin vermemizi sağlar.


Postman

Dünyada en popüler Client uygulamasıdır
Serviste yazdığımız CRUD işlemlerini test etmeye yarar.


@SpringBootApplication ==> projemizin çalıştırılacak olan classtır

@EnableAutoConfiguration ==>

@ComponentScan ==> projedeki tüm komponentleri taramak ve repository,service,controller hazır hale gelmesini sağlar.

https://app.patika.dev/courses/java-spring-boot/spring-boot-nedir



Sorular 

-buble sort,buffered,trim,unit test


![image](https://user-images.githubusercontent.com/61595808/200034300-ea700c7e-6eb1-4dc4-a89c-54d9955a72b5.png)


char ile ilgili örnekler https://merttopuz.com/yazilim/java/java-char
