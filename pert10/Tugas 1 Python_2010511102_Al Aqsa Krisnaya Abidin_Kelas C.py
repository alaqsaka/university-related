print("PROGRAM KONVERSI BERAT BADAN DI PLANET")
print("Nama: Al Aqsa Krisnaya Abidin")
print("NIM : 2010511102")


yesOrNo = "Y"

planet = {
    1: ["Mercury", 0.38], 
    2: ["Venus", 0.91],
    3: ["Mars", 0.38],
    4: ["Pluto", 0.04],
    5: ["Jupiter", 2.34],
    6: ["Neptune", 1.12],
    7: ["Saturn", 0.93],
    8: ["Uranus", 0.92]
}

while (yesOrNo == "Y" or yesOrNo == "y"):
    userBeratInput = int(input("Masukkan berat anda di bumi: "))

    print("Pilihan planet: ")
    print("1. Mercury")
    print("2. Venus")
    print("3. Mars")
    print("4. Pluto")
    print("5. Jupiter")
    print("6. Neptune")
    print("7. Saturn")
    print("8. Uranus")

    userPlihanPlanetInput = int(input("Pilih planet yang ingin anda konversikan (pilih angka): "))

    konversi = planet[userPlihanPlanetInput][1] * userBeratInput
   
    print("Berat anda di  " + planet[userPlihanPlanetInput][0] + " adalah " + str(konversi))    

    yesOrNo = input("Ingin mengulangi konversi? ")
    if (yesOrNo == "y" or yesOrNo=="Y"):
        continue
    elif (yesOrNo == "n" or yesOrNo == "N"):
        print("Program selesai")
    else:
        print("Input salah. Program berakhir")