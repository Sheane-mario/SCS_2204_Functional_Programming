case class Product(name: String, quantity: Int, price: Double)

object InventorySystem {
  import scala.collection.mutable

  // Define mutable Maps to hold the product inventories
  var inventory1: mutable.Map[String, Product] = mutable.Map()
  var inventory2: mutable.Map[String, Product] = mutable.Map()

  // Function to retrieve all product names from inventory1
  def getAllProductNames(inventory: mutable.Map[String, Product]): List[String] = {
    inventory.values.map(_.name).toList
  }

  // Function to calculate the total value of all products in inventory1
  def calculateTotalValue(inventory: mutable.Map[String, Product]): Double = {
    inventory.values.map(product => product.quantity * product.price).sum
  }

  // Function to check if inventory1 is empty
  def isInventoryEmpty(inventory: mutable.Map[String, Product]): Boolean = {
    inventory.isEmpty
  }

  // Function to merge inventory1 and inventory2
  def mergeInventories(inventory1: mutable.Map[String, Product], inventory2: mutable.Map[String, Product]): Unit = {
    for ((id, newProduct) <- inventory2) {
      inventory1.get(id) match {
        case Some(existingProduct) =>
          val updatedProduct = existingProduct.copy(
            quantity = existingProduct.quantity + newProduct.quantity,
            price = math.max(existingProduct.price, newProduct.price)
          )
          inventory1.update(id, updatedProduct)
        case None =>
          inventory1.update(id, newProduct)
      }
    }
  }

  // Function to check if a product with a specific ID exists and print its details
  def checkProductById(inventory: mutable.Map[String, Product], id: String): Unit = {
    inventory.get(id) match {
      case Some(product) => println(s"Product found: $product")
      case None => println(s"No product found with ID: $id")
    }
  }

  // Main method for testing
  def main(args: Array[String]): Unit = {
    // Add some products to inventory1
    inventory1.update("101", Product("Laptop", 10, 1500.0))
    inventory1.update("102", Product("Smartphone", 20, 800.0))
    inventory1.update("103", Product("Tablet", 15, 600.0))

    // Add some products to inventory2
    inventory2.update("102", Product("Smartphone", 5, 850.0))
    inventory2.update("104", Product("Monitor", 8, 300.0))

    // I. Retrieve all product names from inventory1
    println("Product Names in Inventory1: " + getAllProductNames(inventory1).mkString(", "))

    // II. Calculate the total value of all products in inventory1
    println("Total Value in Inventory1: " + calculateTotalValue(inventory1))

    // III. Check if inventory1 is empty
    println("Is Inventory1 empty? " + isInventoryEmpty(inventory1))

    // IV. Merge inventory1 and inventory2
    mergeInventories(inventory1, inventory2)
    println("Inventory1 after merge: " + inventory1.values.mkString(", "))

    // V. Check if product with ID 102 exists in inventory1 and print its details
    checkProductById(inventory1, "102")
  }
}

