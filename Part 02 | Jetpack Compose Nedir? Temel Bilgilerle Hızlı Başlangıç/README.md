# Jetpack Compose Nedir? Temel Bilgilerle Hızlı Başlangıç

![Gemini API by Google Course (6)](https://github.com/user-attachments/assets/c3f49f17-7201-4b31-a7a9-d497bc0b236e)

Bu bölümde sizi bekleyen konu başlıkları:




## ✅ Compose Basics – UI Etkileşimi

Jetpack Compose’da kullanıcı etkileşimi, UI öğeleri üzerinden gelen olaylarla (event) kontrol edilir. Kullanıcılar bir butona tıkladığında, bir alanı doldurduğunda veya bir öğeye dokunduğunda uygulama bu olaylara yanıt verir.

### 🧪 Örnek 1: Sayı Sayan Buton

```kotlin
@Composable
fun CounterExample() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "Butona $count kez tıklandı.")
        Button(onClick = { count++ }) {
            Text("Tıkla")
        }
    }
}
```
#### Açıklama:

- `count` değişkeni bir state’tir. Butona her tıklandığında artar.

- Compose, `count` değişince UI’yi yeniden çizer.

- `Button` bileşeni ile kullanıcı tıklamaları yakalanır.

### 🧪 Örnek 2: TextField ile Kullanıcıdan Veri Alma

```kotlin
@Composable
fun NameInputExample() {
    var name by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Adınızı girin") }
        )
        Text(text = "Merhaba, $name!")
    }
}
```

#### Açıklama:

- `TextField`, kullanıcıdan yazı girişi almak için kullanılır.

- `onValueChange`, her harf girişinde state’i günceller.


