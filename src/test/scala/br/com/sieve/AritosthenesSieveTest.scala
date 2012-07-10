package br.com.sieve

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class AritosthenesSieveTest extends WordSpec
    with ShouldMatchers {

  "Aritosthenes Sieve" should {
    "throw a IllegalArgumentExceptio if the maxValue is negative" in {
      intercept[IllegalArgumentException] {
        AritosthenesSieve.primesUntil(-1)
      }
    }
    "return primes numbers until 10" in {
      val expectedResult = Seq(2, 3, 5, 7)
      val primes = AritosthenesSieve.primesUntil(10)

      primes should equal (expectedResult)
    }
    
    "return an empty seq when the sequence is less then 2" in {
      val expectedResult = Seq()
      val primes:Seq[Int] = AritosthenesSieve.primesUntil(1)
      
      primes should equal (expectedResult)
    }
  }
}
