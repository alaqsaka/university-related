let nilaiSaya = 50;

if (nilaiSaya >= 90 && nilaiSaya <= 100) {
  console.log("Selamat! Anda mendapatkan nilai A.");
} else if (nilaiSaya >= 80 && nilaiSaya < 90) {
  console.log("Anda mendapatkan nilai B.");
} else if (nilaiSaya >= 70 && nilaiSaya < 80) {
  console.log("Anda mendapatkan nilaiSaya C.");
} else if (nilaiSaya >= 60 && nilaiSaya < 70) {
  console.log("Anda mendapatkan nilai  D.");
} else if (nilaiSaya < 60) {
  console.log("Anda mendapatkan nilai E.");
}

let iniArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let i = 0;

for (i = 0; i < 5; i++) {
  console.log(iniArray[i]);
}

iniArray.pop();

iniArray.splice(0, 0, 0);

console.log(iniArray);
