package ht.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BinarySearchTree<T extends Comparable<? super T> > {

    BinaryNode<T> root;
    List<T>array = new ArrayList<T>();
   
    // TODO: initialisation
	public BinarySearchTree( )
    {
        setRoot(null);
    }
	
	// Getters and Setters
    public BinaryNode<T> getRoot() {
		return root;
	}
	public void setRoot(BinaryNode<T> root) {
		this.root = root;
	}
	public List<T> getArray() {
		return array;
	}
	public void setArray(List<T> array) {
		this.array = array;
	}
	public BinarySearchTree(T item) {
        root = new BinaryNode<T>(item);
    }
    
    // TODO: on insere un nouvel item a partir de la racine
    // O(log(n))
    public void insert( T x ) {
        root = insert( x, root );
    }
    
	// TODO: on ajoute une nouvelle donnee au bon endroit
    // O(log(n))
    private BinaryNode<T> insert( T x, BinaryNode<T> t )
    {
        if( t == null ) // insert new node
            return new BinaryNode<>( x, null, null );
        
        int compareResult = x.compareTo( t.getData() );
            
        if (compareResult < 0 )
            t.setLeft(insert( x, t.getLeft() ));
        else if( compareResult > 0 )
            t.setRight(insert( x, t.getRight() ));

        return t;
    }
    
    // TODO: placer dans une liste les items de l'arbre en ordre
    // O(n)
    public List<T> getItemsInOrder() {
    	
    	if( isEmpty( ) ) {
            System.out.println( "Empty tree" );
    	return null;
    	}
    	
        else
        	return getItemsInOrder( root );
		
    }
    
    private List<T> getItemsInOrder(BinaryNode<T> t) {
		// TODO Auto-generated method stub
    	if( t != null )
        {
    		getItemsInOrder( t.getLeft() );
            array.add( t.getData() );
            getItemsInOrder( t.getRight() );
            return array;
        }
    	else
    	return null;
	}
    
	// TODO: retourner la liste d'item en String selon le bon format
    // O(n)
    public String toStringInOrder() {
    	String n = "";
    	 for (T i : this.getItemsInOrder()) {
            n = n + i + " ";
         }
        return  n ;
    }

    // TODO: est-ce qu'un item fais partie de l'arbre
    // O(log(n))
    public boolean contains( T x )
    {
        return contains( x, root );
    }
    private boolean contains( T x, BinaryNode<T> t )
    {
        if( t == null )
            return false;
            
        int compareResult = x.compareTo( t.getData() );
            
        if( compareResult < 0 )
            return contains( x, t.getLeft());
        else if( compareResult > 0 )
            return contains( x, t.getRight());
        else
            return true;    // Match
    } 

    // TODO: trouver la hauteur de l'arbre
    // O(n)
    public int height()
    {
    	return height(root); 
    }
    public int height( BinaryNode<T> t )
    {
        if( t == null )
            return -1;
        else
            return 1 + Math.max( height( t.getLeft() ), height( t.getRight() ) ); 
    }
    
    
    // TODO: on retourne la maximale de l'arbre
    // O(n)
    public T getHeight() {
    	if( isEmpty()) {return null;}
    	else
        return getHeight( root ).getData();
    	
    }
    private BinaryNode<T> getHeight( BinaryNode<T> t )
    {
        if( t != null )
            while( t.getRight() != null )
                t = t.getRight();

        return t;
    }

    private void printTree( BinaryNode<T> t )
    {
        if( t != null )
        {
            printTree( t.getLeft() );
            System.out.println( t.getData() );
            printTree( t.getRight() );
        }
    }

	 public void printTree( )
    {
        if( isEmpty( ) )
            System.out.println( "Empty tree" );
        else
            printTree( root );
    }

	 public boolean isEmpty( )
    {
        return root == null;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BinarySearchTree<T extends Comparable<? super T> > {

    BinaryNode<T> root;
    List<T>array = new ArrayList<T>();
   
    // TODO: initialisation
	public BinarySearchTree( )
    {
        setRoot(null);
    }
	
	// Getters and Setters
    public BinaryNode<T> getRoot() {
		return root;
	}
	public void setRoot(BinaryNode<T> root) {
		this.root = root;
	}
	public List<T> getArray() {
		return array;
	}
	public void setArray(List<T> array) {
		this.array = array;
	}
	public BinarySearchTree(T item) {
        root = new BinaryNode<T>(item);
    }
    
    // TODO: on insere un nouvel item a partir de la racine
    // O(log(n))
    public void insert( T x ) {
        root = insert( x, root );
    }
    
	// TODO: on ajoute une nouvelle donnee au bon endroit
    // O(log(n))
    private BinaryNode<T> insert( T x, BinaryNode<T> t )
    {
        if( t == null ) // insert new node
            return new BinaryNode<>( x, null, null );
        
        int compareResult = x.compareTo( t.getData() );
            
        if (compareResult < 0 )
            t.setLeft(insert( x, t.getLeft() ));
        else if( compareResult > 0 )
            t.setRight(insert( x, t.getRight() ));

        return t;
    }
    
    // TODO: placer dans une liste les items de l'arbre en ordre
    // O(n)
    public List<T> getItemsInOrder() {
    	
    	if( isEmpty( ) ) {
            System.out.println( "Empty tree" );
    	return null;
    	}
    	
        else
        	return getItemsInOrder( root );
		
    }
    
    private List<T> getItemsInOrder(BinaryNode<T> t) {
		// TODO Auto-generated method stub
    	if( t != null )
        {
    		getItemsInOrder( t.getLeft() );
            array.add( t.getData() );
            getItemsInOrder( t.getRight() );
            return array;
        }
    	else
    	return null;
	}
    
	// TODO: retourner la liste d'item en String selon le bon format
    // O(n)
    public String toStringInOrder() {
    	String n = "";
    	 for (T i : this.getItemsInOrder()) {
            n = n + i + " ";
         }
        return  n ;
    }

    // TODO: est-ce qu'un item fais partie de l'arbre
    // O(log(n))
    public boolean contains( T x )
    {
        return contains( x, root );
    }
    private boolean contains( T x, BinaryNode<T> t )
    {
        if( t == null )
            return false;
            
        int compareResult = x.compareTo( t.getData() );
            
        if( compareResult < 0 )
            return contains( x, t.getLeft());
        else if( compareResult > 0 )
            return contains( x, t.getRight());
        else
            return true;    // Match
    } 

    // TODO: trouver la hauteur de l'arbre
    // O(n)
    public int height()
    {
    	return height(root); 
    }
    public int height( BinaryNode<T> t )
    {
        if( t == null )
            return -1;
        else
            return 1 + Math.max( height( t.getLeft() ), height( t.getRight() ) ); 
    }
    
    
    // TODO: on retourne la maximale de l'arbre
    // O(n)
    public T getHeight() {
    	if( isEmpty()) {return null;}
    	else
        return getHeight( root ).getData();
    	
    }
    private BinaryNode<T> getHeight( BinaryNode<T> t )
    {
        if( t != null )
            while( t.getRight() != null )
                t = t.getRight();

        return t;
    }

    private void printTree( BinaryNode<T> t )
    {
        if( t != null )
        {
            printTree( t.getLeft() );
            System.out.println( t.getData() );
            printTree( t.getRight() );
        }
    }

	 public void printTree( )
    {
        if( isEmpty( ) )
            System.out.println( "Empty tree" );
        else
            printTree( root );
    }

	 public boolean isEmpty( )
    {
        return root == null;
    }
}

