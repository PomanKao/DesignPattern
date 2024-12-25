package com.home.designpattern.designpatterns.Composite

class League(name: String) : Group(name) {
    private val groupList = mutableListOf<Group>()

    override fun print() {
        println(name)
        for (group in groupList) {
            group.print()
        }
    }

    override fun addGroup(group: Group) {
        groupList.add(group)
    }
}