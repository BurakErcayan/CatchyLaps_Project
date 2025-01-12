# Web Test Automation Framework

Bu proje, web uygulamaları için oluşturulmuş bir test otomasyon framework'üdür. Java programlama dili kullanılarak geliştirilmiş olup, modern test araçları ve framework'lerini içermektedir.

## 🛠 Kullanılan Teknolojiler

- Java 11
- Maven (Dependency ve Build yönetimi için)
- Selenium WebDriver (Web otomasyon için)
- Cucumber (BDD - Behavior Driven Development için)
- TestNG (Test yönetimi ve paralel test çalıştırma için)
- WebDriverManager (Browser driver yönetimi için)

## 📋 Ön Gereksinimler

- Java JDK 11 veya üzeri
- Maven 3.x
- IDE (IntelliJ IDEA önerilir)
- Git

## 🚀 Projeyi Çalıştırma

1. Projeyi klonlayın:
```bash
git clone [repository-url]
```

2. Proje dizinine gidin:
```bash
cd WebArchitecture
```

3. Maven bağımlılıklarını yükleyin:
```bash
mvn clean install -DskipTests
```

4. Testleri çalıştırma seçenekleri:

a) Tüm testleri çalıştırma:
```bash
mvn test
```

b) Belirli bir tag'e sahip testleri çalıştırma:
```bash
mvn test -Dcucumber.filter.tags="@smoke"
# veya
mvn test -Dcucumber.filter.tags="@regression"
# Birden fazla tag kombinasyonu:
mvn test -Dcucumber.filter.tags="@smoke and @critical"
mvn test -Dcucumber.filter.tags="@smoke or @regression"
```

c) Paralel test çalıştırma:
```bash
# TestNG XML dosyasında tanımlanan parallel attribute'u ile:
mvn test -data-provider-thread-count=3
# veya
mvn test -Dparallel=methods -data-provider-thread-count=3
```

## 📁 Proje Yapısı

```
WebArchitecture/
├── src/
│   ├── main/
│   │   ├── java/           # Ana kaynak kodları
│   │   └── resources/      # Konfigürasyon dosyaları
│   └── test/
│       ├── java/           # Test sınıfları
│       └── resources/      # Test kaynakları ve feature dosyaları
├── Reports/                # Test raporları
├── pom.xml                 # Maven yapılandırması
└── testng.xml             # TestNG yapılandırması
```

## ⚙️ Yapılandırma

### config.properties Dosyası Açıklamaları

`src/main/resources/config.properties` dosyasındaki önemli yapılandırma değişkenleri:

- `url`: Test edilecek web uygulamasının URL'i
- `implicityWait`: Selenium'un element bulma işlemi için bekleyeceği maksimum süre (saniye)
- `pageLoadTimeout`: Sayfa yüklemesi için maksimum bekleme süresi (saniye)
- `webDriverWait`: Explicit wait için varsayılan bekleme süresi (saniye)
- `browser`: Kullanılacak tarayıcı (Chrome, Firefox, Edge vb.)
- `mobile`: Mobile test modu aktif/pasif (true/false)

### Diğer Yapılandırmalar
- `pom.xml`: Proje bağımlılıkları ve build yapılandırması
- `testng.xml`: Test suite yapılandırması ve paralel çalıştırma ayarları

## 📊 Raporlama

Test raporları `Reports` klasöründe oluşturulur.

## 📝 Versiyon Bilgisi

- Selenium: 4.27.0
- Cucumber: 7.20.1
- TestNG: 7.10.2
- WebDriverManager: 5.9.2