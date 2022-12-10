package com.example.applistmenu.list

import android.icu.text.CaseMap.Title
import android.media.Image
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize data class ArticleModel(
    val image: String,
    val title: String,
    val ingredients: String,
    val price: String
) : Parcelable {
    companion object {

        fun createDefultData(): List<ArticleModel> {

            val list = ArrayList<ArticleModel>()
            list.add(ArticleModel("https://images.pexels.com/photos/8472630/pexels-photo-8472630.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Прайм рол","Рис, норі, сир філадельфія, лосось, хіяші","169 грн"))
            list.add(ArticleModel("https://images.pexels.com/photos/12437583/pexels-photo-12437583.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Агі сяке","Японський рис, лосось, сир філадельфія, авокадо, огірок, норі","189 грн"))
            list.add(ArticleModel("https://images.pexels.com/photos/8472649/pexels-photo-8472649.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Унагі рол","Рис, вугор, сир філадельфія, огірок, соус унагі, норі","159 грн"))
            list.add(ArticleModel("https://images.pexels.com/photos/8472650/pexels-photo-8472650.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Самурай","Рис, норі, сир філодельфія, тигрова криветка, лосось, огірок","199 грн"))
            list.add(ArticleModel("https://images.pexels.com/photos/8951299/pexels-photo-8951299.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Токіо","Рис, сир філадельфія, філе вугра, ікра","249 грн"))
            return list
        }

    }

}
