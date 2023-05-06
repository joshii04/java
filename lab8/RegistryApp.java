/*Author: Joshua Sinclair
Title: RegistryApp.java 
WorldCreated: 20//04/2023
Version: 1.0*/

import java.util.*;

public class RegistryApp
{
    public static void main(String[] args)
    {
    // Create the registry object
        Registry Registry = new Registry();
    // Create  interface
        RegistryCLI RegistryCLI = new RegistryCLI(Registry);
    // Display the menu
        RegistryCLI.menu(); //next time make sure Menu and menu are the same
    }
}
