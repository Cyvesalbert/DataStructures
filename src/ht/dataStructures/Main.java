package ht.dataStructures;

//Toute modification a ce fichier ne sera pas comptabilisÃ©e
public class Main {

 // Le main fait simplement tester votre logique pour les deux exercices

 public static void main(String[] args) {
     System.out.println("Debut des tests du TP3");
     TestBinary testBinary = new TestBinary();
     testBinary.test();
     
     // TestCompany testCompany = new TestCompany();
     // testCompany.test();
     
     
     
     //Sak anba yo pa ladann
     //Testing by Virlus Jeanty
     
     BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
     t.insert(5);
     t.insert(20);
     t.insert(1);
     t.insert(50);
     t.insert(7);
     t.insert(8);      
     System.out.println();
     
     System.out.println(t.toStringInOrder());
     System.out.println();
     System.out.println(t.contains(21));
     System.out.println(t.contains(20));
     System.out.println(t.getHeight());
     System.out.println(t.height());

     
     
     
 

   
 }
}

