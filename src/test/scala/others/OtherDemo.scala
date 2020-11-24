package others

import org.junit.Test
import collection.mutable
/**
 * @author dominiczhu
 * @date 2020/11/17 下午8:17
 */
class OtherDemo {

  @Test
  def demo1(): Unit ={
    val s="a,b,c,a,c"
    println(Set(s.split(",")))
  }
}
