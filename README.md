# Design Patterns
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/292d1b92415f4d91a7e90a8c86d953a3)](https://www.codacy.com/app/Maxvgrad/Patterns?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Maxvgrad/Patterns&amp;utm_campaign=Badge_Grade)

## OO Basics
1. Abstraction
2. Encapsulation
3. Polymorphism
4. Inheritance

## OO Principles
1. Encapsulate what varies 
2. Favor composition over inheritence
3. Program to interfaces, not implementations
4. Strive for loosely coupled designs between objects that interact
5. Classes should be open for extension, but closed for modification
6. Depend upon abstractions. Do not depend upon concrete classes. *Dependency Inversion Principle*
7. *Principle of Least Knowledge* - talk only to your immediate friends.

## Dependency Inversion Principle
The following guidelines can help you avoid OO designs that violate the Dependency Inversion Principle:
* No variable should hold a reference to a concrete class.
* No class should derive from a concrete class.
* No method should override an implemented method of any of its base classes.

## Least Knowledge Principle
we should only invoke methods that belongs to:
* The object itself
* Objects passed in as a parameter to the method
* Any object the method creates or instantiates
* Any components of the object

## Keep It Simple, Stupid Prinsiple ([KISS](http://people.apache.org/~fhanik/kiss.html))

## Less Is More Principle

## Don't Repeat Yourself (DRY)

## You aren’t gonna need it (YAGNI)

## Do The Simplest Thing That Could Possibly Work
