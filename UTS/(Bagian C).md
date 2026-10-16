Bagian C - Pertanyaan Analisis

C1. Tunjukkan baris kode yang membuat relasi Jurusan–Laboratorium menjadi komposisi. 
    Apa akibatnya secara desain jika ditambahkan method setter untuk mengganti Laboratorium dari luar class Jurusan?


<img width="748" height="130" alt="Screenshot 2026-10-16 141643" src="https://github.com/user-attachments/assets/9502601a-22b2-4275-b530-31430ab736bc" />


  Apabila ditambahkan method setter untuk mengganti Laboratorium dari luar class Jurusan, enkapsulasi akan melemah karena class lain dapat 
  mengganti laboratorium yang dikelola Jurusan. Hal ini juga dapat merusak konsep kepemilikan pada composition.
