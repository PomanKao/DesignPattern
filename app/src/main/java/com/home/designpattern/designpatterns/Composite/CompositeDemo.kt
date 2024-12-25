package com.home.designpattern.designpatterns.Composite

fun main() {
    val newLeague = League("Hero League")
    val firstTeam = Team("First Team")
    val secondTeam = Team("Second Team")
    newLeague.addGroup(firstTeam)
    newLeague.addGroup(secondTeam)
    newLeague.print()
}