# Data Structures
* This repo is all about _dynamic data structures_; structures that can grow and shrink at execution time. Contrast may be made against other structures e.g. arrays that will have a constant size during program execution

# Introduction
* We begin by creating a *self referential* class. This is a class that contains at least one variable of the same class type.
* Self referential classes can be used as foundation blocks when creating _LinkedLists_, _Stacks_, _Queues_ and _Trees_.

> The CS comcepts in this repo are language agnostic and should therefore work in any programming language that can hold its own.

# 1. A Self Referential Class
* [This](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/src/com/deitel/jhtp4/ch19/ListNode.java) is the self referential class in this repo.
* The class `ListNode` has a variable `nextNode` of type `ListNode`, hence the term _self referential_.
* The Self Referential class (`ListNode`) objects can be called _Nodes_.

# 2. A Linked List
* A _Linked List_ can be described as a linear collection of _Self Referential_ class objects.
* In this context, a Linked List will be a linear collection of `ListNode` objects.
* These `ListNode` objects are linked through the `nextNode` attribute present in each `ListNode` object.
* The Self Referential class (`ListNode`) objects can be called _Nodes_.
* A program traverses a LinkedList through the reference (`nextNode`) in each node object.
* a `nextNode` with the value `null` denotes the end of the LinkedList.
* [Here](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/src/com/deitel/jhtp4/ch19/List.java) is the implementation of the Linked List for this repo.
* This is the final [product](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/ft-readme/ListTest.java) being demonstrated.
