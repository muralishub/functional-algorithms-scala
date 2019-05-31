package foundation
import scala.collection.immutable

object ListsOverview extends App{

  val eng1 = Engineer("Isaac", "Newton", "IT", 4500.50, "Engineering")

  val eng2 = Engineer("Albert", "Einstein", "Infra", 4600.50, "Engineering")


  val doc1 = Doctor("Michael","Young","Cardio", 5000.5,"Medicine")

  val doc2 = Doctor("Jeffrey","Hall","Pathology", 5100.5,"Medicine")


  val engineers = List(eng1, eng2)

  val doctors = List(doc1, doc2)


  val employees: immutable.Seq[Employee] = engineers ::: doctors

  val emp2: immutable.Seq[List[Employee]] = List(engineers, doctors)

  val f: immutable.Seq[Employee] = emp2.flatten


  val r = emp2.exists(x => x == engineers)

  val list = List("apple", "cow", "color", "god", "goat", "dog", "house", "mother", "orange", "rat", "zeal", "university")

 // val result =  list.

  //result.foreach(println)



}



abstract class Employee(firstName: String, lastName: String, department: String, salary: Double)

case class Engineer(firstName: String, lastName: String, department: String, salary: Double, group: String) extends Employee(firstName: String, lastName: String, department: String, salary: Double)
case class Doctor(firstName: String, lastName: String, department: String, salary: Double, group: String) extends Employee(firstName: String, lastName: String, department: String, salary: Double)