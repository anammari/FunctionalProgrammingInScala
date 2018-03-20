package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      
      if (c == 0 || c == r) 1
      else pascal(c-1,r-1) + pascal(c,r-1)
      
    }
    
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      var bal: Int = 0
      def checkBalance(chars: List[Char]): Boolean = {
        if (bal < 0) {false}
        else if (chars.isEmpty) {
          if (bal == 0) {true}
          else false
        }
        else {
          val elem = chars.head
          if (elem == '(') {bal = bal + 1}
          else if (elem == ')') {bal = bal - 1}
          checkBalance(chars.tail)
        }
      }
      checkBalance(chars)
      }
    
  /**
   * Exercise 3
   */
		def countChange(money: Int, coins: List[Int]): Int = {
		  if(money == 0)
		    1
		  else if(money > 0 && !coins.isEmpty)
		    countChange(money - coins.head, coins) + countChange(money, coins.tail)
		  else
		    0
		}
    }
      
