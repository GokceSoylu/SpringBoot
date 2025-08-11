# Dosya İçeriği

* pom.xml dosyasında projenin versiyonu vb özellikleri bulunur. Bunun yanı sıra Depencies kısmında eklenen bağımlılıklar (dependency) projeye eklediğmiz özellikler - kütüphanelerdir. İstediğimiz bağımlılığa bu dosyaya eklediiğmizde gerekli paketler otomatik olarak projeye dahil edilir. Silmemiz durumunda da aynı şekilde otomatik olarak silinir.

* src/main/resources/application.properties veri tabanı bağlantısı yaptığımızda gerekli tanımlamaları konfigürayonları yaptığımız kısımdır(hangi veri tabanı, kullanıcı, url adresi vb)

* src/main altında kodlarımız bulunur. başlangıçta zaten src/main/java altında aplication.java bulunuyor. 

# Maven Nedir?

(bağımlılık yönetim aracı)

* Projenin bağımlılıklarını (library, framework vb.) otomatik indirir.
* Projeyi derler, test eder, paketler (.jar, .war oluşturur).
* Standart proje yapısı ve yaşam döngüsü (build lifecycle) sunar.

yani yukarıda pom.xml dosyasına yazılanlar otamatik indirilir dosyaya kaydedilir dedik ya işt ebunu indiren gerekli kütüphanıyı proje dosyasına indiren grekemeyeni kaldıran arkadaş maven

# Tomcat Nedir?

* Java ile yazılmış bir web sunucusu ve Servlet Container’dır.

* Java Web uygulamalarını (.war dosyaları) çalıştırır.

* Spring Boot gibi çerçevelerde gömülü (embedded) olarak gelir, bu yüzden ayrıca yüklemene gerek olmaz.

Basitçe:

Java’da yazdığın web uygulamasını tarayıcıdan erişilebilir hale getiren “fırın” gibidir.
Sen hamuru (Java kodu) verirsin, o pişirip (HTTP üzerinden çalıştırıp) müşteriye (tarayıcıya) sunar.

# BEAN nedir?

