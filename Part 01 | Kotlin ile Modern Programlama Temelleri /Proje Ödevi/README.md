# 🎯 Kotlin Ödevi: Gelişmiş Sayı Tahmin Oyunu

## 🕹️ Oyun Açıklaması
Kullanıcının rastgele seçilen bir sayıyı tahmin etmeye çalıştığı bir **konsol oyunu** yazın. Kullanıcı her tahmininde geri bildirim alacak: sayı büyük mü, küçük mü? Oyuna özel karakterler, modlar ve geçmiş skorlar gibi özellikler de olacak.

---

## 🔧 Uygulama Gereksinimleri

## 1. Temel Oyun Mekaniği
- 1 ile 100 arasında rastgele bir sayı üretin.
- Kullanıcıdan tahmin alın.
- Tahmin doğru değilse:
  - `"Daha büyük"` ya da `"Daha küçük"` ipucu verin.
- Doğru tahminde:
  - Kaçıncı denemede bildiğini gösterin.



## 2. OOP Tasarımı
- `Game` sınıfı: 
  - Oyun yönetimi (tahmin alma, ipucu verme vb.)
- `Player` sınıfı: 
  - Oyuncu adı, skor gibi bilgiler
- Gerekirse:
  - Farklı oyun modları için kalıtım (`EasyGame`, `HardGame` gibi)



## 3. Enum & Sealed Class Kullanımı
- `enum class Difficulty { EASY, NORMAL, HARD }`
- `sealed class GameResult`:
  - Kazandı
  - Kaybetti
  - Vazgeçti



## 4. Fonksiyonlar ve Scope Functions
- Fonksiyonlar:
  - `start()`, `playTurn()`, `giveHint()`, `reset()` gibi
- `apply`, `run`, `let`, `also` gibi **scope function**’lar kullanılmalı



## 5. Null Safety & Lambda
- Oyuncunun adı girilmediyse:
  - `String?` ile null kontrolü yapılmalı
  - Varsayılan isim verilmeli
- Liste içinde yüksek skorları filtrelemek için **lambda** kullanılmalı



## 6. Veri Yapıları
- `List<Player>`:
  - Geçmiş skorları tutmak için
- `Map<Difficulty, Int>`:
  - Zorluk seviyesine göre skor limiti tutmak için



## 7. Extension Function
- `Player` sınıfına şu fonksiyon eklensin:
  ```kotlin
  fun Player.printScoreSummary() {
      println("Oyuncu: $name | Skor: $score")
  }
