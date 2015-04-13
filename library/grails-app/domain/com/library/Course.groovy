package com.library

class Course {

String department

String title

String code

String description

String tutor



    static constraints = {

	title()
 	department()
 	description maxSize: 5000
 	code()
	tutor()
 	

    }
}
