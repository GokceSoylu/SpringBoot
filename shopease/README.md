# 🛍️ ShopEase - E-Ticaret Yönetim Sistemi

ShopEase, kullanıcıların ürünleri görüntüleyip satın alabildiği, satıcıların ürün ekleyebildiği ve sipariş/ödeme süreçlerinin yönetilebildiği modern bir **e-ticaret platformu**dur.  
Proje, **Spring Boot (Backend)** tabanlıdır ve **ilişkisel veri modelleme** (OneToOne, OneToMany, ManyToOne, ManyToMany) konularını pratik olarak uygulamayı amaçlar.

---

## 🚀 Amaç

Bu proje, e-ticaret sistemlerinde sıkça karşılaşılan **ilişkisel veri yapıları**, **JPA (Hibernate) ilişkileri**, **REST mimarisi** ve **Spring Data JPA** kullanımını öğretmek amacıyla tasarlanmıştır.

Proje aynı zamanda gerçek bir ticaret sisteminin iş akışını (ürün listeleme, sipariş verme, ödeme işlemi, yorum yapma vb.) simüle eder.

---

## 🧩 Sistem Bileşenleri

### 1. **User (Kullanıcı)**
- Sistemde müşteri veya satıcı rolünde olabilir.
- Her kullanıcının **tek bir profil (Profile)** kaydı vardır.
- Bir müşteri birçok sipariş verebilir.
- Bir satıcı birçok ürün listeleyebilir.

### 2. **Profile (Kullanıcı Profili)**
- Her kullanıcıya özel bilgiler içerir (adres, telefon, şehir vb.)
- `@OneToOne` ilişkiyle `User` tablosuna bağlıdır.

### 3. **Category (Kategori)**
- Ürünleri gruplamak için kullanılır (örnek: Elektronik, Moda, Kozmetik).
- Bir kategorinin birden çok ürünü olabilir (`@OneToMany`).

### 4. **Product (Ürün)**
- Her ürün bir **satıcıya** (`@ManyToOne`) ve bir **kategoriye** (`@ManyToOne`) bağlıdır.
- Her ürünün bir **stok kaydı (Stock)** vardır (`@OneToOne`).
- Ürünler birçok siparişte yer alabilir (`@ManyToMany`).
- Her ürünün birçok **yorum (Review)** kaydı olabilir.

### 5. **Stock (Stok)**
- Her ürün için mevcut stok durumunu gösterir.
- `@OneToOne` ilişkiyle `Product` tablosuna bağlıdır.

### 6. **Order (Sipariş)**
- Müşterilerin verdiği siparişleri temsil eder.
- Her sipariş bir **müşteri**ye (`@ManyToOne`) aittir.
- Bir siparişin birçok **ürün**ü vardır (`@ManyToMany`).
- Her siparişin bir **ödeme (Payment)** kaydı bulunur (`@OneToOne`).

### 7. **OrderItem (Sipariş Detayı)**
- Bir siparişteki her ürünü, miktarı ve fiyatı temsil eder.
- `Order` ve `Product` arasında **ilişki tablosu (join entity)** olarak görev yapar.

### 8. **Payment (Ödeme)**
- Siparişe ait ödeme detaylarını içerir (tarih, tutar, ödeme tipi).
- Her siparişin bir ödemesi vardır (`@OneToOne`).

### 9. **Review (Yorum)**
- Müşteriler tarafından yapılan ürün yorumlarını içerir.
- Her yorum bir **ürün**e (`@ManyToOne`) ve bir **kullanıcıya** (`@ManyToOne`) bağlıdır.

---

## 🔗 İlişki Özeti

| İlişki Türü | Kullanıldığı Yer | Açıklama |
|--------------|------------------|-----------|
| **OneToOne** | User–Profile, Product–Stock, Order–Payment | Birebir ilişkiler |
| **OneToMany** | Category–Product, User(Seller)–Product, User(Customer)–Order, Product–Review | Tek tarafın birden fazla öğesi var |
| **ManyToOne** | Product–Category, Product–Seller, Review–Product, Order–Customer | OneToMany’nin ters yönü |
| **ManyToMany** | Order–Product (OrderItem üzerinden) | Siparişler birçok ürün içerebilir |

---

## 🧠 Mimari

- **Backend:** Spring Boot  
- **ORM:** Spring Data JPA (Hibernate)  
- **Database:** PostgreSQL / MySQL  
- **API:** RESTful  
- **Validation:** Hibernate Validator (`@NotNull`, `@NotBlank`, `@Positive` vs.)  
- **Mapping:** DTO ve Mapper sınıflarıyla veri transferi  
- **Documentation (opsiyonel):** Swagger UI  

---

## ⚙️ Modül Akışı

1. Satıcı giriş yapar → Ürün ekler → Stok oluşturur  
2. Müşteri giriş yapar → Ürünleri listeler → Sipariş oluşturur  
3. Sipariş → Ödeme kaydıyla tamamlanır  
4. Teslimattan sonra müşteri ürüne yorum yapabilir  

---

## 🧾 Örnek API Endpoint’leri

| Endpoint | Açıklama |
|-----------|-----------|
| `GET /products` | Tüm ürünleri listeler |
| `GET /categories` | Kategorileri listeler |
| `POST /orders` | Yeni sipariş oluşturur |
| `POST /payments` | Ödeme kaydeder |
| `POST /reviews` | Ürün için yorum ekler |
| `GET /users/{id}/orders` | Kullanıcının siparişlerini getirir |

---

## 🧪 Öğrenme Kazanımları

Bu proje ile aşağıdaki konularda pratik yapabilirsin:
- Tüm ilişki türlerini (1–1, 1–N, N–1, N–N) doğru şekilde kurma
- JPA Entity yönetimi ve cascade davranışları
- DTO–Entity dönüşümü
- REST API yapısı
- Veri doğrulama ve hata yönetimi

---

## 📌 Genişletme Fikirleri
- Kargo ve teslimat sistemi (`Shipment` entity’si, `OneToOne` Order ile)
- İndirim kuponu yönetimi (`Coupon` entity’si, `ManyToMany` Order ile)
- Rol tabanlı güvenlik (`Spring Security`)
- Ürün görselleri için dosya yükleme özelliği

---

## 🧑‍💻 Geliştirici
**Gökçe Soylu**  
Bilgisayar Mühendisliği Öğrencisi  
Spring Boot & Backend Developer Adayı  

---

📄 **Lisans:** Bu proje öğrenme amaçlıdır. Serbestçe kullanılabilir.
