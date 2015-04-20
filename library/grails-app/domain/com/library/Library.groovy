package com.library

class Library {

String location

String openingHours

Book book

Student student

Librarian librarian

static hasMany=[books: Book, students: Student, librarians: Librarian]

    static constraints = {

	location()
	openingHours()
	book()
	student()
	librarian()
    }
}
