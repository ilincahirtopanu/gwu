/*
Ilinca Hirtopanu
This class represents a TreeMap data structure that implements the Map interface.
*/

//importing necessary java packages
import java.util.List;       
import java.util.ArrayList;

public class TreeMap implements Map {
  
    //the root variable holds the top-most node of the TreeMap hierarchy
    private TreeNode root;

    //the rebalance variable is a boolean that indicates whether the TreeMap should be rebalanced
    private boolean rebalance;

    //constructor to initializes TreeMap instance
    public TreeMap(boolean rebalance) {
        this.root = null;
        this.rebalance = rebalance;
    }

    /* this method sets the value of the key-value pair associated with the specified key
    if the key already exists, its value is updated, else a new TreeNode object is created
    and added to the TreeMap.
    it also updates the 'profile' array with the number of iterations required to find the
    key in the TreeMap. */
    
    public void set(String key, String value, int[] profile) {

	//if the TreeMap is empty, create a new root node with the specified key-value pair
	if (root == null) {
	    //creates "root" as a new node in the treemap - assigning it a KVP
	    root = new TreeNode(key, value);

	    
	}
	//else, search for the key in the TreeMap
	else {
	    set(key, value, root, profile);
	}
    }
 
    /* a recursive method that searches for the specified key in the TreeMap.
    if the key is found, the method updates its value and balances the TreeMap.
    if not, the method creates a new node with the specified key-value pair. */
    private void set(String key, String value, TreeNode it, int[] profile) {

	//if the specified key is already present in the TreeMap, update its value and balance the TreeMap
	if (key.equals(it.getKey())) {
	    profile[0] += 1;
	    it.updateValue(value);
	    balance();
	}

        //if the specified key is less than the root node's key, search in the left subtree
	else if (key.compareTo(it.getKey()) < 0) {
	    
	    profile[0] += 1;
            //if the left child of the root node is null, create a new node with
	    //the specified keyvalue pair
	    if(it.left == null){
		it.left = new TreeNode(key, value);
	    }

	    //else, continue searching recursively in the left subtree
	    else {
		set(key, value, it.left, profile);
	    }
	}

	//if the specified key is greater than the root node's key, search in the right subtree
	else {
	    profile[0] += 1;

	    //if the right child of the root node is null, create a new node with the specified key-value pair
	    if(it.right == null){
		it.right = new TreeNode(key, value);
	    }

	    //else, continue searching recursively in the right subtree
	    else {
		set(key, value, it.right, profile);
	    }
	}
		        
    }
  
  
    // this method retrieves the value associated with the given key and profile array
    // if the key does not exist in the tree it returns null
    public String get(String key, int[] profile) {

	// if the tree is empty, there are no values to retrieve
	if (root == null) {
	    return null;
	}

	// recursively search the tree for the key and return the value if found
	return get(key, root, profile);
    
    }

    //this is a helper method to recursively search the tree for the given key.
    private String get( String key, TreeNode it, int[] profile) {
	
	//if  we have reached a null node, the key does not exist in the tree
	if (it == null) {
	    return null;
	}
	
	// compare the key to the current node's key
	int compare = key.compareTo(it.getKey());

	// if the keys match, increment the profile and return the value associated with the key
	if (compare == 0) {
	    profile[0] += 1;
	    return it.getValue();
	}
	
	//if the key is less than the current node's key, search the left subtree recursively
	else if (compare < 0) {
	    profile[0] += 1;
	    return get(key, it.left, profile);
	}

	//if the key is greater than the current node's key, search the right subtree recursively
	else {
	    profile[0] += 1;
	    return get(key, it.right, profile);
	}
	

    } 
  
    //clears the entire tree, removing all nodes and values.
    public void clear() {
        // set the root to null, disconnecting it from the rest of the tree
        root = null;
    }
  
  
    //----------------------------------------------------------------------
    // Utilities
    //----------------------------------------------------------------------
    /// The entry point for balancing this tree to maintain optimal insert 
    /// and search efficiency
    /// Note: This algorithm focuses on correctness and is not the most 
    /// efficient algorithm available. Please look up different algorithms 
    /// that solve the balancing problem.
    private void balance() {
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        //Sorts tree from given root
        populate(root, nodes);
        //Return null if root has no children
        if(nodes.size() == 0) return;
  
        this.root = balance(nodes, 0, nodes.size() - 1);
    }
 
    /// Recursive helper in the balancing operation to support balance.
    /// @param nodes a list of nodes
    /// @param start the start index within the list
    /// @param end the end index within the list
    /// @return the local root after balancing is performed on the subtree
    private TreeNode balance(List<TreeNode> nodes, int start, int end) {
        int mid = (start + end) / 2;
        TreeNode node = nodes.get(mid);
        if(start == end){
            node.left = null;
            node.right = null;
            return node;
        }
        //Recursively balance tree on left and right children using
        //middle node as root
        if(!(mid - 1 < start)) {
            node.left = balance(nodes, start, mid - 1);
        } else {
            node.left = null;
        }
  
        if(!(mid + 1 > end)) {
            node.right = balance(nodes, mid + 1, end);
        } else {
            node.right = null;
        }
  
        return node;
    }
 
    /// Recursive helper in the balancing operation to put listitems into
    /// the tree
    /// @param the root of the subtree to balance
    /// @param the list of nodes to balance
    private void populate(TreeNode node, List<TreeNode> list) {
        if(node == null) return;
        populate(node.left, list);
        list.add(node);
        populate(node.right, list);
    }
}
