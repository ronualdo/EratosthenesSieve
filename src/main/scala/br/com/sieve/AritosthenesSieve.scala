package br.com.sieve

object AritosthenesSieve {
  
  def primesUntil(maxValue: Int) = {
    if (maxValue < 0)
      throw new IllegalArgumentException("negatice number not allowed")

    sieve((2 until maxValue).toList)
  }

  private def sieve(numbers: Traversable[Int]): Seq[Int] = {
    if (numbers.isEmpty || numbers.tail == Nil) {
      numbers.toSeq
    } else {
      numbers.head +: sieve(removeMultiples(numbers.head, numbers.tail))
    }
  }

  private def removeMultiples(number: Int, numbers: Traversable[Int]) = {
    numbers.filter( _ % number != 0)
  }
}
