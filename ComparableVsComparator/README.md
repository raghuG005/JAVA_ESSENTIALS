#Comparable vs Comparator

1.Both used for Object sorting based on object's properties or fields either asc or desc

## Comparable

it is an Interface(Functional) and has one method compareTo(takes comparer Object)
i)we can use by implementing in our class Object
## ex:
class Laptop implements Comparable<Laptop>
  
ii) this make our class object as comparable with certain parameter to measure with another one
ex: take a Laptop object.Laptop has so many features whenever you compare with another
Laptop ,we obvisly choose any one feature and start comparing like ram,processor wise.Same happening in java Comparable Interface.

## Comparator

it is also an Interface(Functional) and has one method compare(takes two Objects to compare)
i) we can't implement this into our class object

## why and when we go for Comparator?

suppose we have use some third party classes that time we can't modify the classes
to implementing Comparable Interface.

In the case we can create Anonymous class or lamda expression for Comparator Interface
(we can't create object for Interface thats why we go for Anonymous class or lamda expression)

Comparator Interace has method a called compare(Obj1,Obj2) so we can easily compare two different object with same class.

Now one question will arise in your mind ......

## why don't we create Anonymous class or lamba expression for Comparable Interface?

Answer is ...we won't create Anonymous class or lamba expression for Comparable Interface
the reason is Comparable Interface has a method called compareTo(Obj) takes argument as comparer
Object.

So whenever we implementing Comparable Interface in class we can easily take current object(by using this keyword) to compare with another one.

If you want to use compareTo() method definitly create a object for particular class that implementing Comparable Interface then passing another object into compareTo(obj1)

## ex:
@Override
public int compareTo(Laptop objlaptop) {
return this.getRamCapacity() > objlaptop.getRamCapacity() ? 1 : -1;
}

Now we suppose to create an Anonymous class or lamba expression for Comparable Interface
there is a method that takes one comparer object but we are not able to find out which object to compare.

thats the reason behind it.
