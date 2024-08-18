package ht.dataStructures;

import java.util.List;

public class BinaryNode<T extends Comparable<? super T> > {
  
	private T data;
    private BinaryNode<T> right;
    private BinaryNode<T> left;
    
    
    
 // TODO: initialisation
    // O(1)
    public BinaryNode(T data, BinaryNode<T> right, BinaryNode<T> left) {
		super();
		this.data = data;
		this.right = right;
		this.left = left;
	}

	public BinaryNode(T item) {
		// TODO Auto-generated constructor 
        data = item;
	}
    
    
    
    
    // Getters and setters
    

    // TODO: on retourne la donnee voulue
    // O(1)
    public T getData() {
  		return data;
  	}

  	public void setData(T data) {
  		this.data = data;
  	}

  	public BinaryNode<T> getRight() {
  		return right;
  	}

  	public void setRight(BinaryNode<T> right) {
  		this.right = right;
  	}

  	public BinaryNode<T> getLeft() {
  		return left;
  	}
  	public void setLeft(BinaryNode<T> left) {
  		this.left = left;
  	}
  	
	
    
    public String toString( )
    {   
        if( this.getData() != null )
          return this.getData().toString();
        else
        	return "";
        
    }
}

