# Data Structures
* This repo is all about _dynamic data structures_; structures that can grow and shrink during execution time. Contrast may be made against other structures e.g. arrays that will have a constant size during program execution

# Introduction
* We begin by creating a *self referential* class. This is a class that contains at least one variable of the same **class type**.
* Self referential classes can be used as foundation blocks when creating _LinkedLists_, _Stacks_, _Queues_ and _Trees_.

> The CS concepts in this repo are language agnostic and should therefore work in any programming language that can hold its own.

# 1. A Self Referential Class
* [This](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/src/com/deitel/jhtp4/ch19/ListNode.java) is the self referential class for _LinkedLists_, _Stacks_ and _Queues_ in this repo.
* The class `ListNode` has an attribute `nextNode` of type `ListNode`, hence the term _self referential_.
* Objects of the Self Referential class (`ListNode`) can be called _Nodes_.

# 2. A Linked List
* A _Linked List_ can be described as a linear collection of _Self Referential_ class objects.
* In this context, a Linked List will be a linear collection of `ListNode` objects.
* `ListNode` objects can be called _nodes_. These _nodes_ are linked to one another through the `nextNode` attribute present in each of them.
* A program traverses a LinkedList through the reference attribute (`nextNode`) in each node object.
* a `nextNode` with the value `null` denotes the end of the LinkedList.
* [Here](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/src/com/deitel/jhtp4/ch19/List.java) is the implementation of the Linked List for this repo.
* This is the [end result](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/ListTest.java) being demonstrated.

# 3. Stacks
* In this context, a _Stack_ is a constrained version of a Linked List.
* Just like a Linked List, it is a linear collection of _self referential_ class objects. However, in _Stacks_, data can only be added/removed from one end, usually referred to as the _top_.
* For this reason, it's referred to as a _last in, first out_ (**LIFO**) data structure.
* Implementation of this structure is similar to that of a Linked List. Each `ListNode` object is called a _node_. A _node_ with a **null** `nextNode` reference denotes the _bottom_ of the _Stack_.
* The primary methods for operations in _Stacks_ are;
  * **push** - adds a new _node_ on the _top_ of the _Stack_
  * **pop** - removes a _node_ from the _top_ of the _Stack_

* The _Stack_ class for this repo is implemented [here](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/src/com/deitel/jhtp4/ch19/StackComposition.java)

 > Note the similarity in nature amongst Linked Lists and Stacks. The attribute `stackList` of type `List` (the class that implements a Linked List) is used to simulate *push* and *pop* via its *insertAtFront* and *removeFromFront* methods respectively

* This is the [end result](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/StackCompositionTest.java) being demonstrated.

 > The Stack can also be implemented via [_inheritance_](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/src/com/deitel/jhtp4/ch19/StackInheritance.java) (vs the _composition_ implementation demonstrated above). However, inheritance is less elegant since it allows *insertAtBack* and *removeFromBack* methods of *List* to be available for use. These two methods completely negate the philosophy behind _pop_ and _push_ operations of _Stacks_

# 4. Queues
* The idea behind queues is derived from the everyday experiences encountered while waiting for a service e.g. _queuing_ at a checkout line in a supermarket, _queuing_ at the banking halls etc.

> To the people that jump everyday queues and fail to grasp the Queues concept, karma is something, isn't it!?

* In _Queues_, data can only be added at one end called the _tail_, and removed from the other end called the _head_. For this reason, it's called a _first in, first out_ (**FIFO**) data structure.
* The primary methods for operations are;
  * **enqueue** - to insert nodes at the tail
  * **dequeue** - to remove nodes at the head

* The _Queue_ is implemented [here](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/src/com/deitel/jhtp4/ch19/QueueInheritance.java). For this implementation, the _Queue_ class inherits from _List_ and implements the *enqueue* and *dequeue* operations via _List_ methods _insertAtBack_ and _removeFromFront_.

 > The implementation above uses inheritance. Other _List_ methods like *insertAtFront*, *removeFromBack* are still available in objects of class QueueInheritance. These two methods negate the philosophy behind _enqueue_ and _dequeue_ operations of _Queues_.

 > Composition (not yet implemented in the repo) is more elegant (vs _inheritance_) because it will not avail these methods unless explicitly coded to do so.

* This is the [end result](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/QueueInheritanceTest.java) being demonstrated.

# 5. Trees
* Unlike _Linked Lists_, _Stacks_ and _Queues_, the _Tree_ structure relies on `TreeNode` (doubly linked) instead of `ListNode` (singly linked). This is because _Trees_ are **non linear** data structures.
* Doubly linked simply means that the self referential class has two attributes (`leftNode` and `rightNode`) that refer to the same **class type**.

  ## i. The self referential class
  * [TreeNode](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/src/com/deitel/jhtp4/ch19/TreeNode.java) is the self referential class that will used to create nodes in the _Tree_.
  
  ## ii. The Tree
  * This will be a _binary tree_. It's not linear like the previous data structures we've come across so far.
  * The _root node_ is the first node in a _Tree_.
  * Subsequent nodes _branch_ off the _root node_ and are referred to as _child nodes_.
  * Each node in the _Tree_ may have no child nodes, a _left child node_ only, a _right child node_ only or both left and right child nodes.
  * A node with no children is called a _leaf node_.
  
  * The Tree's imlpementation can be found [here](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/src/com/deitel/jhtp4/ch19/Tree.java).
  * The [demonstration](https://github.com/andela-lkabui/sturdy-octo-happiness/blob/master/TreeTest.java) for the _Tree_ data structure only stores integers for simplicity when fleshing out how binary trees are supposed to work. The gist of binary trees is that;
    1. The root node is the first node in the Tree (it has no parent nodes)
	2. Nodes whose `data` attribute contain a value that is less than the parent node's data attribute are stored in the `leftNode` variable.
	3. Nodes whose `data` attribute contain a value that is greater than the parent node's data attribute are stored in the `rightNode` variable.
	4. _Leaf nodes_ signal the end of a branch


  * The tree's demonstration generates random integers and stores them in the tree. Tree traversals are then performed to verify the integrity of the structure. There are three kinds of tree traversals;
    1. **Post Order Traversal** - Traverses through the _left child node_, the _right child node_ then the _root node_ respectively.
    2. **In Order Traversal** - Traverses through the _left child node_, the _root node_ then the _right child node_ respectively.
    3. **Pre Order Traversal** - Traverses through the _root node_, the _left child node_ then the _right child node_ respectively.

# Credits
* This material has been sourced from _Java How To Program, 4th Edition_ written by Paul and Harvey Deitel. This content doesn't do justice to the brilliance potrayed in the entirety of that book.
