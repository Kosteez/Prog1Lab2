    String myBigString = "\nHello everybody, today is THursday, "
        +"and we are having fun! ";


    System.out.println(myBigString);


    System.out.println("The first index of 'o' is " + myBigString.indexOf("o"));


    System.out.println("The first index of TRIMMED 'o' is " + (myBigString.trim()).indexOf("o"));
   
    System.out.println("The last index of 'y' is " + myBigString.lastIndexOf("y"));


    System.out.println("The substring of bigString from 2 to the end is " + myBigString.substring(3,5));


    }
}