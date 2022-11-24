package com.cc.java;

public class Cat {
 
   private String name;
   private String furColor;
   private int age;
   private int level;
   private boolean isFemale;

    public Cat( String name, String furColor, int age, boolean isFemale ) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
	}

    public String getStringAttributes( String flag ) {                                  // zusammengefasster getter
        switch ( flag ) {
            case "#name":
                return name;
            case "#furColor":
                return furColor;
            case "#age":
                return String.valueOf( age );
            case "#age2":
                return checkEscaltionLevel();
            default:
                return "Error";
        }
    }
    public String getAge() {                                                            // age als String Ausgabe
        if ( !isFemale ) {
            return Integer.toString( age ); 
        } else {
            return checkEscaltionLevel();
        }
    }
    public int getAge2() { return age; }                                                // age als int Ausgabe

    public void setName( String name ) { this.name = name; }                            // setter
    public void setFurColor( String furColor ) { this.furColor = furColor; }            // setter
    public void setAge( int age ) { this.age = age; }                                   // setter

    public String checkEscaltionLevel() {
        level++;
        switch ( level ) {
            case 1:
                return "DARE to ask";
            case 2:
                return "Really?";
            case 3:
                return "Seriously?";
            default:
                return "Some peolples never learn to be decent";
        }
    }
}
