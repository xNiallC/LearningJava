import java.util.HashMap;

class Library {
  public Library() {

      }

  public void getFinishedBooks(HashMap<String, Boolean> library) { 
      if(library.size() < 1) {
      	System.out.println("Your library is empty.");
      }
      else {
      	System.out.println("You have completed:");
      	for(String completed : library.keySet()) {
      		if(library.get(completed) == true) {
      			System.out.println(completed);
      		}
      	}
      }
    }
  public void getUnfinishedBooks(HashMap<String, Boolean> library) {
  	System.out.println("You have not completed:");
  	for(String uncompleted : library.keySet()) {
  		if(library.get(uncompleted) == false) {
  			System.out.println(uncompleted);
  		}
  	}
  }

public static void main(String[] args) {
	HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
	myBooks.put("Road Down the Tunnel", true);
	myBooks.put("Rat: A Biology", false);
	Library myLibrary = new Library();
	myLibrary.getFinishedBooks(myBooks);
	myLibrary.getUnfinishedBooks(myBooks);
    }
}
