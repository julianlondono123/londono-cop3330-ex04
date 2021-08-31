import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter a noun:" );
        String noun = input.nextLine();
        System.out.println( "Enter a verb:" );
        String verb = input.nextLine();
        System.out.println( "Enter a adjective:" );
        String adjective = input.nextLine();
        System.out.println( "Enter a adverb:" );
        String adverb = input.nextLine();

        System.out.println("Do you " + verb + " your " + noun + " " + adverb + " ? " + " That's hilarious! ");

    }
}
