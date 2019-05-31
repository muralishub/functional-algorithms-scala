package foundation

object PrimeNumbers extends App {
  val primes: Stream[Int] = 2 #:: Stream.from(3)
    .filter {
      x => {
        val sqrtOfPrimes = primes.takeWhile(y => y <= math.sqrt(x))
        !sqrtOfPrimes.exists(y => x % y == 0)
      }
    }
  primes.take(5).foreach(println)
}


