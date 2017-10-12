package com.andrean.lazzlax.gudangresepmama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView ListViewResep;
    LinearLayoutManager linear;

    List<DesignItem> itemResep;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewResep = (RecyclerView) findViewById(R.id.list_view);

        linear = new LinearLayoutManager(this);
        ListViewResep.setLayoutManager(linear);

        itemResep = new ArrayList<>();
        itemResep.add(new DesignItem(R.drawable.lasagna,"Lasagna Panggang","Bahan yang diperlukan untuk membuat Lasagna pangang :\n" +
                "\n" +
                "250 gram lasagna instan\n" +
                "Bahan untuk membuat saus daging lasagna :\n" +
                "\n" +
                "500 gram daging giling yang segar\n" +
                "1 buah bawang bombay, cincang kasar\n" +
                "1 siung bawang putih, cincang halus\n" +
                "5 buah tomat buah, kupas kulit, buang bijinya, cincang kasar\n" +
                "170 gram pasta tomat\n" +
                "1 sendok teh kaldu ayam atau sapi bubuk\n" +
                "1 sendok teh garam\n" +
                "1 sendok teh oregano bubuk\n" +
                "2 sendok makan gula pasir\n" +
                "3 sendok makan minyak untuk menumis\n" +
                "1/2 sendok teh merica bubuk\n" +
                "Bahan untuk saus keju lasagna :\n" +
                "\n" +
                "1000 ml susu cair\n" +
                "250 gram keju cheddar, parut halus\n" +
                "3 sendok makan tepung terigu\n" +
                "3 sendok makan mentega\n" +
                "1/2 sendok teh merica bubuk\n" +
                "garam secukupnya\n" +
                "\n" +
                "\n" +
                "Cara membuat lasagna panggang praktis :\n" +
                "\n" +
                "Tumis bawang putih dan bawang bombay sampai marum , masukan wortel lalu masukan daging giling. Aduk sampai daging berubah warna. Kemudian masukan tomat cincang yang sudah dibuang isi, pasta tomat dan saus tomat. Aduk hingga merata. Masukan merica bubuk, garam , gula pasir, oregano bubuk dan basil bubuk. Tuangkan air masak dengan api kecil kurang lebih 20 menit. angkat dan sisihkan.\n" +
                "\n" +
                "\n" +
                "Cara membuat saus keju lasagna :\n" +
                "\n" +
                "Panaskan mentega sampai meleleh dan mencair, kemudin masukan tepung terigu. Aduk hingga merata. tuang susu cair sambil di aduk- aduk perlahan, jangan sampai menggerindil. Masukan bubuk merica, pala bubuk dan garam secukupnya. masukan keju parut. Aduk hingga merata. Masak dengan api kecil. angkat dan sisihkan\n" +
                "\n" +
                "Letakan saus daging diatas lasagna kemudian taruh lasagna di atasnya, siram kembali dengan saus daging kemudian timpa dengan saus keju. Taruh lasagna kembali, lalu siram dengan saus daging timpa lagi dengan saus keju. Lakukan terus sampai habis atau sesuai dengan selera. Terakhir adalah saus keju. Taburi keju mozarela di paling atas. Panggang di oven dengan suhu 180 derajat Celcius sampi matang selama 30 menit."));

        itemResep.add(new DesignItem(R.drawable.soto,"Soto Betawi Spesial","Bahan untuk membuat soto betawi spesial :\n" +
                "\n" +
                "500 gram daging sapi\n" +
                "santal kental dari 1/2 butir kelapa\n" +
                "3 butir telur rebus\n" +
                "2 buah kentang rebus\n" +
                "jeruk nipis secukupnya\n" +
                "1 buah tomat segar\n" +
                "1 batang daun bawang , iris kecil\n" +
                "1 ruas lengkuas\n" +
                "1 batang sereh yang di memarkan\n" +
                "bawang goreng secukupnya\n" +
                "garam, gula , penyedap rasa secukupnya\n" +
                "Bumbu :\n" +
                "\n" +
                "3 siung bawang putih\n" +
                "5 siung bawang merah\n" +
                "5 buah kemiri\n" +
                "1 cm jahe\n" +
                "1 cm kunyit, bakar sebentar\n" +
                "\n" +
                "\n" +
                "Cara membuat soto betawi spesial :\n" +
                "\n" +
                "Pertama- tama rebus daging sapi yang sudah di cuci bersih dalam 2 liter air sampai empuk. Kemudian potong- potong dadu.sisihkan kaldunya jangan di buang. Panaskan sdikt minyak untuk menumis bumbu yang sudah di haluskan sampai mengeluarkan aroma yang harum. Stelah harum masukan daging yang telah di potong – potong tadi. Aduk – aduk hingga merata kemudian tambahkan lengkuas, jahe, daun jeruk, sereh dan yang terakhir garam dan gula. Masukan tumisan bumbu dan daging tersebut ke dalam kaldu rebusan daging sapi tadi. Kemudian tambahkan santan kental dan aduk sesekali.masak sampai daging empuk dan air sedikit menyusut.\n" +
                "\n" +
                "\n" +
                "Cara penyajian soto betawi spesial\n" +
                "\n" +
                "Dalam mangkok saji di isi dengan kentang rebus di iris, telur rebus iris belah menjadi dua,dan tomat iris.tambahkan daging dan kuah soto kemudian taburi daun bawang , bawang merah goreng,dan berikan sedikit perasan jeruk nipis sesuai dengan selera.\n" +
                "\n" +
                "\n" +
                "Sambal soto betawi spesial\n" +
                "\n" +
                "5 buah cabe merah besar di goreng, kemudian haluskan cabe merah goreng tersebut lalu beri sedikit garam dan tambahkan sedikit kuah soto."));

        itemResep.add(new DesignItem(R.drawable.kerang,"Kerang Asam Manis","Bahan dan bumbu :\n" +
                "\n" +
                "500 gram kerang ( dara, ijo ) sesuai dengan selera\n" +
                "1/2 bawang bombai yang di iris melintang\n" +
                "2 siung bawang putih\n" +
                "1 cm jahe yang di memarkan\n" +
                "3 sendok makan saus cabe\n" +
                "50 gram gula merah\n" +
                "2 lembar daun salam\n" +
                "2 cm lengkuas\n" +
                "1 batang serai yang dimemarkan\n" +
                "1/2 sendok teh merica\n" +
                "1 sendok makan perasan jeruk nipis\n" +
                "1/2 sendok makan tepung maizena yang sudah di encerkan dengan 1 sendok makan air\n" +
                "daram secukupnya\n" +
                "200 ml air\n" +
                "\n" +
                "\n" +
                "Cara membuat resep masakan kerang saus asam manis pedas :\n" +
                "\n" +
                "Cuci bersih kerang kemudian rebus kerang sampai setengah matang. Bawang putih dan merica di tumbuk halus. Tumis bumbu yang sudah di haluskan tadi bersama bawang bombai yang sudah di iris hingga harum. Masukan serai,daun salam , lengkuas dan jahe.aduk- aduk. Masukan kerang yang sudah di rebus tadi kedalam bumbu,tambahkan air, garam secukupnya dan gula merah.aduk- aduk sampai merata. Setelah kuah menyusut tambahkan tepung maizena yang sudah di encerkan dengan air, aduk- aduk sampai kuah mengental.masakan siap di sajikan ."));

        itemResep.add(new DesignItem(R.drawable.teriaki,"Ayam Teriaki","Bahan - bahan dan Cara memasak :\n" +
                "\n" +
                "Siapkan 1/2 kg daging ayam potong dadu kecil kecil. \n" +
                "Atau bisa juga menggunakan sayap untuk rasa yang lebih enak, potong mengikuti ruas sayap.\n" +
                "1 sachet saus teriyaki atau sekitar 3 sendok teh\n" +
                "1/2 butir bawang bombay\n" +
                "3 Siung bawang putih, kupas lalu dicincang kasar\n" +
                "1 sdt merica\n" +
                "1 sdt garam\n" +
                "Kecap manis\n" +
                "1 helai daun bawang, iris menyerong\n" +
                "Air secukupnya\n" +
                "\n" +
                "\n" +
                "Cara membuat ayam teriyaki\n" +
                "\n" +
                "Siapkan wajan penggorengan, beri sedikit minyak lalu tumis potongan bawang putih hingga harum, masukkan ayam yang telah dipotong kecil kecil tadi dan tambahkan 1/2 gelas air (150 cc). Masukkan saus teriyaki, merica, dan garam. lalu biarkan sampai mendidih hingga ayam sedikit lunak. Setelah itu tambah sedikit air dan masukkan daun bawang, irisan bawang bombay, dan beri kecap manis sesuai selera. Kecilkan api agar tidak cepat gosong dan bumbu meresap hingga ayam matang. Angkat ayam dan sajikan dalam piring saji."));

        itemResep.add(new DesignItem(R.drawable.pizza,"Pizza Ala Pizza Hut","Bahan untuk membuat kulit pizza ala pizza hut :\n" +
                "\n" +
                "500 gram tepung terigu tinggi protein\n" +
                "5 gram ragi instan\n" +
                "1 sdt gula pasir\n" +
                "10 gram garam\n" +
                "375 ml air hangat\n" +
                "50 gram minyak zaitun\n" +
                "\n" +
                "\n" +
                "Cara membuat kulit pizza ala pizza hut :\n" +
                "\n" +
                "Pertama- tama larutkan ragi dengan gula menggunakan sebagian air hangat dan biarkan sampai ragi bekerja selama 5 menit. Aduk tepung dan garam menjadi satu. Kemudian tuangkan campuran ragi tadi ketepung. Uleni sampai tercampur rata. Tambahkan sebagian sisa air dan minyak zaitun. aduk hingga tercampur rata. Pindahkan adonan ke atas meja yang telah di alasi keramik. uleni terus menerus sampai adonan kalis elastis. Setelah adonan kalis, simpan adonan kedalam wadah yang telah diolesi minyak sedikit agar tidak lengket, kemudian tutup dengan menggunakan plastik wrap dan diamkan selama 40 menit sampai mengembang. Setelah mengembang, tinju- tinju adona agar angin keluar. Bagi adonan dengan cara menimbang adonan seberat 150 gr. Siapkan loyang pizza bulat yang berdiameter 24 cm. Olesi dengan minyak tipis. Lebarkan dan tipiskan kulit pizza hingga menutupi permukaan loyang. Diamkan selama 10 menit dan pizza siap untuk di beri toping.\n" +
                "\n" +
                "\n" +
                "Bahan olesan saus/ pasta tomat pizza ala pizza hut :\n" +
                "\n" +
                "5 siung bawang putih, cincang halus\n" +
                "5 sdm bawang bombay, cincang\n" +
                "6 buah tomat segar, buang bijinya dan cincang kasar\n" +
                "2 sdm minyak zaitun\n" +
                "3 sdm pasta tomat\n" +
                "8 sdm saus tomat\n" +
                "1 sdt garam\n" +
                "1/2 sdt merica bubuk\n" +
                "1 sdm gula pasir\n" +
                "1 sdt oregano bubuk\n" +
                "1 sdt daun basil bubuk\n" +
                "\n" +
                "\n" +
                "Cara membuat bahan olesan saus/pasta tomat pizza ala pizza hut :\n" +
                "\n" +
                "Panaskan minyak zaitun, tumis bawang bombay dan bawang putih sampai bau harum. Setelah harum masukan saus tomat, pasta tomat, garam, merica bubuk, gula pair , oregano bubuk dan daun basil bubuk. Masak sampai mendidih dan mengental kemudian angkat dan sisihkan\n" +
                "\n" +
                "\n" +
                "Bahan untuk topping pizza ala pizza hut :\n" +
                "\n" +
                "50 gr keju mozarella parut\n" +
                "50 gr keju chedar parut\n" +
                "10 buah jamur , iris tipis\n" +
                "2 lbr smoked beef,iris kotak- kotak\n" +
                "2 buah sosis sapi, iris tipis\n" +
                "2 buah tomat segar, iris melingkar\n" +
                "1 buah paprika , buang bijinya dan potong kotak- kotak.\n" +
                "1/2 buah bawang bombay, iris kotak – kotak\n" +
                "\n" +
                "\n" +
                "Penyelesaian cara membuat pizza ala pizza hut :\n" +
                "\n" +
                "Setelah kulit mengembang tusuk- tusuk permukaan kulit dengan garbu. Olesi permukaan kulit dengan saus atau pasta tomat yang sudah dingin sampai merata keseluruh bagian permukaan kulit pizza. Tata bahan toping sesuai dengan selera dan tutup dengan keju mozarella parut sampai menutupi semua permukaan. Panggang di dalam oven dengan suhu 120 C selama 15-20 menit sapai matang dan keju meleleh. Setelah matang bisa di taburi dengan keju ceddar parut. Sajikan pizza dalam keadaan hangat dengan saus sambal dan saus tomat."));

        itemResep.add(new DesignItem(R.drawable.ramen,"Ramen Ala Negri Sakura","Bahan – Bahan :\n" +
                "\n" +
                "250 gram mie bulat siap saji\n" +
                "2 buah bakso sapi siap pakai potong menjadi 4 bagian\n" +
                "2 buah baksoikan siap pakai potong 4 bagian\n" +
                "2 ekor udang ukuran besar ( kupas, sisakan ekornya )\n" +
                "1 sendok makan tepung maizena\n" +
                "2 helai daun caisim di potong serong\n" +
                "100 gram daging ayam ( potong dadu )\n" +
                "2 sendok teh jahe parut\n" +
                "350 ml air kaldu ayam\n" +
                "2 sendok makan minyak wijen\n" +
                "1 siung bawang putih dicincang halus\n" +
                "1000  ml air untuk merebus\n" +
                "\n" +
                "\n" +
                "Bumbu yang harus disediakan :\n" +
                "\n" +
                "1 sendok teh kecap jepang ( shoyu )\n" +
                "1 sendok teh kecap manis\n" +
                "1 sendok makan saus sambal thailand\n" +
                "1 sendok makan minyak ikan\n" +
                "1/2 sendok teh garam\n" +
                "1/2 sendok teh gula pasir\n" +
                "\n" +
                "\n" +
                "Cara membuat mie ramen :\n" +
                "\n" +
                "pertama- tama mie di rebus dalam air mendidih. Rebus sampai mie mengapung atau matang. Angkat kemudian tiriskan. Panaskan minyak dalam wajan. Tumis bawang putih dan jahe parut sampai bau tercium harum, lalu masukan udang dan ayam sambil diaduk – aduk hingga berubah warnanya. Masukkan air kaldu, bumbu- bumbu, bakso, dan caisim aduk sampai mendidih. Lalu tuangkan larutan tepung maizena. aduk- aduk kembali. Setelah kuah mengental, masukan mie yang sudah direbus tadi. Angkat dan tuangka kedalam mangkok. Mie ramen siap untuk dihidangkan selagi masih hangat."));

        itemResep.add(new DesignItem(R.drawable.steak,"Steak Chicken Crispy","Berikut ini resep chicken steak crispy ala waroeng steak & shake :\n" +
                "\n" +
                "Bahan steak :\n" +
                "\n" +
                "Dagiang ayam, ambil bagian dada 2 potong\n" +
                "3 sendok makan saus tiram\n" +
                "1 sendok teh merica bubuk\n" +
                "1 sendok teh kaldu bubuk\n" +
                "50 gram tepung terigu\n" +
                "1 butir telur ayam\n" +
                "150 gram tepung bumbu\n" +
                "1 sendok makan Tepung maizena\n" +
                "\n" +
                "\n" +
                "Bahan dan bumbu untuk saus steak :\n" +
                "\n" +
                "5 siung bawang merah , cincang halus\n" +
                "4 siung bawang putih , cincang halus\n" +
                "1 siung bawang bombay, cincang halus\n" +
                "2 buah tomat cincang halus, rebus, hilangkan kulit dan isinya\n" +
                "170 ml/setengah botol saus tomat\n" +
                "1 sendok teh lada bubuk\n" +
                "1 sendok makan saus tiram\n" +
                "1 sendok teh kaldu bubuk\n" +
                "1 sendok makan gula pasir\n" +
                "garam secukupnya\n" +
                "200 ml air\n" +
                "mentega secukupnya\n" +
                "\n" +
                "\n" +
                "Bahan pelengkap :\n" +
                "\n" +
                "Kentang secukupnya\n" +
                "Buncis secukupnya\n" +
                "Wortel secukupnya.\n" +
                "\n" +
                "\n" +
                "Cara membuat resep chicken steak crispy ala waroeng steak & shake\n" +
                "\n" +
                "Saus :\n" +
                "Lelehkan mentega lalu tumis bawang bombay, bawang merah, bawang putih sampai harum. Masukan tomat yang sudah di rebus sampai kulitnya terkelupas dan sudah di saring tadi. Lalu makukan air dan bumbu- bumbu.masak sampai mengental bila kurang kental bisa di tambai dengan cairan tepung maizena.\n" +
                "\n" +
                "Steak :\n" +
                "Rendam daging ayam dengan saus tiram, merica bubuk dan kaldu bubuk.masukan dalam kulkas dan diamkan. Setelah 30 menit siapkan 3 piring atau wadah untuk tepung terigu, letur kocok dan tepung bumbu dengan tepung maizena. Celupkan daging ke tepung terigu, lalu masukan ke kocokan telur kemudian masukan ke tepung bumbu dengan camouran tepung maizena. Cubit- cubit ayam agar bisa keriting saat di goreng. Goreng daging dengan minyak panas dan cukup banyak sampi ayam terendam minyak. Goreng kentang sampai kuning keemasan dan rebus wortel sera buncis. Sajikan steak dengan saus dan pelengkapnya. Tambahkan saus sambal, saus tomat atau merica bubuk sesuai dengan selera anda."));


        adapter = new ListAdapter(this, itemResep);

        ListViewResep.setAdapter(adapter);
    }
}
