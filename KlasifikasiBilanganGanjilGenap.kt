package KlasifikasiBilanganGanjilGenap
//inisiasi nama paket program
fun main() 
//inisiasi fungsi main() dalam pemrograman bahasa kotlin
{
    println("Selamat datang di program klasifikasi bilangan")
    println("Program ini berfungsi untuk memilah sebuah bilangan ganjil atau genap")
    //fungsi println untuk memunculkan output teks dalam pemrograman bahasa kotlin
    println("Program ini dibuat dengan bahasa kotlin")
    println("Diketahui : jumlah bilangan (n) adalah 10")
    println("Ditanya : Klasifikasikan 10 bilangan dalam variabel n?")
    val l = IntArray(10)
    //val digunakan untuk menginisiasi value l
    //IntArray digunakan untuk membuat array kosong berindeks 10
    val m = IntArray(10)
    val n:IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    //n:IntArray berfungsi untuk inisiasi Array yang isi indeksnya sudah kita tentukan
    //intArrayOf adalah cara untuk menginisiasi isi Array dalam kotlin
    for(i in n.indices){
    //for digunakan untuk melakukan perulangan dengan i in n.indices sebagai syarat dimana i adalah indeks didalam array n dengan indices yang fungsinya sebagai size
        if((n[i]%2) == 0){
        //if digunakan untuk memilah kondisi dengan n[i] atau indeks dari array n yang sisa baginya dengan 2 sama dengan nol akan tereksekusi dengan kode dibawahnya
            l[i]= n[i]
            //l[i] adalah menyatakan indeks i dari array l adalah sama dengan indeks i dari array n 
        }else{
        //jika tidak sesuai dengan kondisi if diatas, kode yang akan dieksekusi akan masuk ke kode di bawah ini
            m[i]= n[i]
            //menyatakan indeks i dari array m adalah sama dengan indeks i dari array n
        }
    }
    println("Jawab : ")
    println("Yang termasuk bilangan ganjil adalah")
    for (i in m.indices)
    {
        if(m[i] != 0)
    	{
        print(m[i])
        print(" ")
        }
    }
    println("")
    println("Yang termasuk bilangan genap adalah")
    for (i in l.indices)
    {
        if(l[i] != 0)
    	{
        print(l[i]) 
        print(" ")
        }
    }
}
