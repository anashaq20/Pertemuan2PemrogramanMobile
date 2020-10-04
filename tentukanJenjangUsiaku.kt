package tentukanJenjangUsiaku
//inisiasi nama paket program
fun tentukanJenjangUsia(usia : Int)
//inisiasi fungsi cariPrima dengan parameter usia 
{

    if(usia >7 && usia <=13) {println("Jenjang usiamu adalah Anak-anak")}
        //jika bernilai true maka akan menghasilkan output berupa kalimat tersebut
    if(usia >13 && usia <=18) {println("Jenjang usiamu adalah Remaja")}
        //jika bernilai true maka akan menghasilkan output berupa kalimat tersebut
    if(usia >18 && usia <=50) {println("Jenjang usiamu adalah Dewasa")}
        //jika bernilai true maka akan menghasilkan output berupa kalimat tersebut
	else{println("Jenjang usiamu adalah Lansia")}    

}
 
 
fun main() {
    tentukanJenjangUsia(60)
    tentukanJenjangUsia(45)
    tentukanJenjangUsia(30)
    tentukanJenjangUsia(15)
    tentukanJenjangUsia(10)
    //pemanggilan fungsi untuk mencari jenjang usia pada fungsi main 
}
