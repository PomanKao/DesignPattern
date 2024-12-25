package com.home.designpattern.designpatterns.Composite

abstract class Group(val name: String) {
    abstract fun print()
    abstract fun addGroup(group: Group)
}