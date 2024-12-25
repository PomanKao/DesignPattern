package com.home.designpattern.designpatterns.Composite

class Team(name: String) : Group(name) {
    override fun print() {
        println(name)
    }

    override fun addGroup(group: Group) {
    }
}