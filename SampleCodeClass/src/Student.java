/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Testing */
public class Student {
    String name;
    
    int RE;
    int SDA;
    int SQAT;
    int SEAM;
    int FM;
   
    double getAverageMark()
    {
        return (RE+SDA+SQAT+SEAM+FM)/4;
    }

  
    int getTotal()
    {
        return (RE+SDA+SQAT+SEAM+FM);
    }
    
    void testDisplay()
    {
        System.out.println("Testing...");

    }

<<<<<<< HEAD
    void myTest()
    { 
	System.out.println("First change"); 
	System.out.println("Revert this");
    }
=======
    void myTest();
>>>>>>> parent of 62685d4 (Update Student.java)
   
    void testAll()
 {
     System.out.println("Hello");
     return;
}

}
