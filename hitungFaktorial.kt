package cariFaktorial
//inisiasi nama paket program
fun hitungFaktorial(bilangan : Int) : Int 
//inisiasi nama fungsi dengan parameter bilangan tipe data integer dan dengan hasil fungsi berupa integer
{ 
    return when 
    //fungsi akan melakukan pengembalian jika dalam kondisi
    { 
    //factorial hanya bisa diterapkan pada bilangan positif 
    bilangan < 0 -> -1 
        //jika bilangan adalah 0 maka hasilnya adalah -1
    bilangan in 0..1 -> 1 
        //jika bilangan diantara 0 dan 1 hasilnya adalah 1
    else -> { 
        //jika tidak memenuhi keduanya maka akan masuk pada fungsi else berikut
               var hasil = 1 
        		//inisiasi variabel hasil
               for(i in 2..bilangan) 
        		//pengulangan dilakukan untuk mendapatkan hasil perkalian
        		{
                 hasil*=i  
                    //bentuk penyederhanaan dari hasil=hasil*i
                }  
               return hasil 
        		//fungsi else akan mengembalikan nilai hasil
            } 
         } 
     }
fun main(){
    println("Selamat datang di program hitung faktorial")
    println("Program ini dibuat dengan bahasa Kotlin")
    println("Diketahui : bilangan (n) adalah 10")
    val bil:Int = 10
    //inisiasi value bil bantuan dapat diubah sesuai keinginan
    println("Ditanya : Berapakah nilai faktorial dari bilangan n?")
    println("Jawab :")
    val newhasil = hitungFaktorial(bil)
    //inisiasi variabel bantuan yang merupakan hasil dari pemanggilan faktorial dari value bil
    println("Nilai faktorial dari $bil adalah $newhasil ")
}
