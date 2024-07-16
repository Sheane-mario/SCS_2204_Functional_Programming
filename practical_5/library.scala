import scala.collection.mutable

object library {
  case class Book(title: String, author: String, isbn: String)

  // initialize a mutable set to hold the book collection
  var bookCollection: mutable.Set[Book] = mutable.Set()

  // add Book to the collection
  def addBook(book: Book): Unit = {
    if (bookCollection.add(book)) {
      println(s"Book ${book.title} by ${book.author} added to the collection")
    } else {
      println(s"Book ${book.title} is already exits in the collection")
    }
  }
  
  // remove book from the collection
  def removeBook(isbn: String): Unit = {
    val bookToRemove = bookCollection.find(book => book.isbn == isbn)
    bookToRemove match {
      case Some(book) => 
        bookCollection.remove(book)
        println(s"Book ${bookToRemove} is removed!")
      case None =>
        println(s"No book found")
    }
  } 

  // check whether book contains
  def containsBook(isbn: String): Unit = {
    val bookToRemove = bookCollection.find(book => book.isbn == isbn)
    bookToRemove match {
      case Some(book) => 
        println(s"Book ${book.title} contains")
      case None =>
        println(s"No books found")
    }
  }

  def displayBooks(): Unit = {
      if (bookCollection.isEmpty) {
        println("The book collection is empty.")
      } else {
        println("Book Collection:")
        bookCollection.foreach(book => println(s"${book.title} by ${book.author}, ISBN: ${book.isbn}"))
      }
    }

  def main(args: Array[String]): Unit = {
    
  // Create some book instances
      val book1 = Book("1984", "George Orwell", "978-0451524935")
      val book2 = Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084")
      val book3 = Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565")

      // Add books to the collection
      addBook(book1)
      addBook(book2)
      addBook(book3)
      
      // Display books in the collection
      displayBooks()

      // Check if a book is in the collection
      println(s"Contains '1984': ${containsBook("978-0451524935")}")

      // Remove a book from the collection by ISBN
      removeBook("978-0061120084")
      
      // Display books after removal
      displayBooks()
  }
}
