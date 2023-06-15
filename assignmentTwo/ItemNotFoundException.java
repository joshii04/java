package assignmentTwo;

public class ItemNotFoundException extends Exception
    {
        public ItemNotFoundException(String message)
        {
            super(message);//this is where the message will be outputed through 
            //this class is very powerful, especially when you catch the errors as you please
        }    
    }