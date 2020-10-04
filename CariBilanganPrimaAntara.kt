package CariBilanganPrimaAntara
//inisiasi nama paket program
fun ituPrima(angka : Int) : Boolean
//inisiasi fungsi bantuan ituPrima() dalam pemrograman bahasa kotlin
{
    if (angka>1)
    {
        for(i in 2..Math.sqrt(angka.toDouble()).toInt()) {
            //fungsi looping untuk menentukan bilangan index yang akan dihitung dari 2 sampai akar kuadrat dari angka inputan
            if(angka % i == 0)
            //cek kondisi jika angka bersisa 0 jika dibagi dengan i jika bernilai true akan mengakhiri looping
            return false
        }
        return true
        //kondisi true akan dikembalikan dan akan menghasilkan output true dari kondisi if pada looping for di fungsi cariPrima
    }
    else return false
    //kondisi false akan dikembalikan ke fungsi cari prima jika angka inputan adalah 1 dan tidak akan menghasilkan output
}
fun cariPrima(awal : Int, akhir : Int)
//inisiasi fungsi cariPrima dengan parameter angka awal dan akhir 
{
    println("Bilangan prima antara $awal dan $akhir adalah")
    //inisiasi output awal dari program cariPrima
    for(i in awal..akhir)
    //looping untuk mengecek bilangan i adalah prima atau tidak
    {
        if(ituPrima(i)) print("$i ")
        //jika bernilai true maka akan menghasilkan output berupa angka i
    }
}
 
 
fun main() {
    cariPrima(1,30)
    //pemanggilan fungsi untuk mencari bilangan prima antara 2 bilangan pada fungsi main 
}
