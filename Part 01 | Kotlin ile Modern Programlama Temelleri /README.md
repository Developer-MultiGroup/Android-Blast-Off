# Kotlin ile Modertn Programlama Temelleri


## ✅ 1. Kotlin’e Giriş

Kotlin, JVM üzerinde çalışan, modern, açık kaynaklı ve statik tipli bir programlama dilidir. Java ile birlikte çalışabilir (interoperable) ve özellikle Android geliştirme için tercih edilir. Temiz sözdizimi, fonksiyonel özellikleri ve null güvenliği gibi avantajları ile öne çıkar.

```kotlin
fun main() {
    println("Merhaba Kotlin!")
}

```

## ✅ 2. Değişkenler – val, var, lateinit

Kotlin'de iki tür değişken tanımlanır:

- val: Değeri değiştirilemez (immutable) değişken.
- var: Değeri değiştirilebilir (mutable) değişken.
- lateinit: Değişkenin daha sonra başlatılacağını belirtir (sadece var ve sınıf içinde kullanılabilir).

```kotlin
val sabit = 10
var degisken = 5

lateinit var isim: String

fun ata() {
    isim = "Ahmet"
    println(isim)
}
```

## ✅ 3. Primitive Veri Tipleri

Kotlin'de yaygın olarak kullanılan temel veri tipleri şunlardır:

```kotlin
val tamSayi: Int = 42
val ondalik: Double = 3.14
val karakter: Char = 'A'
val mantiksal: Boolean = true
val metin: String = "Merhaba"
```

## ✅ 4. Koşullar – if, else, when

Koşul ifadeleri, program akışında karar vermek için kullanılır. Belirli bir koşul doğruysa bir kod bloğu çalıştırılır, yanlışsa başka bir kod bloğu çalıştırılabilir.

- if - else yapısı en temel karar yapısıdır. Bir koşul kontrol edilir, eğer koşul doğruysa `if` bloğu çalışır; değilse `else` bloğu çalışır. `else` bloğu isteğe bağlıdır.

```kotlin
val not = 85
if (not >= 50) {
    println("Geçti")
} else {
    println("Kaldı")
}
```
- `when` yapısı, Kotlin'de `switch-case` yapısına benzer ancak çok daha esnek ve güçlüdür. Bir değeri veya koşulu birçok farklı ihtimalle karşılaştırmak için kullanılır.

**when'in çalışma prensibi:**

- `when` ifadesi parantez içine yazılan değişkenin veya ifadenin değerine göre dallanır.
- Her durum için bir blok belirtilir ve koşula uyan ilk durumun bloğu çalışır.
- `else ifadesi, tüm durumlara uymayan koşullar için kullanılır, yani default (varsayılan) durumdur.
- when hem değer karşılaştırmaları yapabilir hem de koşul ifadeleri içerebilir.

```kotlin
val not = 85

val harf = when (not) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    else -> "F"
}

println(harf)  // B yazdırır
```
Burada `when`, `not` değişkeninin değer aralığını kontrol ediyor. `in 90..100` ifadesi, 90 ile 100 arasındaki değerleri kapsar.

`when` ayrıca doğrudan koşul ifadeleri de alabilir:

```kotlin
val sonuc = when {
    not >= 90 -> "Mükemmel"
    not >= 75 -> "İyi"
    not >= 50 -> "Geçer"
    else -> "Kaldı"
}
```

Bu kullanımda `when` herhangi bir değişkenle kısıtlanmaz, sırayla her koşul değerlendirilir ve doğru olanın bloğu çalışır.

## ✅ 5. Koleksiyonlar – List, Set, Map

Kotlin’de verileri gruplamak için kullanılan koleksiyonlar immutable ve mutable olarak ikiye ayrılır.

- **List:** Elemanların sıralı olduğu, indeksle erişilen koleksiyon. `listOf` ile oluşturulur ve değiştirilemez. Değiştirilebilir liste ise `mutableListOf` ile oluşturulur.

- **Set:** Benzersiz elemanlardan oluşan koleksiyon.

- **Map:** Anahtar-değer çiftlerinden oluşan koleksiyon.

### Örnekler:

```kotlin
val liste = listOf("A", "B", "C")   // Değiştirilemez liste
val mutableListe = mutableListOf("X", "Y")  // Değiştirilebilir liste
mutableListe.add("Z")  // Eleman eklenir

val set = setOf(1, 2, 3)  // Benzersiz elemanlar
val map = mapOf("ad" to "Ali", "yas" to 25)  // Anahtar-değer çifti

```
## ✅ 6. Döngüler

Döngüler, belirli bir işlemi tekrar etmek için kullanılır. Kotlin’de en sık kullanılan döngü türleri:

- `for:` Belirli aralıktaki veya koleksiyondaki elemanlar üzerinde yineleme yapar.
- `while:` Koşul doğru olduğu sürece döngüyü sürdürür.

### Örnekler:

```kotlin
for (i in 1..3) {
    println("Sayı: $i")
}

val meyveler = listOf("Elma", "Armut")
for (meyve in meyveler) {
    println(meyve)
}

var x = 5
while (x > 0) {
    println(x)
    x--
}
```

*`1..3` ifadesi 1’den 3’e kadar (3 dahil) sayılar anlamına gelir.*

## ✅ 7. Fonksiyonlar

Fonksiyonlar, belirli işleri yapan kod bloklarıdır ve yeniden kullanılabilirliği sağlar.

- Parametre alabilirler.
- Geri dönüş tipi olabilir veya olmayabilir.
- Varsayılan parametre değerleri verilebilir.
- Tek satırlık fonksiyonlar kısaca yazılabilir.

### Örnekler:

```kotlin
fun selamla(isim: String = "Ziyaretçi") {
    println("Merhaba $isim!")
}

fun topla(a: Int, b: Int): Int {
    return a + b
}

fun kare(x: Int) = x * x
```

## ✅ 8. Nesne Yönelimli Programlama (OOP)

Nesne Yönelimli Programlama, gerçek dünyadaki nesneleri ve ilişkilerini modelleyerek programlama yapmayı sağlar. Kotlin’de OOP, sınıflar (classes), nesneler (objects), özellikler (properties) ve fonksiyonlar (methods) üzerinden gerçekleştirilir.

### Temel Kavramlar

- **Sınıf (Class):** Nesnelerin şablonu, yani özelliklerini ve davranışlarını tanımlar.
- **Nesne (Object):** Sınıfın somut örneği, bellekte oluşturulan varlıktır.
- **Özellik (Property):** Nesnenin sahip olduğu veri.
- **Metod (Method):** Nesnenin yapabileceği işlemler.

### Örnek

```kotlin
// Araba sınıfı marka ve model özelliklerine sahip
class Araba(val marka: String, val model: Int) {
    // Bilgi döndüren fonksiyon
    fun bilgi() = "$marka $model"
}

// Araba sınıfından nesne oluşturma
val araba = Araba("Honda", 2022)

// Nesnenin fonksiyonunu çağırma
println(araba.bilgi())  // Çıktı: Honda 2022
```

### Açıklama

- `class Araba` ile bir sınıf tanımlanır.
- `val marka` ve `val model` sınıfın özellikleridir.
- `bilgi()` fonksiyonu, sınıfa ait bir davranıştır ve araba ile ilgili bilgiyi döndürür.
- `Araba("Honda", 2022)` ifadesi sınıftan bir nesne (örnek) oluşturur.
- `println(araba.bilgi())` ile nesnenin fonksiyonu çağrılır ve çıktı alınır.

OOP sayesinde programlar daha düzenli, okunabilir ve yönetilebilir olur. Ayrıca kod tekrarını azaltır ve büyük projelerde kolay bakım sağlar.

## 9. ✅ Encapsulation (Kapsülleme)

Encapsulation, verilerin dış erişime kapatılıp kontrollü erişim sağlanmasıdır. Bu sayede sınıfın iç durumu korunur.

### Örnek:

```kotlin
class Kisi(private var isim: String) {
    var yas: Int = 0
        set(value) {
            if (value >= 0) field = value
        }

    fun bilgi() = "$isim - $yas"
}
```
Burada `isim` değişkeni dışarıdan doğrudan erişilemez. `yas` için setter tanımlanmış ve negatif değer ataması engellenmiştir.


## ✅ 10. Inheritance (Kalıtım)

Kalıtım, bir sınıfın başka bir sınıftan özelliklerini ve davranışlarını devralmasıdır. Bu sayede kod tekrarını azaltır ve sınıflar arasında hiyerarşik ilişkiler kurulabilir.

### Temel Kavramlar

- **Super Class (Ana/Süper Sınıf):** Özellik ve davranışları diğer sınıflara aktaran temel sınıf.
- **Sub Class (Alt Sınıf):** Süper sınıfı miras alan, onun özelliklerini ve fonksiyonlarını kullanabilen ve gerekirse üzerine yenilerini ekleyebilen sınıf.
- **override:** Alt sınıf, süper sınıftaki fonksiyonu kendi ihtiyacına göre değiştirebilir. Bu işlem için `override` anahtar kelimesi kullanılır.
- **open:** Kotlin’de sınıflar ve fonksiyonlar varsayılan olarak `final`dır, yani kalıtıma kapalıdır. Bir sınıfın veya fonksiyonun kalıtılabilir olması için `open` olarak işaretlenmesi gerekir.

### Örnek

```kotlin
// Açık (open) Hayvan sınıfı, kalıtım için izin verir
open class Hayvan {
    open fun ses() = "..."
}

// Kedi sınıfı, Hayvan sınıfından türetilir ve ses() fonksiyonunu kendi sesine göre değiştirir
class Kedi : Hayvan() {
    override fun ses() = "Miyav"
}

// Fonksiyon parametre olarak Hayvan tipinde nesne alır ve sesini çalar
fun sesiCal(h: Hayvan) {
    println(h.ses())
}

val h: Hayvan = Kedi()
sesiCal(h)  // Çıktı: Miyav
```

### Açıklama

- `open class Hayvan` ile kalıtılabilir bir sınıf tanımlanır.
- `open fun ses()` fonksiyonu, alt sınıflar tarafından değiştirilebilir.
- `class Kedi : Hayvan()` ifadesiyle `Kedi` sınıfı `Hayvan` sınıfından miras alır.
- `override fun ses()` ile `Kedi` sınıfı kendi sesiyle fonksiyonu tekrar tanımlar.
- `sesiCal` fonksiyonu, parametre olarak `Hayvan` tipinde nesne alır ve `ses()` fonksiyonunu çağırır.
- `val h: Hayvan = Kedi()` ifadesi ile `Kedi` nesnesi `Hayvan` türünde tutulur ve çağrılan fonksiyon, `Kedi` sınıfının sesini döndürür.

### Neden Kalıtım Kullanılır?

- Kod tekrarını önler.
- Ortak özellikler ve davranışlar süper sınıfta toplanır.
- Alt sınıflar kendi özelliklerini ve davranışlarını ekleyerek esnek yapı oluşturur.
- Büyük projelerde daha modüler ve sürdürülebilir kod yazmayı sağlar.


## <a name="11"></a> ✅ 11. Polymorphism (Çok Biçimlilik)

Polymorphism, nesne yönelimli programlamanın temel prensiplerinden biridir ve farklı nesnelerin aynı arabirimi (interface veya temel sınıf) farklı şekillerde uygulamasını sağlar. Bu sayede, aynı türdeki nesneler farklı davranışlar sergileyebilir.

### Nasıl Çalışır?

- Bir süper sınıf veya arayüz tanımlanır ve içinde ortak bir fonksiyon bulunur.
- Bu süper sınıfı veya arayüzü miras alan alt sınıflar, bu fonksiyonu kendi ihtiyaçlarına göre farklı şekilde override eder.
- Programda, süper sınıf tipiyle bir nesne referansı tutulur, ancak çalışma zamanında çağrılan fonksiyon alt sınıfın kendine özgü versiyonu olur.
- Bu mekanizma sayesinde, aynı fonksiyon çağrısı farklı nesnelere göre farklı sonuçlar üretir.

### Örnek:

```kotlin
open class Hayvan {
    open fun ses() = "Ses çıkarıyor..."
}

class Kedi : Hayvan() {
    override fun ses() = "Miyav"
}

class Kopek : Hayvan() {
    override fun ses() = "Hav hav"
}

fun sesiCal(h: Hayvan) {
    println(h.ses())
}

fun main() {
    val kedi: Hayvan = Kedi()
    val kopek: Hayvan = Kopek()

    sesiCal(kedi)   // Çıktı: Miyav
    sesiCal(kopek)  // Çıktı: Hav hav
}
```

Polymorphism’in Avantajları

- Esneklik: Farklı nesneler aynı fonksiyon çağrısıyla farklı davranışlar sergileyebilir.
- Bakım Kolaylığı: Yeni türler eklemek kolaydır; mevcut kodları değiştirmeye gerek kalmaz.
- Genellik: Ortak bir tip kullanılarak genel fonksiyonlar yazılabilir.
- Genişletilebilirlik: Sistem daha modüler ve genişletilebilir olur.

Polymorphism, büyük ve karmaşık projelerde kodun daha esnek, anlaşılır ve sürdürülebilir olmasını sağlar.

## <a name="11"></a> ✅ 12. Abstraction (Soyutlama)

Soyutlama, nesne yönelimli programlamanın temel prensiplerinden biridir ve karmaşık sistemlerde gereksiz detayları gizleyip, sadece önemli ve temel özelliklerin görünmesini sağlar. Böylece kullanıcılar veya diğer sınıflar, sadece gerekli işlevlerle ilgilenir ve detaylara müdahale etmek zorunda kalmazlar.

### Abstraction Nasıl Sağlanır?

- Kotlin’de soyutlama genellikle **abstract class** (soyut sınıf) ve **interface** yapıları ile yapılır.
- Soyut sınıf, hem gövdesi (implementasyonu) olan hem de olmayan (abstract) fonksiyonlar içerebilir.
- Abstract fonksiyonlar, gövdesizdir ve alt sınıflar tarafından mutlaka override edilerek tanımlanmalıdır.
- Abstract sınıflardan doğrudan nesne oluşturulamaz, ancak onlardan türetilmiş alt sınıflar somut (concrete) hale getirilir.

### Örnek:

```kotlin
abstract class Sekil {
    abstract fun alan(): Double  // Soyut fonksiyon, alt sınıflarda tanımlanacak
}

class Dikdortgen(val en: Int, val boy: Int) : Sekil() {
    override fun alan() = (en * boy).toDouble()  // Soyut fonksiyonun implementasyonu
}

class Daire(val yaricap: Double) : Sekil() {
    override fun alan() = Math.PI * yaricap * yaricap
}

fun main() {
    val dikdortgen = Dikdortgen(5, 10)
    val daire = Daire(7.0)

    println("Dikdörtgen Alanı: ${dikdortgen.alan()}")
    println("Daire Alanı: ${daire.alan()}")
}
```
Abstraction Kullanmanın Avantajları:

- Karmaşıklığın Azaltılması: Gereksiz detaylar gizlenir, sadece önemli fonksiyonlar görünür.
- Kod Tekrarının Azaltılması: Ortak özellikler soyut sınıfta toplanır.
- Genişletilebilirlik: Yeni şekiller kolayca eklenebilir, mevcut sistem bozulmaz.
- Daha İyi Tasarım: Kodun yapısı daha temiz, anlaşılır ve sürdürülebilir olur.

Abstraction sayesinde, farklı türlerde nesneler ortak bir temel üzerinden yönetilebilir ve karmaşık uygulamalar daha yönetilebilir hale gelir.


## <a name="11"></a> ✅ 13. Data Class (Veri Sınıfı)

Kotlin'de `data class` veri tutmak için kullanılan özel bir sınıf türüdür. Data class'lar, veri odaklı nesneler oluşturmayı kolaylaştırır ve otomatik olarak bazı faydalı fonksiyonları sağlar.

### Data Class Özellikleri

- `toString()`, `equals()`, `hashCode()` ve `copy()` fonksiyonları otomatik olarak oluşturulur.
- Sadece veri tutmak için kullanılır, genellikle model veya DTO (Data Transfer Object) yapılarıdır.
- Bir `data class` mutlaka en az bir `primary constructor` parametresine sahip olmalıdır.
- Constructor parametreleri otomatik olarak `val` ya da `var` ile tanımlanır.

### Örnek:

```kotlin
data class Kisi(val isim: String, val yas: Int)

fun main() {
    val kisi1 = Kisi("Ahmet", 30)
    val kisi2 = Kisi("Ayşe", 25)

    println(kisi1)  // Kisi(isim=Ahmet, yas=30)
    
    val kisi3 = kisi1.copy(yas = 31)  // Yeni nesne oluşturur, yas 31 olarak değiştirilmiş
    
    println(kisi3)  // Kisi(isim=Ahmet, yas=31)
    
    println(kisi1 == kisi3)  // false, çünkü yas farklı
}
```
### Data Class Kullanmanın Avantajları

- **Otomatik Fonksiyonlar:** `toString()`, `equals()`, `hashCode()` ve `copy()` gibi temel fonksiyonlar otomatik oluşturulur, böylece kod daha az ve temiz olur.
- **Kolay Veri Taşıma:** Veri modelleri oluşturmak için idealdir, veri taşıma işlemleri kolaylaşır.
- **Immutable veya Mutable:** Parametreler `val` (değiştirilemez) veya `var` (değiştirilebilir) olabilir, ihtiyaca göre seçilebilir.
- **Destructuring:** Nesneler kolayca parçalanabilir.

```kotlin
val (isim, yas) = kisi1
println("İsim: $isim, Yaş: $yas")
```

### Özet
Data class, sadece veri tutan sınıflar için hızlı ve kullanışlı bir çözümdür. Modelleme, veri transferi veya basit veri yapıları oluşturmak için tercih edilir.

## <a name="11"></a> ✅ 14. Enum Class (Sabit Değerler Sınıfı)

Enum class, sabit değerlerin bir arada tutulduğu özel bir sınıf türüdür. Program içerisinde belirli ve sınırlı sayıda seçenek olduğunda enum kullanmak, kodun okunabilirliğini artırır ve hata yapma riskini azaltır.

### Özellikleri:
- Sabitler kümesi oluşturur; her sabit enum sınıfının bir örneğidir.
- Sabitler, tip güvenliği sağlar. Yani, geçersiz bir değer atanması önlenir.
- `enum` sınıfı içinde fonksiyonlar ve değişkenler tanımlanabilir.
- `when` yapısı ile enum değerleri üzerinden kolayca karar verilebilir.

```kotlin
enum class Renk {
    KIRMIZI, MAVI, YESIL
}

val r: Renk = Renk.KIRMIZI
println(r.name)  // "KIRMIZI"
println(r.ordinal)  // 0, enum'daki sırası
```
### Detaylar:
- `name`: Sabitin ismini `String` olarak döner.
- `ordinal`: Sabitin enum içindeki indeksini (sırasını) döner.
- Enum sabitlerine doğrudan eşitlik karşılaştırması yapılabilir (`==`).
- Enum sınıflarına parametre ve fonksiyonlar eklenebilir.

```kotlin
enum class Durum(val aciklama: String) {
    BASARILI("İşlem başarılı"),
    HATA("Bir hata oluştu");

    fun mesajVer() = "Durum: $aciklama"
}

println(Durum.BASARILI.mesajVer())  // Durum: İşlem başarılı
```
### Neden Enum Kullanılır?
- Kodda sabit değerler için anlamlı isimler kullanmak.
- Sabitlerin yanlış kullanılmasını önlemek.
- Kodun daha anlaşılır ve bakımı kolay hale gelmesini sağlamak.
- `when` gibi kontrol yapılarını enum sabitleriyle temiz şekilde kullanabilmek.

## <a name="11"></a> ✅ 15.




