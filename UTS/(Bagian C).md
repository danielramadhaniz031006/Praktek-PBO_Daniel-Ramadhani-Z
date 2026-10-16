Bagian C - Pertanyaan Analisis

C1. Tunjukkan baris kode yang membuat relasi Jurusan–Laboratorium menjadi komposisi. 
Apa akibatnya secara desain jika ditambahkan method setter untuk mengganti Laboratorium dari luar class Jurusan?


<img width="748" height="130" alt="Screenshot 2026-10-16 141643" src="https://github.com/user-attachments/assets/9502601a-22b2-4275-b530-31430ab736bc" />


Apabila ditambahkan method setter untuk mengganti Laboratorium dari luar class Jurusan, enkapsulasi akan melemah karena class lain dapat 
mengganti laboratorium yang dikelola Jurusan. Hal ini juga dapat merusak konsep kepemilikan pada composition


C2. Jelaskan apa yang terjadi ketika daftarPraktikum(anugrah, 1) dipanggil saat LAB-1 penuh, dan baris kode mana yang menanganinya ?

<img width="1093" height="201" alt="image" src="https://github.com/user-attachments/assets/3ec1d5f0-0bb4-41db-822d-7610f2923dca" />

Saat LAB-1 penuh, program menampilkan pesan bahwa Anugrah tidak dapat didaftarkan. Perintah return menghentikan proses pendaftaran
    
C3. Tambahkan Mahasiswa m = new MahasiswaBeasiswa("2341720099", "Mentari", 20, 25); di main, lalu panggil method hitungUKT().
Versi method milik class mana yang dijalankan dan mengapa? Sebutkan pula letak overloading dan overriding di programmu?
Hasil UKT Mentari adalah Rp2.625.000

<img width="560" height="155" alt="image" src="https://github.com/user-attachments/assets/bff69cff-49c9-473a-ba48-b09529469887" />

Overloading Berada pada Method daftarPraktikum() pada class Jurusan dengan parameter berbeda

Method pertama
<img width="586" height="27" alt="image" src="https://github.com/user-attachments/assets/69f6e089-ce91-4a87-96f6-fb9fb6e13b47" />

Method kedua
<img width="727" height="30" alt="image" src="https://github.com/user-attachments/assets/87816102-ebeb-4fed-a8b9-7f671ba81f40" />

Overriding Berada pada Method hitungUKT() dan getJenis() pada class MahasiswaReguler dan MahasiswaBeasiswa yang menggantikan method dari class induk Mahasiswa
