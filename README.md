# Java_Examples

### JAVA NOTLAR

## JAVA - 102 NOTES

### Access Modifiers (Erişim Belirleyiciler) ve Sınıf/Nesne Değişkenleri ve Metotları
-  Access Modifiers
  
Sınıflarda sadece public kullnaılabılıyor. Protected ve private kullanılamıyor.
- Statik değişkenler ve statik metodlar objelere ait değişken ve metod olmaktan çıkıp sınıflara ait değişkenler ve metodlar oluyorlar ve sınıftan bir nesne üretilmeden program çalışır çalışmaz statik metodlar ve statik değişkenler program tarafından hafızaya alınıyor,hafızada yer kaplamış oluyorlar. O yüzden herhangi bir obje üzerinden çağrılmıyorlar , çağrıldığında da bir hata olmuyor ama kullanımı yanlıştır.
- Eğer sınıfa ait metotlardan bir yada birden fazlasının önüne "static" deyimi yazılırsa, o metotlar sınıf metodu olurlar. Sınıf metotlarının en önemli özelliği, ilgili sınıfa ait nesne oluşturmadan sınıf metodu çağırılabilir. Bir sınıf değişkeninin, henüz nesne oluşturulmasa da bellekte fiziksel olarak yer kaplar
- Static, nesnelerden değilde sınıflardan ulaşılmak isteniyor
- https://academy.patika.dev/courses/java-102/static (tekrar çalış)
-  Javada eğer bir sabit tanımlanıyorsa buyuk harfle tanımlanır
-  Main metodu için hangi erişim belirleyici kullanılmalıdır ? --> public
- Statik metotlar yalnızca diğer statik metotlar tarafından çağrılır.
- Statik metotlar yalnızca statik değişkenlere erişebilir.
- Statik metotlar this anahtar sözcüğünü kullanmaz.
**public final double  PI_SAYISI = 3.14;**


### Nesne Yönelimli Programlamanın 4 Temel İlkesi ve Interface
- Encapsulatıon (Kapsülleme)

Sarmalama ilkesi, bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir. Bu ilke sayesinde nesnelerde oluşacak anlamsızlıkların önüne geçilebilir.

Buna örnek olarak da kitap lı örnek akla gelebilir,kitap sayısı negatif olamaz vs, Encapsulatıon da get/set kullanımı dusunulmelı

- Inheritance (Kalıtım)
- Polimorphism (Çok Biçimlilik)
- Abstraction (Soyutlama)


- Sınıflar arası oluşturulabilecek 3 temel ilişki vardır ;
- Bağımlılık (Dependency) , (uses a , student ve course ornegı mesela mat dersının ortalamasını hesaplandı https://academy.patika.dev/courses/java-102/sinif-iliskiler )
- Birleştirme (composition) , (has a, araba nın olması ıcın motor ve tekerlek sınıfına ıhtıyacı var)

- Kalıtım (inheritance) , (is a) (ata sınıf olusturulup tekrardan yazmayalım ıstıyoruz)
      - (calısan ısımlı bır super class olusturuluyor,asistan ve benzerı sub classlar olusturulup . super class kullanılıyor)
      - super() ı sadece constructorlar ıle kullanıyoruz


https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html


Encapsulation (Kapsülleme) : Sınıfa ait niteliklerin anlamsızlaşmasını engelleyen bir yoldur.

Kapsülleme kullanılarak Abstraction özelliği kullanılabilir.

Metodlarda Geçersiz Kılma (Method Overriding) : Üst sınıfındaki bir metot ile aynı isime ve parametrelere sahip olan alt sınıf metotlara denir.

Çok Biçimlilik(Polymorphism)
- Nese Yönelimli Programlama ilkesidir.
- Programın okunabilirliğini kolaylaştırır.
- Bir sınıfa ait miras alınan davranışın yeniden tanımlanmasını sağlar.


Çok Biçimliliğin kullanılmasının en büyük nedeni nedir ?
- Program daha şık tasarıma sahip olacak ve bakımı ve güncellenmesi daha kolay olacaktır.


Public Erişim Belirleyicisi interface için kullanılır.


### Nested Sınıflar, Generic Yapılar <T>

- Wrapper sınıflar sayesinde, ilkel veri tiplerini (int,byte,sort vs.) nesne (object) olarak kullanmamızı sağlayan sınıflardır.
- Nested sınıflar 2 ana kategoriye ayrılır .
- Wrapper sınıfların kullanım amacı "İlkel veri tiplerinin nesne gibi davranmasını sağlamak."
- Autoboxing ve Unboxing kavramlarının amacı “İlkel veri tiplerinin Sarmalıyıcı(Wrapper) sınıfları arasındaki dönüşümleri otomatik yapan yapıdır.
- Jenerikler Tip güvenliği sağlar ve Kod tekrarının önüne geçer.
- Diamond operatörünün sağladığı avantajlar
  
     - Java derleyicisinin jenerik türü otomatik olarak tespit etmesini sağlar.
       
     - Programdaki denetlenmemiş uyarıları önler.
       
     - Bir nesne oluştururken jeneriklerin kullanımını basitleştirir.

  - Generic , bir method ya da bir classın, yazılımcının türden bağımsız olarak oluşturduğu, kullanıldığı yere göre türlerinin belirlenip bu tür üzerinden işlem yapılmasını sağlayan yapılardır. En yaygın örneği ArrayList<>'tir.

## Exception Handling (Hata Yakalama)

- bir hata oluştuğu zaman programın çalışması sona erer.
- Java'da Exception'lar birer sınıftır.
- https://academy.patika.dev/courses/java-102/exception
- Error : Programdaki ciddi hatalı temsil eder. JVM tarafından iletilen uygulama dışında oluşan hatalardır. Bu tip hatalar da "Unchecked Exceptions" tipindedir. Örneğin veritabanı sunucusuna bağlanmaya çalışınca bağlantı hatası verirse bunu ancak çalışma zamanında anlayabiliriz.
- Exception : Kullanıcı tanımlı Exception sınıfları dahil olmak üzere tüm Exception alt sınıflarının ATA sınıfıdır. "RuntimeException" dışındaki tüm Exception hataları "Checked Exceptions" tipindedir. Bu hata tipleri daha derleme aşamasında belirtilir. Bu hatalara göz önününde bulundurarak bir kod yazmamızı bizden bekler.

- Error : yakalanamayan tüm istisnaları yakalayabilir
- Exception : istisnaları tanımlamak için kullanılır
- anahtar kelimelerden hangisi istisna işlemenin bir parçası değildir - try
  parcası olanlar (finally, throw, catch)

## Collection ve Map Interface

- Iterator , listeleri gezmemizi sağlıyor

- HashSet : hashsetlerin gelen veri ile çıkan verinin sırasının farklı oluyor.
- LinkedSet : giren sıra ile çıkan sıra aynı oluyor.
- Hashlerde arka planda çalışan bir algoritma var ona göre çalışıyor
- List interface (Arayüzü) : Veriler, geliş sırasına göre (ordered) tutulur.
- List'lerin her elemanı bellekte kendine özgü bir alan tutar. List üzerinde veri ekleme ve bu verilere erişme indis(index) denilen integer sayılar üzerinden yapılır. Başlangıç indisi sıfırdır.
- List Interface'inden kalıtım alan sınıflarda, tekrarlı (duplicate) veya null değerli elemanlar tutulabilir.
- ArrayList Sınıfı : Default boyutu 10’dur.
- ArrayList sınıfı thread-safe değildir. Bir ArrayList’e aynı anda birden fazla thread erişebilir. Bu durum veri bütünlüğünü bozar.
- Vector eskiden kalmış yapılar
- Queue LinkedList de get ıle cagrımayıruz.
- Map ve Collectionlar farklı
- Collection sınıflarından ArrayList dinamik bir dizi tanımlar.
- ArrayList nesnesinin kapasitesini manuel olarak artırmak için  metotlardan ensureCapacity() kullanılabilir.
- Bir ArrayList nesnesinden statik bir dizi elde etmek için toArray() metotlardan kullanılabilir.
- Dinamik bir dizi oluşturmak için ArrayList & Vector kullanılabilir.
- Map içinde belirtilen anahtara sahip bir elemanı elde etmek için Map sınıfı get() metotu kullanılır.
- Hashmap sınıfı sıralı bir koleksiyon değildir.
  
- TreeMap sınıfı ile ilgili
  
      - Map interface den kalıtım almıştır.
  
      - Veri kümesine konulan elemanların verdiğiniz kurama göre sıralanmasını sağlar.
  
      - Verileri anahtar değer ilişkisine göre depolar. 


---------------------
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
