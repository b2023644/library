package com.library

class Library {

String location

String openingHours

Book book

Student student

Librarian librarian

    static constraints = {

	location()
	openingHours()
	book()
	student()
	librarian()
    }
}
