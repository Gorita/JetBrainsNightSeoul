package kotlintip

import kotlin.properties.ReadOnlyProperty



interface Repository {
    fun getAll()
}

private fun SomeFunction(): ReadOnlyProperty<Controller, String> {
    throw Exception()
}

class Controller(repository: Repository): Repository by repository {

    val myString: String by SomeFunction()



    fun getIndex() {
        getAll()
    }
}

//  vetoable 참일때만 패스
//  custom deleaget, kotlin.get and set


// ::func

//  infix notation    가로 없이 사용가능
//  inline function 이 복사 붙여넣기 되어지는.
//  퍼포먼스 이슈가 없을때에도 왜 inline을 쓸까
//  inline reified > 런타입시점에서 ...

//  anonymous function일경우 라벨이 필요없다.

typealias CustomerName = String
typealias BifunctionHandler = (Int, Int) -> Int

fun CustomerName.isPossible22() {

}
//  deprecated > replaceWith
//  typealias AWsomeCustomer = Customer

fun funcTest(name: CustomerName){

}


fun main(args: Array<String>) {
    funcTest("하하하")
}