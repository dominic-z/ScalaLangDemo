package collections

import org.junit.Test

/**
 * @author dominiczhu
 * @date 2020/11/24 下午12:32
 *//**
 *
 * @title: Mutable
 * @Author Tan
 * @Date: 2020/11/24 下午12:32
 * @Version 1.0
 */
class Mutable {
  case class Case(name:String,age:Int)
  @Test
  def testSet():Unit={
    val s=Set(Case("a",2))
    println(s)
  }
}
