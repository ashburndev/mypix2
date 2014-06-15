package com.ashburndev

class Person {

  String firstName
  String lastName

  static constraints = {
    firstName nullable:false
    lastName nullable:false
  }
}
