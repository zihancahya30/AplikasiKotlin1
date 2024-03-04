package id.ac.pnm.ti2a.aplikasikotlin1


fun main(args: Array<String>) {
    printHeader("Biodata")
    biodata("Zihan Cahya Amelia", alamat = "Ds.Carangrejo, Kec.Sampung, Kab.Ponorogo")
    printHeader("Hobby")
    hobby("Nonton", "Nonton youtube gaisss.", bahan = "HP aja")
}

fun printHeader(title: String) {
    val border = "====".repeat(15)
    println("$border\n==== $title ====\n$border")
}

fun biodata(nama: String, kelas: String = "Teknologi Informasi 2A", alamat: String) {
    val biodata = "Nama = $nama\nKelas = $kelas\nAlamat = $alamat\n"
    print(biodata)
}

fun hobby(hobby: String, desc: String, bahan: String) {
    println("Hobby        = $hobby")
    println("Deskripsi    = $desc")
    println("Alat & Bahan = $bahan")
}