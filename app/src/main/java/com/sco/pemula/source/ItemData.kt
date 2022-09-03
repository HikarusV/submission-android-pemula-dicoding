package com.sco.pemula.source

import com.sco.pemula.R

object ItemData {
    private val itemName = arrayOf(
        "Antelopes",
        "Chameleon",
        "Cat",
        "Cheetah",
        "Deer",
        "Dove",
        "Eagle",
        "Fish",
        "Peacock",
        "Parrot",
        "Puppies",
        "Rabbit",
        "Squirrel",
    )

    private val itemText = arrayOf(
        "Spesies ruminansia berkuku genap yang menempati habitat di Afrika dan Eurasia.",
        "Hewan yang Bisa Berubah Warna mengikuti lingkungan sekitar.",
        "Hewan yang Memiliki penglihatan yang tajam, suka makan ikan, dan takut dengan anjing.",
        "Hewan yang dapat berlari sangat cepat untuk menangkap mangsa.",
        "Hewan yang memiliki dua kuku besar dan dua kuku kecil di setiap kakinya.",
        "Burung berleher pendek dan berbadan kekar.",
        "Hewan berdarah panas, mempunyai sayap dan tubuh yang diselubungi bulu pelepah.",
        "Hewan yang hidup di perairan, dan bernafas melalui ingsang.",
        "Burung yang memiliki bulu berwarna hijau metalik, di ujung bulunya terdapat pola berbentuk seperti mata.",
        "Burung yang berbentuk khas yakni bentuknya membengkok.",
        "Anjing yang masih kecil.",
        "Hewan lucu yang suka makan wortel.",
        "Segolongan mamalia kecil yang mirip, dan kerap dikelirukan, dengan bajing."
    )

    val itemDetail = arrayOf(
        "Istilah antelop digunakan untuk merujuk pada banyak spesies ruminansia berkuku genap yang menempati habitat di berbagai daerah di Afrika dan Eurasia. Antelop terdiri dari berbagai hewan dalam keluarga Bovidae, yang mencakup semua ruminansia Dunia Lama yang bukan termasuk sapi, domba, atau kambing.",
        "Bunglon adalah sebutan khusus untuk beraneka jenis kadal/bengkarung yang memiliki kemampuan mengubah warna kulitnya. Secara umum, istilah \"bunglon\" digunakan untuk menyebut kadal-kadal dari suku Iguania termasuk Iguanidae, agamidae dan chamaeleonidae. Istilah dalam bahasa Inggris adalah Chameleon atau Chamaeleon.",
        "Kucing disebut juga kucing domestik atau kucing rumah adalah sejenis mamalia karnivora dari keluarga Felidae. Kata \"kucing\" biasanya merujuk kepada \"kucing\" yang telah dijinakkan, tetapi bisa juga merujuk kepada \"kucing besar\" seperti singa dan harimau.",
        "Citah adalah anggota keluarga kucing yang berburu mangsa dengan menggunakan kecepatan dan bukan taktik mengendap-endap atau bergerombol.",
        "Rusa, sambar, atau menjangan adalah hewan mamalia pemamah biak yang termasuk famili Cervidae. Salah satu ciri khas rusa adalah adanya antler, dan bukan tanduk, yang merupakan pertumbuhan tulang yang berkembang setiap tahun terutama pada rusa jantan.",
        "Merpati dan dara termasuk dalam famili Columbidae atau burung berparuh merpati dari ordo Columbiformes, yang mencakup sekitar 300 spesies burung kerabat pekicau. Dalam percakapan umum, istilah \"dara\" dan \"merpati\" dapat saling menggantikan.",
        "Elang adalah salah satu dari hewan yang terdapat di seluruh Indonesia. Dalam Bahasa inggris, eagle atau elang merujuk pada burung pemangsa berukuran besar dari suku Accipitridae terutama genus Aquila. Sementara itu burung-burung pemangsa yang lebih kecil dalam Daftar Burung Indonesia nomor 2 disebut Elang-alap.",
        "Ikan sebagian pakan Pelikan adalah anggota vertebrata poikilotermik yang hidup di air dan bernapas dengan insang. Ikan merupakan kelompok vertebrata yang paling beraneka ragam dengan jumlah spesies lebih dari 27,000 di seluruh dunia.",
        "Merak adalah tiga spesies burung dalam genus Pavo dan Afropavo dari familia ayam hutan, Phasianidae. Burung jantannya memiliki bulu ekor yang indah yang dapat dikembangkan untuk menarik perhatian merak betina. Ketiga spesies tersebut adalah: Merak India, Pavo cristatus Merak Hijau, Pavo muticus",
        "Kakatua adalah jenis burung hias yang memiliki bulu yang indah dengan lengkingan suara yang cukup nyaring. Spesies ini termasuk salah satu burung dengan kecerdasan yang cukup bagus, sehingga sering digunakan untuk acara-acara hiburan di kebun binatang atau tempat hiburan lainnya.",
        "Seekor anak anjing adalah anjing remaja. Beberapa anak anjing dapat memiliki berat 1-1,5 kg, sementara yang lebih besar dapat memiliki berat hingga 7–11 kg. Semua anak anjing yang sehat tumbuh dengan cepat setelah lahir.",
        "Kelinci adalah hewan mamalia dari famili Leporidae, yang dapat ditemukan di banyak bagian bumi. Kelinci berkembang biak dengan cara beranak yang disebut vivipar. Dulunya, hewan ini adalah hewan liar yang hidup di Afrika hingga ke daratan Eropa.",
        "Bajing adalah nama umum bagi sekelompok mamalia pengerat dari suku Sciuridae. Kata yang berpadanan dalam bahasa Inggris adalah squirrel. Dalam ilmu biologi, bajing tidak sama dengan tupai.",
    )

    private val itemImages = intArrayOf(
        R.drawable.antalopes,
        R.drawable.bunglon,
        R.drawable.cat,
        R.drawable.cheetah,
        R.drawable.deer,
        R.drawable.dove,
        R.drawable.eagle,
        R.drawable.fish,
        R.drawable.merak,
        R.drawable.parrot,
        R.drawable.pupies,
        R.drawable.rabit,
        R.drawable.squirel)

    val listData: ArrayList<Item>
        get() {
            val list = arrayListOf<Item>()
            for (position in itemName.indices) {
                val item = Item()
                item.name = itemName[position]
                item.text = itemText[position]
                item.photo = itemImages[position]
                list.add(item)
            }
            return list
        }

    fun getItemInformationById(id: Int) : Item {
        return Item(
            name = itemName[id],
            text = itemText[id],
            photo = itemImages[id],
            detail = itemDetail[id]
        )
    }
}