# OOP Forum Week-9
### Name/ID: I Kadek Gita Pradnya Widagda/2602118502

## 1.(a) By making use of an example from the above scenario, distinguish between a class and an instantiation of a class. (3 points)
A class is a type of blueprint that you can use to make objects. On the other hand, an instantiation of a class, also known as an object, is a specific instance created based on the class blueprint.
For example  "SalesPerson" is the class that encapsulates the properties and behaviors of a salesperson, while the instantiate class would be the an actual sales person

## The different modules in the program each open a graphical user interface (GUI). Each GUI has a similar design but contains differences specific to each module.
## 1.(b) By giving two examples, explain how the principles of inheritance can be incorporated into the design of this administration program. (4 points)
Example 1:
In game design, inheritance is used to create different types of game characters. For example, a base character class can be defined with common properties like health and movement. Then, specific character classes like "Player" and "Enemy" can inherit from the base class, adding unique features such as weapons or AI behavior. This allows game designers to reuse code and easily create diverse characters with specialized abilities.

Example 2:
In game design, inheritance is employed to create a variety of objects on the screen. Instead of writing separate code for each object type, a base class called "GameObject" is created with shared properties like position and collision detection. Subclasses like "Enemy" and "PowerUp" inherit from GameObject, adding their own specific characteristics. This approach makes it easier to manage and expand the game's object system, promoting code reuse and enabling the creation of dynamic and interactive game worlds.

## (c) Describe how the use of libraries can facilitate the development of programs like this company’s administration program. (3 points)
The use of libraries can greatly facilitate the development of programs like this company's administration program. Libraries are pre-written code modules or collections of functions that provide a set of reusable functionalities.

## 2(a) Complete the constructor public SalesPerson(String id), from the SalesPerson class. (2 points)
```
    public SalesPerson(String id){

// code missing
        this.id = id;
        this.salesHistory = new Sales[100];

    }
```

## 2(b) Explain why accessor methods are necessary for the SalesPerson class. (3 points)
So we can have access to the private attributes.
## 2(c) (i) Construct unified modelling language (UML) diagrams to clearly show the relationship between the SalesPerson and Sales classes. (4 points)
<img src = IMG/UML.png>

## 2(c) (ii) Outline a negative effect that a future change in the design of the Sales object might have on this suite of programs. (2 points)
If the design of the Sales object undergoes significant changes, it may require corresponding changes in the SalesPerson class and potentially other related classes in the suite of programs. 
     
## 2(d) State the output after running this code. (4 points)
<img src = IMG/rslt.png>

## (e) Construct the method calcTotalSales(), in the SalesPerson class that calculates the total value of the sales for a specific SalesPerson object. (5 points)
(code can be seen at SalesPerson Class)
```
public double calcTotalSales(){
// calculates total sales for the salesperson

// code missing
        double total = 0;

        for(int i = 0; i<count; i++){
            total+=salesHistory[i].getValue() * salesHistory[i].getQuantity();
        }
        return total;
}
```

## The salesPeople array contains 100 instantiated objects. The company wishes to reward the salesperson whose sales have the largest total value.
## (f) By making use of any previously written methods, construct the method highest(), that returns the ID of the salesperson whose sales have the largest total value. (5 points)
(code can be seen at Driver Class)
```
    public static SalesPerson Highest(SalesPerson[] salesPeople){
        SalesPerson highestSale = null;
        for(int i = 0; i < salesPeople.length; i++){
            if(salesPeople[i] != null){
                if(highestSale == null || salesPeople[i].calcTotalSales() > highestSale.calcTotalSales()){
                    highestSale = salesPeople[i];
                }
            }
        }
        return highestSale;
    }
```

## A further class in this suite of programs is the Payroll class. This class is run at the end of each month to calculate each salesperson’s salary, which is based on the sales that have been made during that month.
## (h) Suggest changes that must be made to the SalesPerson class and/or the Sales class to allow these calculations to be made. (3 points)
Date variable should be added so it can count the salary and make its own setter and getter
## (i) Discuss the use of polymorphism that occurs in this suite of programs. (3 points)
Due to 2 constructors that occurs in SalesPerson class, so the use of polymorphism that occurs in this suite of programs is overloading
