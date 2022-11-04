package com.aimardon.tarixiymalumotlar

import android.os.Bundle
import android.view.Display.Mode
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import com.aimardon.tarixiymalumotlar.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    private val recyclerAdapter by lazy { RecyclerAdapter() }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val a = listOf<ModelItem>(
            ModelItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Bukhara01.jpg/450px-Bukhara01.jpg",
                "Minorai Kalon",
                "Minorai Kalon oʻrnida avval ham minora boʻlgan, u qulab tushgach, hozirgisi mustahkam qilib qayta qurilgan. Oʻz vaqtida Minorai Kalon yuqoridan kuzatish va din ishlari, xususan, aholini Poi Kalon masjidiga bayram namozlariga va juma namozlarga chaqirish uchun xizmat qilgan. Baʼzi manbalarda Buxoro amirligi davrida bu yer tomoshaviy qatl joyi boʻlgan degan farazlar ham uchraydi.\n" +
                        "Bu ulugʻ" +
                        " inshoot bilan bogʻl" +
                        "iq koʻplab afsonalar keltirilgan. Ulardan birida aytilishicha," +
                        " tuya suti va alebastr qorishmasidan minoraning poydevorini tiklaga" +
                        "n usta-quruvchi birdan gʻoyib boʻlgan va ikki yildan keyin, poydevo" +
                        "r pishiq va mustahkam boʻlgandan soʻng qaytib kelib, inshootni gʻi" +
                        "shtdan koʻtarish ishlarini boshlagan.\n" +
                        "Muxandis va meʼmor Baqo loyihasi asosida Qoraxoniylar sulo" +
                        "lasidan Arslonxon Muhammad 1127-yilda qurdirgan. Poydevor" +
                        "i tosh va maxsus qir qorishmasidan t" +
                        "erilgan."
            ),
            ModelItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Registan_Sherdor_madrassah2014.JPG/" +
                        "330px-Registan_Sherdor_madrassah2014.JPG", "Sherdor madrasasi",
                "Sherdor madrasa - Samarqanddagi meʼmoriy yodgorlik (1619—36). Registon ansambli tarkibida. Mirzo Ulugʻbek" +
                        " xonaqohi oʻrniga Yalangtoʻsh Bahodir qurdirgan. Ulugʻbek madrasasining roʻparasida joylashgan. Madrasa tarhi " +
                        "toʻrtburchak, 2 qavatli. Bosh tarzining 2 qanotida qovurgʻali gumbaz va minoralar joylashgan. Peshtoq ravogʻi " +
                        "ichkarisidagi koshinkori bezak orasida qora zaminli koshinga oq harflar bilan meʼmor Abdujabbor nomi yozilgan. " +
                        "Qanoslaridagi qizgʻish zarhal tusli sher oq ohuni quvmoqda. Quyosh bodomqovoq, qiyiq koʻzli qilib tasvirlanib," +
                        " yuzi zarhal tusli yogʻdu bilan hoshiyalangan. Madrasa nomi shu tasvirdan kelib chiqqan. Binoning serhashamligi shu" +
                        " peshtogʻida. Peshtoqning 2 tomonida gumbazli darsxona va masjid joylashgan. Hovli atrofidagi 2 qavatli hujralar (54 ta)ning" +
                        " oldi ravoqli ayvon. Ayvonlar yozda darsxona vazifasini oʻtagan. 1960—64 yillarda peshtoqqanoslaridagi koshinkori naqshlar " +
                        "qayta tiklangan."
            ),
            ModelItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Registan_Sherdor_madrassah2014.JPG/330px-Registan_Sherdor_madrassah2014.JPG",
                "Sherdor madrasasi",
                "Sherdor madrasa - Samarqanddagi meʼmoriy yodgorlik (1619—36). Registon ansambli tarkibida. Mirzo Ulugʻbek xonaqohi oʻrniga Yalangtoʻsh Bahodir qurdirgan. Ulugʻbek madrasasining roʻparasida joylashgan. Madrasa tarhi toʻrtburchak, 2 qavatli. Bosh tarzining 2 qanotida qovurgʻali gumbaz va minoralar joylashgan. Peshtoq ravogʻi ichkarisidagi koshinkori bezak orasida qora zaminli koshinga oq harflar bilan meʼmor Abdujabbor nomi yozilgan. Qanoslaridagi qizgʻish zarhal tusli sher oq ohuni quvmoqda. Quyosh bodomqovoq, qiyiq koʻzli qilib tasvirlanib, yuzi zarhal tusli yogʻdu bilan hoshiyalangan. Madrasa nomi shu tasvirdan kelib chiqqan. Binoning serhashamligi shu peshtogʻida. Peshtoqning 2 tomonida gumbazli darsxona va masjid joylashgan. Hovli atrofidagi 2 qavatli hujralar (54 ta)ning oldi ravoqli ayvon. Ayvonlar yozda darsxona vazifasini oʻtagan. 1960—64 yillarda peshtoqqanoslaridagi koshinkori naqshlar qayta tiklangan."
            ),
            ModelItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Registan_Tillya-Kari_madrasah2014.JPG/330px-Registan_Tillya-Kari_madrasah2014.JPG",
                "Tillakori madrasasi",
                "\n" + "Tillakori madrasasi\n" +
                        "\n" +
                        "Maqola\n" +
                        "Munozara\n" +
                        "\n" +
                        "lotin/кирилл\n" +
                        "Mutolaa\n" +
                        "Tahrirlash\n" +
                        "Manbasini tahrirlash\n" +
                        "Tarix\n" +
                        "Vikipediya, ochiq ensiklopediya\n" +
                        "Registan Tillya-Kari madrasah2014.JPG\n" +
                        "Stamps of Uzbekistan, 2007-32.jpg\n" +
                        "Tillakori madrasa, Samarqanddagi meʼmoriy yodgorlik. Registon ansamblida Ulugʻbek davrida bunyod etilgan Mirzoyi karvonsaroyi (15-asr) oʻrnida Samarqand hokimi Yalangtoʻshbiy Bahodir Madrasa va jome masjid qurdirgan (1641—46). Karvonsaroy asosi ustiga Madrasa (shim. sharqiy qismida), hujralar oʻrnida peshtoq gumbazli masjid (gʻarbida) joylashgan. Dastlab \"Yalangtoʻshbiy kichik madrasasi\" deb nomlangan. Keyinchalik masjid bezagida boshqa bir obida qurilishiga yetadigan miqdorda oltin sarflangani uchun \"tillakori\" (tilladan ishlov berilgan) deb yuritila boshlagan. Tilla Qori madrasasidan shahar jome masjvdi va Madrasa sifatida foydalanilgan. Shuning uchun masjidi (63x22 m) katta va serhashamligi bilan boshqa madrasalardan ajralib turadi. Madrasa (70x70 m) ga gʻarbiy peshtoq orqali kiriladi. Peshtoq chuqur ravoqli, 2 qanotining oldi ravoqli, 2 qavatli hujralar, burchaklarini teng hajmdagi guldastamezanalar egallagan. Masjid xonaqohi (10,8x10,8 m)ning poygumbazi baland, uzoqdan koʻzga tashlanib turadi. Uning gumbazi nihoyasiga yetkazilmagan. Xonaqoh toʻriga marmardan mehrob va zinapoyali minbar ishlangan. Oʻz davrida zarhal naqshlar bilan jozibador bezatilgan xonaqohning 2 yonini oldi ravoqli, gumbaz tomli ayvon (yoʻlak)lar egallagan. Peshtoq ravogʻidagi marmar taxtachada bezak ishlari 1659—60 yillarda bajarilganligi yozilgan."
            )
        )
        binding.recyclerView.adapter = recyclerAdapter
        recyclerAdapter.submitList(a)
        recyclerAdapter.seton(object : RecyclerAdapter.Onclick {
            override fun click() {
                val clickpostion = recyclerAdapter.onitem(recyclerAdapter.A!!)
                val haqida = a[clickpostion].haqida
                val action=HomeFragmentDirections.actionHomeFragmentToViewFragment(arrayOf(haqida))
                findNavController().navigate(action)
            }
        })
    }
}