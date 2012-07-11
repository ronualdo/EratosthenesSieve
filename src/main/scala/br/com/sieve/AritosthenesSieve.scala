package br.com.sieve

object AritosthenesSieve {
  
  def primesUntil(maxValue: Int) = {
    val absoluteMaxValue = maxValue.abs
    val primes = sieve((2 until absoluteMaxValue).toList)

    if (maxValue < 0) primes.map(-1*_) else primes
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
