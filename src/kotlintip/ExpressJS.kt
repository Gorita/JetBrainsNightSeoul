package kotlintip

class HttpRequest(val accept: String, val length: Int)
class HttpResponse(var content: String, var statusCode: Int)
//  스탭 1. Handler class 만들기
//  스탭 2. Handler.() > handler의 extension function
//  invoke  를 통해 한번더 extension
fun get(path: String, handler: (HttpRequest, HttpResponse) -> Unit) {

}


fun main(args: Array<String>) {

}