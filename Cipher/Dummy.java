/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          Dummy                                               |
|   Description:    Template class written for reference! Come here     |
|                   if you need a refresher on how classes work.        |
|                                                                       | 
|   Author:         Waves                                               |
|   Date:           4/28/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/





/* Below is the class declaration. */
public class Dummy {

    /*
        Next we have the Dummy class' data members. A class can hold any amount of data members.
        Let's go through the ones we have here.
    */
    
    /* 
       Here we're declaring a public String variable called name.
       Since it's public, other classes can access this class' "name" variable if they wanted to. Also
       all variables are public by default. Which means that (String name = "Dummy") is the same as
       (public String name = "Dummy")
    */
    public String       name;
    public String       purpose;
    
    /* Same as above, but this time it's an int variable. */
    public int          id;
    
    /* 
       Data can also be private. This means that only the Dummy class can DIRECTLY access its own
       Social Insurance Number. Obviously we wouldn't want that information being public. Also, it's safe
       from being modified by other classes.
    */
    private int         socialInsuranceNumber;
    
    /* Same as above, but this time it's a String variable. */
    private String      homeAddress;
    
    /* 
       Data members can also be other classes. Here we're declaring the Dummy class to have access to 
       its own Screen object. Currently commented out because the Screen class doesn't exist yet.
    */
    //public Screen       myScreen;
    
    
    /* On to the functions of this class */
    
    
    /* 
       This function is called a constructor and it's a special function that every class must have.
       The role of the constructor is to initialize all of the class' data members. Meaning that
       it needs to make sure all data are being given values. You could just as easily initialize them
       on the same line as they were declared (String name = "Dummy") but it makes thing cleaner this way
       
       I should note that you can have multiple constructors in a class. The one we have here is the "default constructor"
       because it takes no parameters.
    */
    public Dummy() {
        name = "Dummy";
        purpose = "To be a a helpful resource";
        id = 0000;
        socialInsuranceNumber = 000000;
        homeAddress = "55 Street";
        
        /* 
           Data that are objects can also be initialized. Here, we're actually calling the Screen class' constructor! 
           Right now the line is commented because the Screen class hasn't been made yet.
        */
        //myScreen = new Screen();
    }
    
    
    /* 
       Remember how we said it's better that some data inside a class be declared as private? 
       What if another class needs access to that data for whatever reason? Using our Social Insurance as 
       an example, what if someone needs the Dummy's Social Insurance Number? Luckily we can create public
       functions that will retrieve them for us. Now, when other classes call this function on Dummy, it will have
       access to the Social Insurance Number data without being able to directly access it or modify it. The best
       of both worlds!
    */
    public int getSocialInsurance() {
        return socialInsuranceNumber;
    }
    
    
    /* 
       Don't forget that we can create any kind of function we want in a class. If you think it would be beneficial for a
       class to have a certain function, don't be afraid to add it!
    */
    public int addTwoPlusTwo() {
        int answer = 2 + 2;
        return answer;
    }
    




}