# Jetpack Compose'da State Yönetimi


![Gemini API by Google Course (8)](https://github.com/user-attachments/assets/878dc616-5520-4a94-b4ce-ed7e5370a660)

Bu bölümde sizi bekleyen konu başlıkları:

## <a name="1"></a> ✅ 1. State Basics

### 📌 Nedir?
Jetpack Compose, UI'nin uygulama durumuna (state) göre yeniden oluşturulmasını sağlayan deklaratif bir yapı sunar. Yani kullanıcı arayüzü, state değiştikçe otomatik olarak yeniden çizilir.

### 🧠 Neden Önemli?
State, UI’nin davranışını ve görünümünü belirler. Eğer doğru yönetilmezse, ekranlar beklenmedik şekilde davranabilir.

### 💡 Kullanım:

```kotlin
@Composable
fun Counter() {
    var count by remember { mutableStateOf(0) }
    Button(onClick = { count++ }) {
        Text("Tıklama sayısı: $count")
    }
}
```
## <a name="2"></a> ✅ 2. Declarative UI & Recomposition

### 📌 Nedir?
Deklaratif yaklaşımda, nasıl değil, ne görünmesi gerektiği ifade edilir. Compose, state değiştiğinde ilgili composable’ı yeniden render eder (recompose eder).

### 🧠 Neden Önemli?
Bu yaklaşım, daha okunabilir, test edilebilir ve sade UI kodları yazmamızı sağlar.

### 💡 Örnek:

```kotlin
Text(text = if (isLoggedIn) "Hoş geldin!" else "Giriş yap")
```

State değiştiğinde `Text` composable otomatik olarak güncellenir.

## <a name="3"></a> ✅ 3. remember & rememberSaveable

### 🔍 `remember` Nedir?

`remember`, Jetpack Compose’un bellekte **geçici olarak** veri saklamasını sağlar.

- Composable yeniden **oluşturulmadıkça (recomposition)** değer korunur.
- Ancak **ekran döndüğünde** veya **konfigürasyon değişikliği** olduğunda, değer **sıfırlanır**.

#### 💡 Örnek:

```kotlin
@Composable
fun Counter() {
    var count by remember { mutableStateOf(0) }

    Button(onClick = { count++ }) {
        Text("Tıklama sayısı: $count")
    }
}
```
🧠 Burada count değişkeni sadece composable bellekte tutulur. Eğer kullanıcı ekranı döndürürse (orientation change), sayı sıfırlanır.

### 💾 `rememberSaveable` Nedir?

`rememberSaveable`, Android’in `SavedInstanceState` mekanizmasını kullanarak state’i **ekran dönüşü gibi durumlara karşı korur**.

- Basit veri tiplerini (`Int`, `String`, `Boolean` vs.) otomatik olarak saklayabilir.
- Daha karmaşık nesneler için `@Parcelize`, `mapSaver`, `listSaver` gibi çözümler gerekir.

#### 💡 Örnek:

```kotlin
@Composable
fun Counter() {
    var count by rememberSaveable { mutableStateOf(0) }

    Button(onClick = { count++ }) {
        Text("Tıklama sayısı: $count")
    }
}
```
📱 Şimdi kullanıcı ekranı döndürse bile sayacın değeri korunur.

### 📎 Ne Zaman Hangisini Kullanmalıyım?

- 🔹 **Geçici UI state’i için** → `remember`  
  Örneğin: buton tıklanma animasyonu gibi geçici etkileşimler.

- 🔹 **Kullanıcı girdisi, form verisi gibi kalıcı veri için** → `rememberSaveable`  
  Örneğin: metin alanı içeriği, sayaç değeri gibi ekran dönüşünde korunması gereken veriler.

### 📌 Temel Fark

| Özellik                  | `remember`                                  | `rememberSaveable`                                              |
|--------------------------|----------------------------------------------|------------------------------------------------------------------|
| **Veriyi Sakladığı Yer** | Bellekte (`RAM`)                             | `Bundle` üzerinden kalıcı olarak (örneğin ekran dönerken)       |
| **Kapsam**               | Sadece composable yaşam süresi boyunca       | Activity/Fragment yeniden yaratıldığında da kalır               |
| **Kullanımı**            | Daha hızlı ama geçici                        | Daha kararlı ve uzun ömürlü                                     |



