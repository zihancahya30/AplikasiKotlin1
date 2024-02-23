package id.ac.pnm.ti2a.aplikasikotlin1

fun main(args: Array<String>) {
    biodata("Zihan Cahya Amelia", prodi= "Teknologi Informasi")
    hobby(  "nonton youtube","nonton mukbang")
}

fun biodata(nama: String, prodi: String, kelas:String = "2A"){ // minimal 2 parameter/args
    val biodata = """
    nama      = $nama
    prodi     = $prodi
    kelas     = $kelas
    """
    print(biodata)
}

fun hobby(nama:String, desc:String){ // 2 parameter
    println("hobby     = $nama")
    println(desc)

}