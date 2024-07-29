import scala.io.StdIn._

object StudentRecords {

  // Function to validate user input
  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (marks < 0 || totalMarks < 0) {
      (false, Some("Marks and total possible marks must be positive integers."))
    } else if (marks > totalMarks) {
      (false, Some("Marks cannot exceed total possible marks."))
    } else {
      (true, None)
    }
  }

  // Function to calculate percentage and grade
  def calculateGrade(marks: Int, totalMarks: Int): (Double, Char) = {
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }
    (percentage, grade)
  }

  // Function to get student information
  def getStudentInfo: (String, Int, Int, Double, Char) = {
    println("Enter student name:")
    val name = readLine()

    println("Enter marks obtained:")
    val marks = readInt()

    println("Enter total possible marks:")
    val totalMarks = readInt()

    val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
    if (!isValid) {
      throw new IllegalArgumentException(errorMessage.getOrElse("Invalid input"))
    }

    val (percentage, grade) = calculateGrade(marks, totalMarks)
    (name, marks, totalMarks, percentage, grade)
  }

  // Function to print student record
  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  // Function to get student information with retry on invalid input
  def getStudentInfoWithRetry: (String, Int, Int, Double, Char) = {
    var validData = false
    var studentInfo: (String, Int, Int, Double, Char) = null

    while (!validData) {
      try {
        studentInfo = getStudentInfo
        validData = true
      } catch {
        case e: IllegalArgumentException => println(e.getMessage)
      }
    }

    studentInfo
  }

  // Main method to test the functions
  def main(args: Array[String]): Unit = {
    val studentRecord = getStudentInfoWithRetry
    printStudentRecord(studentRecord)
  }
}

