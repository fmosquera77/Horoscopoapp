package com.example.horoscapp.domain.model

import com.example.horoscapp.R.drawable
import com.example.horoscapp.R.string

sealed class HoroscopeInfo (val img:Int, val name: Int){
    data object Aries:HoroscopeInfo(drawable.aries , string.aries)
    data object Taurus:HoroscopeInfo(drawable.tauro , string.taurus)
    data object Gemini:HoroscopeInfo(drawable.geminis , string.gemini)
    data object Cancer: HoroscopeInfo(drawable.cancer, string.cancer)
    data object Leo: HoroscopeInfo(drawable.leo, string.leo)
    data object Virgo: HoroscopeInfo(drawable.virgo, string.virgo)
    data object Libra: HoroscopeInfo(drawable.libra, string.libra)
    data object Scorpio: HoroscopeInfo(drawable.escorpio, string.scorpio)
    data object Sagittarius: HoroscopeInfo(drawable.sagitario, string.sagittarius)
    data object Capricorn: HoroscopeInfo(drawable.capricornio, string.capricorn)
    data object Aquarius: HoroscopeInfo(drawable.aquario, string.aquarius)
    data object Pisces: HoroscopeInfo(drawable.piscis, string.pisces)


}