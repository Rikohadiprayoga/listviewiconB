package com.example.listview_icon

object Detail {
    private val foodName = arrayOf(
        "rendang",
        "dendengbatokok",
        "sotopadang",
        "pepeda",
        "pecellele"
    )

    private val detail = arrayOf(
        "rendang adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau",
        "Dendeng batokok adalah masakan khas Sumatra Barat dibuat dari irisan tipis dan lebar. ",
        "Soto Padang adalah hidangan berkuah kaldu sapidengan bahan irisan daging sapi yang sudah digoreng kering, bihun (mie dari tepung beras), ditambah perkedel kentang dan dihidangkan panas-panas.",
        "Papeda adalah makanan berupa bubur sagu khas Maluku dan Papua yang biasanya ",
        "Pecel lele adalah sebuah makanan yang murah dan meriah."
    )

    private val foodPoster = intArrayOf(
        R.drawable.rendang,
        R.drawable.dendengbatokok,
        R.drawable.sotopadang,
        R.drawable.pepeda,
        R.drawable.`pecellele`

    )

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.detail = detail[position]
                food.poster = foodPoster[position]
                list.add(food)
            }
            return list
        }
}