import java.util

import com.example.tutorial.AddressBookProtos
import com.google.protobuf.{ByteString, Timestamp}
import gdt.warehouse.DwTableRecordProtos
import gdt.warehouse.worker.process.dmp_rta_service.DMPRTAAudienceInfoProtos
import org.junit.Test

import scala.collection.mutable

/**
 * @author dominiczhu
 * @date 2020/11/24 下午3:11
 *//**
 *
 * @title: PBDemo
 * @Author Tan
 * @Date: 2020/11/24 下午3:11
 * @Version 1.0
 */
class PBDemo {

    @Test
    def constructMessage():Unit={
      val personBuilder=AddressBookProtos.Person.newBuilder()
      personBuilder.setName("name1")
      personBuilder.setId(1)
      personBuilder.setLastUpdated(Timestamp.newBuilder().setSeconds(123).build())


      val addressBookBuilder=AddressBookProtos.AddressBook.newBuilder()
      val persons=new util.ArrayList[AddressBookProtos.Person]()
      persons.add(personBuilder.build())
      personBuilder.setName("name2")
      personBuilder.setId(2)
      persons.add(personBuilder.build())

      addressBookBuilder.addAllPeople(persons)
      println(addressBookBuilder.build())
    }
}
