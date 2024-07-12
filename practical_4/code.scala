object InventoryManagementSystem {
  // Initialize arrays for item names and quantities
  val itemNames = Array("Apples", "Bananas", "Oranges")
  val itemQuantities = Array(10, 20, 15)

  def main(args: Array[String]): Unit = {
    // Display the initial inventory
    displayInventory()
    
    // Restock an item
    restockItem("Bananas", 10)
    displayInventory()
    
    // Sell an item
    sellItem("Apples", 5)
    displayInventory()
    
    // Try to sell an item that doesn't exist
    sellItem("Grapes", 5)
    
    // Try to sell more than available quantity
    sellItem("Oranges", 20)
  }

  // Function to display the inventory
  def displayInventory(): Unit = {
    println("Current Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  // Function to restock an item
  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity of $itemName.")
    } else {
      println(s"Item $itemName does not exist in the inventory.")
    }
  }

  // Function to sell an item
  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity of $itemName.")
      } else {
        println(s"Not enough quantity of $itemName to sell $quantity units.")
      }
    } else {
      println(s"Item $itemName does not exist in the inventory.")
    }
  }
}

