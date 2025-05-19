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


