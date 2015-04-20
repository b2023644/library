package com.library

class Course {

String department

String title

String code

String description

String tutor
String toString(){title}


    static constraints = {

	title()
 	department()
 	description maxSize: 5000
 	code()
	tutor()
 	

    }
}
