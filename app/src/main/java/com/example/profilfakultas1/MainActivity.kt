package com.example.profilfakultas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createFakData()
        rv_part.layoutManager = LinearLayoutManager(this)
        rv_part.setHasFixedSize(true)
        rv_part.adapter = FakAdapter(testData, { fakItem: FakData -> resepItemClicked(fakItem)})
    }

    private fun resepItemClicked(fakItem: FakData) {
        val showDetailActivityIntent = Intent(this, FakDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, fakItem.namaFak.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, fakItem.descFak.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, fakItem.fotoFak.toString())
        showDetailActivityIntent.putExtra(Intent.ACTION_PICK, fakItem.web.toString())
        showDetailActivityIntent.putExtra(Intent.ACTION_CALL, fakItem.email.toString())
        startActivity(showDetailActivityIntent)
    }

    private fun createFakData() : List<FakData> {
        val partList = ArrayList<FakData>()
        partList.add(FakData("Fakultas Ilmu Komputer",
            
            "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                "\t1. Prodi S1 Teknik Informatika\n" +
                "\t2. Prodi S1 Sistem Informasi\n" +
                "\t3. Prodi S1 Data Science\n", R.drawable.fik, "http://fik.upnjatim.ac.id/",
            "tu.fik@upnjatim.ac.id"))
        partList.add(FakData("Fakultas Teknik", 
            "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    "\t1. Prodi S1 Teknik Kimia\n" +
                    "\t2. Prodi S1 Teknik Industri\n" +
                    "\t3. Prodi S1 Teknik Sipil\n" +
                    "\t4. Prodi S1 Teknik Lingkungan\n" +
                    "\t5. Prodi S1 Teknologi Pangan\n" +
                    "\t6. Prodi S1 Teknik Mesin\n" , R.drawable.ft, "http://ft.upnjatim.ac.id/", ""))
        partList.add(FakData("Fakultas Ekonomi Dan Bisnis",
            "Fakultas Ekonomi Dan Bisnis merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    " \t1. Prodi S1 Ekonomi Pembangunan\n" +
                    "\t2. Prodi S1 Akuntansi\n" +
                    "\t3. Prodi S1 Manajemen", R.drawable.feb, "http://febis.upnjatim.ac.id/", ""))
        partList.add(FakData("Fakultas Pertanian",
            "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    "\t1. Prodi S1 Agroteknologi\n" +
                    "\t2. Prodi S1 Agribisnis", R.drawable.fp, "http://fik.upnjatim.ac.id/", ""))
        partList.add(FakData("Fakultas Arsitektur Dan Desain",
            "Fakultas Arsitektur Dan Desain merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    "\t1. Prodi S1 Arsitektur\n" +
                    "\t2. Prodi S1 Desain Komunikasi Visual", R.drawable.fad, "http://fad.upnjatim.ac.id/", ""))
        partList.add(FakData("Fakultas Ilmu Sosial Dan Ilmu Politik",
            "Fakultas Ilmu Sosial Dan Ilmu Politik merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    "\t1. Prodi S1 Ilmu Komunikasi\n" +
                    "\t2. Prodi S1 Ilmu Administrasi Negara\n" +
                    "\t3. Prodi S1 Ilmu Administrasi Bisnis\n" +
                    "\t4. Prodi S1 Hubungan Internasional\n" +
                    "\t5. Prodi S1 Pariwisata\n" , R.drawable.fisip, "http://fisip.upnjatim.ac.id/", ""))
        partList.add(FakData("Fakultas Hukum",
            "Fakultas Hukum merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    "\t1. Prodi S1 Ilmu Hukum", R.drawable.fh, "http://fhukum.upnjatim.ac.id/", ""))
        partList.add(FakData("Sandi Rp.",
            "PROFIL   : \n"+
                    "\t Surabaya, 01 September 2000\n" +
                    "\t Jl. Kupang Krajan Kidul 3/16 \n\t Surabaya\n" +
                    "\t +62896-7874-5090\n\n" +
                    "RIWAYAT PENDIDIKAN  : \n"+
                    "\t\t\t- SDN Dr.Soetomo I Surabaya\n" +
                    "\t\t\t- SMP PGRI 22 Surabaya\n" +
                    "\t\t\t- SMK Pawiyatan Surabaya\n\n" +
                    "PENGHARGAAN   : \n"+
                    "Belum Memperoleh...", R.drawable.profile_icon, "http://github.com/SandiRp//",
            "18082010015@student.upnjatim.ac.id"))
        return partList
    }
}

