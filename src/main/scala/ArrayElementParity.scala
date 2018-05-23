object ArrayElementParity {

  def uniqueNum(list: List[Int]): Int = {
    list.filterNot({
      x => list.contains(-x)
    }).head
  }
}