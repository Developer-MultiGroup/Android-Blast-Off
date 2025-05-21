# Jetpack Compose Nedir? Temel Bilgilerle Hızlı Başlangıç

![Gemini API by Google Course (6)](https://github.com/user-attachments/assets/c3f49f17-7201-4b31-a7a9-d497bc0b236e)

Bu bölümde sizi bekleyen konu başlıkları:

[Compose Basics – UI Etkileşimi](#1) | [Liste Yapıları](#2) | [State Yönetimi](#3)

## <a name="1"></a> ✅ 1. Compose Basics – UI Etkileşimi

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

### 🧪 Örnek 3: Modifier.clickable ile Etkileşim

```kotlin
Text(
    text = "Buraya tıkla!",
    modifier = Modifier
        .padding(8.dp)
        .clickable {
            // Tıklama sonrası yapılacak işlem
        }
)
```
> Modifier.clickable sayesinde sadece butonlar değil, herhangi bir bileşen tıklanabilir hale gelir.

## <a name="2"></a> ✅ 2. Liste Yapıları

Jetpack Compose’da çok sayıda veriyi göstermek için `LazyColumn` ve `LazyRow` bileşenleri kullanılır. Bu bileşenler yalnızca görünür elemanları yüklediği için performanslıdır.

### 🧪 Örnek 1: Basit Liste

```kotlin
@Composable
fun NameList() {
    val names = listOf("Ayşe", "Mehmet", "Can", "Zeynep")

    LazyColumn {
        items(names) { name ->
            Text(
                text = name,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    }
}
```

### 🧪 Örnek 2: İndex ile Listeleme

```kotlin
@Composable
fun NameList() {
    val names = listOf("Ayşe", "Mehmet", "Can", "Zeynep")

    LazyColumn {
        items(names) { name ->
            Text(
                text = name,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    }
}
```
### 🧪 Örnek 3: Liste Öğesine Tıklama

```kotlin
@Composable
fun ClickableList() {
    val items = listOf("Elma", "Armut", "Muz")
    var selectedItem by remember { mutableStateOf("") }

    Column {
        LazyColumn {
            items(items) { item ->
                Text(
                    text = item,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .clickable { selectedItem = item }
                )
            }
        }
        Text(text = "Seçilen: $selectedItem")
    }
}
```

## <a name="3"></a> ✅ 3. State Yönetimi

State (durum), UI'nin veriye göre nasıl görüneceğini belirler. Jetpack Compose, "declarative UI" mantığı ile çalışır. Yani, state değişince ekran otomatik olarak yeniden çizilir.

### ⚠️ Temel State Kavramları:

- `mutableStateOf`: Değeri değişebilen bir veri üretir.

- `remember`: Composable yeniden çizildiğinde değerin korunmasını sağlar.

- `by` delegate: Kotlin’in property delegate özelliği ile state daha sade yazılır.

### 🧪 Örnek 1: Toggle Button

```kotlin
@Composable
fun ToggleExample() {
    var isOn by remember { mutableStateOf(false) }

    Button(onClick = { isOn = !isOn }) {
        Text(text = if (isOn) "Açık" else "Kapalı")
    }
}
```

### 🧪 Örnek 2: Liste ile Dinamik State

```kotlin
@Composable
fun SelectableList() {
    val items = listOf("Kırmızı", "Yeşil", "Mavi")
    var selected by remember { mutableStateOf("") }

    LazyColumn {
        items(items) { color ->
            Text(
                text = color,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { selected = color }
            )
        }
    }

    Text(text = "Seçilen renk: $selected")
}
```

### 💡 Ekstra Bilgi:

State yönetimi büyüdükçe, `ViewModel` ve `StateFlow` gibi yapılar devreye girer.

Basit Compose örneklerinde `remember` yeterlidir ama daha büyük projelerde `rememberSaveable`, `viewModel()`, veya `hiltViewModel()` gibi yaklaşımlar tercih edilir.

## 🧷 Özet

| Konu            | Açıklama                                                       |
|-----------------|----------------------------------------------------------------|
| **UI Etkileşimi**    | Buton, TextField gibi bileşenlerle kullanıcıdan giriş alınır.      |
| **Liste Yapıları**   | `LazyColumn` ile performanslı liste gösterimi yapılır.              |
| **State Yönetimi**   | `remember` ve `mutableStateOf` ile veriye göre UI dinamikleşir.       |

