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

# 3. Stacks
* In this context, a _Stack_ is a constrained version of a Linked List.
* A _Stack_ is a data structure in which data can only be added/removed from one end, usually referred to as the _top_.
* For this reason, it's referred to as a _last in, first out_ (*LIFO*) data structure.
* Implementation of this structure is similar to that of a Linked List, each `ListNode` object is called a _node_ and a link with a `null` reference denotes the bottom of the Stack.
* The primary methods for operations are;
  * *push* - adds a new _node_ on the _top_ of the Stack
  * *pop* - removes a _node_ from the _top_ of the Stack

 * The Stack class is implemented [here](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/ft-readme/src/com/deitel/jhtp4/ch19/StackComposition.java)

 > Note the similarity in nature amongst Linked Lists and Stacks. The attribute `stackList` of type `List` is used to simulate *push* and *pop* via its *insertAtFront* and *removeFromFront* methods respectively

 > The Stack is also implemented via [_inheritance_](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/ft-readme/src/com/deitel/jhtp4/ch19/StackInheritance.java) (vs the _composition_ implementation above). However, inheritance is less elegant since it allows *insertAtBack* and *removeFromBack* methods of *List* to be available for use. These two methods completely negate the philosophy behind Stacks

# 4. Queues
* The idea behind queues is derived from the everyday experiences encountered while waiting for a service e.g. _queuing_ at a checkout line in a supermarket, _queuing_ at the banking halls etc.

> To the people that jump everyday queues and fail to grasp the Queues concept, karma is something, isn't it!?

* In _Queues_, data can only be added at one end called the _tail_, and removed from the other end called the _head_. For this reason, it's called a _first in, first out_ (*FIFO*) data structure.
* The primary methods for operations are;
  * *enqueue* - to insert nodes at the tail
  * *dequeue* - to remove nodes at the head

* The Queue is implemented [here](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/src/com/deitel/jhtp4/ch19/QueueInheritance.java).
* The class inherits from List implements *enqueue* and *dequeue* via List methods *insertAtBack* and *removeFromFront*.

> The implementation above uses inheritance. Other List methods like *insertAtFront*, *removeFromBack* are still available in objects of QueueInheritance. These two methods negate the philosophy behind creation of Queues.

> Composition (not implemented in the repo yet) is more elegant and will not avail these methods unless they are explicitly coded as such.

.
