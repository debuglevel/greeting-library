package de.debuglevel.greetlib

import javax.inject.Singleton

@Singleton
class BookService {
    fun formatTitle(title: String): String {
        return "== $title =="
    }
}