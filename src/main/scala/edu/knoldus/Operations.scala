package edu.knoldus

object Operations {

  def collatzNumber(listOfNumber: List[Int], num: Int): List[Int] = {

    def findCollatzNumber(currentNum: Int): List[Int] = {

      def findNumber(inputList: List[Int]): Boolean = {

        inputList match {
          case Nil => false
          case head :: _ if head == currentNum => true
          case _ :: tail => findNumber(tail)
        }

      }

      if (findNumber(listOfNumber)) {
        num :: listOfNumber
      }
      else if (currentNum == 1) {
        num :: listOfNumber
      }
      else {
        currentNum % 2 match {
          case 0 => findCollatzNumber(currentNum / 2)
          case _ => findCollatzNumber(((3 * currentNum) + 1) / 2)
        }
      }


    }

    findCollatzNumber(num)

  }
}
