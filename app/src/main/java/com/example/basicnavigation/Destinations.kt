package com.example.basicnavigation

interface Destinations {
    val route:String
}

object MenuList:Destinations{
    override val route = "MenuList"
}

object Home:Destinations{
    override val route = "Home"
}