Technical Test QA Engineer — HashMicro



Automation Testing menggunakan Playwright + Java + Cucumber BDD

Repository ini dibuat untuk memenuhi Technical Test QA Engineer dari HashMicro.
Pengujian dilakukan terhadap aplikasi web SauceDemo sesuai instruksi berikut:

Akses situs: https://www.saucedemo.com/

Flow yang harus di‐otomasi:
1. Login ke homepage
2. Klik “Add to cart” pada salah satu barang
3. Klik icon “Cart” untuk menuju halaman Cart
4. Klik button “Checkout”

Framework ini dikembangkan menggunakan Playwright Java dengan pendekatan BDD, POM, dan TestNG, serta dilengkapi Allure Report dan screenshot otomatis saat failure.

Tujuan dari automation testing ini adalah untuk memastikan bahwa:
1. Proses login berjalan dengan benar.
2. Pengguna dapat menambahkan barang ke keranjang.
3. Navigasi menuju halaman Cart berfungsi sesuai alur.
4. Tombol Checkout membawa pengguna ke halaman informasi checkout.

Pengujian dibuat agar interviewer dapat menilai:
1. Pemahaman terhadap proses bisnis dasar pada e-commerce kecil.
2. Kemampuan membuat automation script yang modular, clean, dan maintainable.
3. Penerapan Playwright dengan konsep Page Object Model (POM).
4. Kualitas assertion dan handling elemen UI.

Teknologi & Tools yang Digunakan
| Teknologi / Tools           | Deskripsi                                        | Alasan Penggunaan                                       |
| --------------------------- | ------------------------------------------------ | ------------------------------------------------------- |
| **Playwright**              | Framework automation testing modern untuk Web UI | Stabil, cepat, mendukung multi-browser dan auto-waiting |
| **JavaScript / TypeScript** | Bahasa pemrograman utama untuk Playwright        | Clean, mudah dibaca, dan direkomendasikan Playwright    |
| **Node.js**                 | Runtime environment                              | Dibutuhkan untuk menginstal & menjalankan Playwright    |
| **Page Object Model (POM)** | Desain pattern untuk testing                     | Memudahkan maintainability & reusability                |
| **GitHub**                  | Repository version control                       | Untuk kolaborasi & submission ke interviewer            |
| **VS Code**                 | Code editor                                      | Ringan, plugin lengkap, nyaman untuk Playwright         |


Penjelasan Tambahan untuk Interviewer
Bagian ini disiapkan sebagai referensi profesional untuk reviewer Technical Test QA Engineer di HashMicro.
1. Alasan Menggunakan Playwright (Java)
  - Playwright dipilih sebagai automation framework karena beberapa keunggulan berikut:
  - Mendukung parallel test execution secara bawaan tanpa konfigurasi kompleks.
  - Lebih stabil dalam menangani elemen dinamis (auto-waiting).
  - Mendukung multi-browser: Chromium, Firefox, WebKit.
  - Fitur debugging lengkap: screenshots, trace viewer, video recording.
  - Integrasi kuat dengan Java + Cucumber, sehingga sesuai kebutuhan technical test.
2. Alasan Menggunakan Page Object Model (POM)
Page Object Model digunakan untuk memastikan struktur kode tetap profesional, bersih, dan scalable.
Keuntungan POM:
  - Kode lebih rapi dan mudah dibaca.
  - Mendukung reusability (menghindari duplikasi kode).
  - Mempermudah maintenance dan pengembangan test baru.
  - Memisahkan setiap halaman menjadi class terpisah (Login, Product, Cart, Checkout), sehingga mudah diperluas di masa depan.
POM diterapkan untuk mengikuti prinsip DRY (Don't Repeat Yourself) agar framework tetap efisien.
3. Alasan Menggunakan Cucumber BDD
Cucumber dipilih agar pengujian:
  - Lebih readable dan dekat dengan kalimat manusia (Gherkin syntax).
  - Mudah dipahami oleh stakeholder non-teknis seperti BA/PO/PM.
  - Mendukung kolaborasi antara QA, BA, dan developer.
  - Mendukung dokumentasi otomatis melalui feature file.
BDD menjadikan test sebagai bagian dari komunikasi bisnis, bukan hanya kode teknis.
4. alidasi Menggunakan Assertion
Validasi pada halaman Checkout dilakukan menggunakan:
Assert.assertEquals(header, "Checkout: Your Information");
Penjelasan teknis:
  - Pada web SauceDemo, title HTML tidak berubah, tetapi heading pada halaman (class .title) berubah sesuai halaman.
  - Oleh karena itu, heading menjadi indikator valid untuk memverifikasi bahwa user berada di halaman Checkout Information yang benar.

Penutup

Framework ini dibuat untuk menunjukkan kompetensi dalam:
- QA Automation
- Test Framework Design
- Playwright Java
- BDD Cucumber
- Test Reporting
- Clean Code & POM Architecture

Terima kasih kepada tim HashMicro atas kesempatan mengikuti technical test ini.
Saya siap memberikan demo, dokumentasi tambahan, atau penjelasan lebih detail bila dibutuhkan.


<p align="center"> <img src="https://img.shields.io/badge/Automation-Playwright-2ea44f?style=for-the-badge&logo=playwright" /> <img src="https://img.shields.io/badge/Language-Java-blue?style=for-the-badge&logo=coffeescript" /> <img src="https://img.shields.io/badge/Framework-Cucumber-green?style=for-the-badge&logo=cucumber" /> <img src="https://img.shields.io/badge/Design-POM-orange?style=for-the-badge" /> <img src="https://img.shields.io/badge/Test_Runner-Maven-red?style=for-the-badge&logo=apachemaven" /> <img src="https://img.shields.io/badge/Reporting-Playwright_Report-yellow?style=for-the-badge" /> </p> <p align="center"> <img src="https://img.shields.io/badge/Status-Completed-success?style=for-the-badge" /> <img src="https://img.shields.io/badge/Maintainer-Achmad%20Sesar%20Balbo-lightgrey?style=for-the-badge" /> </p>
