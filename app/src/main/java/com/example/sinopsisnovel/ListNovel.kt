package com.example.sinopsisnovel

object ListNovel {
    private val novelTitle = arrayOf(
        "Pulang",
        "Jingga dan Senja",
        "Pergi",
        "Girl Online",
        "Milea: Suara dari Dilan",
        "Sunshine Becomes You",
        "Siluet",
        "Jingga dalam Elegi",
        "Twilight",
        "Dunia Sophie"
    )

    private val novelAuthors = arrayOf(
        "Tere Liye",
        "Esti Kinasih",
        "Tere Liye",
        "Zoe Sugg",
        "Pidi Baiq",
        "Ilana Tan",
        "Resti Dahlan",
        "Esti Kinasih",
        "Stephenie Meyer",
        "Jostein Gaarder"
    )

    private val novelDetails = arrayOf(
        "Novel ini menceritakan kisah seorang anak laki-laki bernama Bujang yang tinggal di dasar rimba Sumatra bersama Samad dan Midah, kedua orang tuanya. Hidupnya sederhana, sama seperti anak kecil pada umumnya. Hingga kedatangan rombongan Tauke Besar untuk berburu menjadi awal perubahan hidupnya. Malam itu, Bujang kehilangan rasa takut setelah melawan seekor babi raksasa. Dan keesokan harinya, ia ikut ke kota bersama rombongan tersebut dan meninggalkan talang untuk pertama kalinya.\n \nDi kota, Bujang diterima dengan baik oleh penghuni Keluarga Tong yang dipimpin Tauke Besar. Seiring bertambah majunya Keluarga Tong, Bujang juga tumbuh menjadi orang yang pintar, kuat, dan ahli dalam bertarung. Semua itu terwujud berkat para guru yang disiapkan Tauke Besar.\n \nDua puluh tahun kemudian, Keluarga Tong telah bertransformasi menjadi salah satu penguasa shadow economy di Asia Pasifik. Bujang berperan sebagai penyelesai konflik tingkat tinggi, jagal nomor satu Keluarga Tong. Masa kepemimpinan Tauke Besar sudah mencapai akhir sehingga perebutan kekuasaan dan pengkhianatan akan bermunculan. Saat itulah Bujang berjuang mati-matian untuk menyelamatkan Keluarga Tong bersama bantuan dari orang-orang di masa lalunya.",
        "Jingga dan senja adalah buku pertama. novel ini berisi tentang dua orang murid yang memiliki kandungan nama yang sama serta waktu kelahiran yang sama, yaitu pada saat matahari tenggelam. Tari atau lengkapnya jingga matahari adalah  gadis remaja yang bersekolah di SMA Airlangga kelas X. Dia penggemar aksesoris berwarna oranye karena dia lahir pada saat matahari terbenam. Awalnya dia adalah gadis biasa di sekolahnya, tetepi setelah bertemu dengan soerang pria yang bernama Ari, Tari menjadi gadis popular disekolahnya.\n" +
                "\nAri atau lengkapnya matahari senja, dia kelas XII sekaligus pentolan SMA Airlangga. Ari terkenal biang onar disekolahnya dan suka tawuran antar sekolah. Selain terkenal biang onar, Ari juga terkanal dikalangan cewek-cewek disekolahnya. Karena selain tampan dia juga kaya dan nilainya juga cukup baik disekolah. Ari mempunyai musuh bebuyutan di SMA Brawijaya yang bernama Angga, dia juga pentolan di sekolahnya.",
        "Sebuah kisah tentang menemukan tujuan, kemana hendak pergi, melalui kenangan demi kenangan masa lalu, pertarungan hidup-mati, untuk memutuskan kemana langkah kaki akan dibawa. Pergi.\n\nPergi merupakan sebuah novel bergenre action, drama, dan laga. Novel ini melanjutkan kisah tokoh Bujang yang sebelumnya diceritakan pada novel Pulang. Berbeda dengan Pulang yang berarti siapapun pasti akan pulang ke hakikat kehidupan, dimana Bujang akhirnya pulang menjenguk pusara mamak dan bapaknya serta berdamai dengan masa lalu yang menyakitkan. Pergi berkisah tentang petualangan seorang Bujang sang tokoh utama dalam menemukan arti tujuan hidup dan menemukan arti kata ‘Pergi’ yang sebenarnya.",
        "Penny Porter adalah seorang gadis pemalu dan clumsy. Sudah begitu lama dia naksir Ollie, si ganteng anak teater, tapi Ollie hanya tertarik pada bakat memotret Penny saja. He’s such a Walking Selfie! Sudah ge-er dikira mau diajak ngedate sama Ollie, rupanya Penny hanya dimanfaatkan untuk memotret Ollie. ZZZZzzzz. Megan, sahabat Penny sejak kecil juga sudah berubah menjadi seseorang yang sombong dan egois dan tidak mau tahu tentang gundah gulananya (?) Penny ini. Untung masih ada Elliot, sahabat sekaligus tetangga sebelah yang selalu ada ketika Penny membutuhkannya.\n" +
                "\n" +
                "Untuk meluapkan segala perasaan ABGnya, daripada ngalay di Twitter atau Facebook akhirnya Penny membuat sebuah blog bernama Girl Online. Di sana dia bisa ngoceh sejujur-jujurnya, tanpa orang tahu bahwa dialah yang ada di baliknya. Surprisingly, murni berisi curhatan tanpa dilengkapi konten mengenai hal-hal yang menarik pencarian Google, blognya memiliki banyak pembaca dan dikomen oleh ratusan orang dalam hitungan hari. Okay. Yeah. Piece of cake.",
        "Novel ini menceritakan pengenalan singkat Dilan waktu dia masih kecil, ia pernah ingin menjadi macan walaupun itu tidak mungkin dimasa kecilnya Dilan selalu berfikir bahwa dia mempunyai masa kecil yang benar-benar bahagia.\n" +
                "\n" +
                "Ketika masa SMA Dilan sering menghabiskan waktu bersama teman-temannya di warung Bi Eem. Di warung Bi Eem itulah Dilan mulai mengetahui gadis cantik yang berasal dari Jakarta yang bernama Milea, disitulah ia mulai melakukan pendekatan dengan Milea, Dilan minta doa pada bundanya agar lancar pendekatannya setelah banyak hal yang sudah Dilan lakukan untuk mendekati Milea akhirnya tiba tanggal 22 Desember 1990 Dilan dan Milea resmi berpacaran.",
        "Berawal dari insiden tak sengaja yang menimpa Alex Hirano, dimana Mia yang terjatuh menimpa Alex dan menyebabkan tangan Alex cedera padahal Alex akan menggelar konser piano dalamw aktu dekat, membuat Mia Clark terpaksa menjalani konsekuensi ketidaksengajaan itu dengan bekerja di apartemen Alex Hirano. Konsekuensi yang semula sangatlah tidak mudah untuk Mia, mengingat sikap Alex yang dingin dan seolah membencinya, bahkan bagi Alex, kehadiran Mia bak malaikat kegelapan baginya.\n" +
                "\n" +
                "Ada juga sosok Ray Hirano, adik Alex Hirano yang telah lebih dulu mengenal Mia dan diam-diam menaruh hati pada gadis itu. Sementara itu, seiring waktu, kebencian Alex terhadap Mia perlahan pupus, berubah menjadi perasaan yang sama sekali tak ia duga, begitu pun perasaan Mia terhadapnya.\n" +
                "\n" +
                "Namun, sesuatu yang dialami Mia membuat perasaan mereka itu harus mengalami ganjalan hebat untuk bersatu. Belum lagi keberadaan Ray yang tetap berusaha untuk menyatakan perasaannya pada Mia.\n" +
                "Siapakah yang akhirnya berhasil merebut hati Mia? Alex Hirano ataupun Ray Hirano? Peristiwa apa yang membuat Alex berhenti menganggap Mia malaikat kegelapan baginya, dan peristiwa besar apa pula yang dialami Mia?",
        "Rea yang Cuma tertarik untuk belajar dan bekerja harus menghadapi tingkah Kaley yang menyebalkan. Meski sudah berusaha menghindar, selalu ada kejadian yang mengharuskannya bertemu atlet renang itu. Hidup Rea sudah terjadwal pun nyaris berantakan karena Kaley.\n" +
                "\n" +
                "Lalu tiba-tiba hadir murid baru bernama Galen yang membuat gempar SMA Galariksa. Meski mendapat banyak perhatian dari para siswi, cowok genius itu tampaknya cuma tertarik sama Rea dan benar-benar berusaha mendekati cewek yang terkenal arogan itu.\n" +
                "Kalau diganggu Kaley adalah petaka, didekati Galen adalah musibah bagi Rea. Masalahnya, Rea harus menghadapi peta dan musibah secara berbarengan!\n" +
                "\n" +
                "Namun, ternyata kegigihan Galen mendekati Rea membuat cewek itu membuka diri. Saat mereka mulai dekat, Rea harus menghadapi fakta mengenai asal-usul dua cowok itu dan masa lalunya sendiri. Hal itu membuat Rea sadar bahwa sejauh apa pun dia berlari, bayang-bayang masa lalu akan tetap menjadi siluetnya.",
        "Sejak peristiwa pagi hari saat melihat mata Tari bengkak, Ari jadi penasaran. Benarkah itu hanya karena Ari menghapus nomor HP Ata dari HP Tari, ataukah karena Angga? Kalau memang karena Angga yang notabene musuh bebuyutan Ari, Ari ingin tahu apa yang telah dilakukan cowok itu terhadap Tari.\n" +
                "\n" +
                "Setelah menemukan a shoulder to cry on pengganti Angga dalam diri Ata, perlahan-lahan Tari mulai melupakan Angga. Sikap Ata yang bertolak belakang dengan Ari membuat Tari nyaman bersama Ata. Ia pun curhat habis-habisan kepada Ata yang lembut, penuh perhatian, baik hati, dan yang baru belakangan Tari sadari berhasil membuat jantungnya berdebar tak keruan. Gangguan dan intimidasi Ari sampai tidak diacuhkannya. Inilah yang membuat Ari makin salah tingkah-kini saingannya bukanlah Angga, melainkan saudara kembarnya sendiri.\n" +
                "\n" +
                "Namun, saat Tari merasa telah menemukan pelabuhan hatinya, satu rahasia besar perlahan-lahan terkuak.\n" +
                "\n" +
                "Tari merasa... lambat laun Ata semakin mirip Ari....",
        "Twilight adalah novel roman karya Stephenie Meyer yang berkisah tentang hubungan asmara antara vampir dan manusia. Novel ini telah diadaptasi dalam bentuk layar lebar dengan judul yang sama. Novel ini menceritakan tentang Bella Swan seorang gadis asal Arizona yang pindah ke Forks untuk tinggal bersama ayahnya, Charlie Swan. Bella mendapat banyak perhatian dari para pemuda dan teman-teman baru di sekolah barunya, Forks High School.\n" +
                "\n" +
                "Bella mulai mengenal Edward Cullen pada hari pertama sekolahnya, tetapi tidak ada sambutan hangat yang diberikan oleh Edward kepada Bella. Bella yang tidak mengerti mengenai Edward Cullen serta kemampuan-kemampuan mistisnya bertanya kepada sahabatnya Jacob Black. Bellapun mengetahui bahwa sesungguhnya Edward adalah seorang vampir vegetarian, mereka tidak memangsa manusia namun memangsa hewan. Edward dan Bella mulai saling terbuka dan akhirnya mereka jatuh cinta.\n" +
                "\n" +
                "Hubungan mereka diuji ketika datangnya vampir Nomad, vampir dari suku lain yang ingin memangsa Bella. James, Victoria, dan Lauren adalah vampir Nomad tersebut. James-lah yang paling ingin memangsa Bella, tetapi hal itu digagalkan oleh keluarga Cullen. Mereka sudah menganggap Bella sebagai bagian dari keluarga Cullen, sehingga mereka melakukan berbagai usaha untuk menyelamatkan Bella.\n" +
                "\n" +
                "Keluarga Cullen menyembunyikan Bella di luar kota, dan kembali lagi ke Forks setelah dirasa aman saat James terbunuh.\n" +
                "\n" +
                "Edward dan Bella berdansa di prom night, tetapi dendam Victoria gentian mengincar Bella untuk menggantikan James, pasangannya.",
        "Sophie, seorang pelajar sekolah menengah berusia empat belas tahun. Suatu hari sepulang sekolah, dia mendapat sebuah surat misterius yang hanya berisikan satu pertanyaan: “Siapa kamu?”\n" +
                "\n" +
                "Belum habis keheranannya, pada hari yang sama dia mendapat surat lain yang bertanya: “Dari manakah datangnya dunia?”\n" +
                "\n" +
                "Seakan tersentak dari rutinitas hidup sehari-hari, surat-surat itu membuat Sophie mulai mempertanyakan soal-soal mendasar yang tak pernah dipikirkannya selama ini. Dia mulai belajar filsafat."
    )

    private val novelImages = arrayOf(
        R.drawable.pulang,
        R.drawable.jinggadansenja,
        R.drawable.pergi,
        R.drawable.girlonline,
        R.drawable.milea,
        R.drawable.sunshinebecomesyou,
        R.drawable.siluet,
        R.drawable.jinggadalamelegi,
        R.drawable.twilight,
        R.drawable.duniasophie
    )

    val listData: ArrayList<Novel>
        get() {
            val list = arrayListOf<Novel>()
            for (position in novelTitle.indices) {
                val novel = Novel()
                novel.image = novelImages[position]
                novel.title = novelTitle[position]
                novel.author = novelAuthors[position]
                novel.detail = novelDetails[position]
                list.add(novel)
            }
            return list
        }

}