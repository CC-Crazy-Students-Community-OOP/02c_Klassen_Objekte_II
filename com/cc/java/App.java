package com.cc.java;

public class App {
    
    public static void main( String[] args ) {
    
        // Cat cat = new Cat( "Rose", "white", 4, true );
        //     output( cat.getStringAttributes( "#name" ) );
        //     output( cat.getStringAttributes( "#furColor" ) );
        //     output( cat.getStringAttributes( "#age2" ) );                                   // getter Ausgabe aus der Kombination mit flag
        //     output( "------------------------" );

        // Cat cat1 = new Cat( "Beaty", "black", 7, true );
        //     output( cat1.getStringAttributes( "#name" ) );
        //     output( cat1.getStringAttributes( "#furColor" ) );
        //     output( String.valueOf( cat1.getAge() ) );                                          // getter Ausgabe des int age
        //     output( "------------------------" );

        // Cat cat2 = new Cat( "Steve", "grey", 9, false );
        //     output( cat2.getStringAttributes( "#name" ) );
        //     output( cat2.getStringAttributes( "#furColor" ) );
        //     output( cat2.getAge() );                                                            // getter Ausgabe des String age
        //     output( "------------------------" );

        // Cat cat3 = new Cat( "Robi", "red", 2, false );
        //     cat3.setFurColor( "striped" );
        //     output( cat3.getStringAttributes( "#name" ) );
        //     output( cat3.getStringAttributes( "#furColor" ) );
        //     output( cat3.getAge() );
        //     output( "------------------------" );

        Cat cat4 = new Cat( "Lilly", "brown", 5, true );
            output( cat4.getStringAttributes( "#name" ) );
            output( cat4.getStringAttributes( "#furColor" ) );
            output( cat4.getAge() );
            output( cat4.getAge() );
            output( cat4.getAge() );
            output( cat4.getAge() );
            output( "------------------------" );
    }

    // Methode wird aus der KLASSE aufgerufen, daher static
        public static void output( String outputStr ) { System.out.println( outputStr ); }
}

