package com.jemutai.retrofit_jetpack

data class House(
    val id:String,
    val houseColor :String,
    val animal :String,
    val name :String,
    val founder :String,
    val element : String,
    val ghost : String,
    val commonRoom:String,
    val heads : List<HouseHead>,
    val traits : List<Trait>
)



data class HouseHead(
    val  id : String,
    val lastName :String
)

data class  Trait(
    val id :String,
     val  name:String

)
