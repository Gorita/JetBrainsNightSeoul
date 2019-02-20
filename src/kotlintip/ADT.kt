package kotlintip
sealed class Result

class Success(val s: String): Result()
class Failure(val i: Int): Result()

//  when expression 일때 체크가 된다
//  if else 에서 Int, Unit > Nothing 으로 하면 컴파일 워닝이 사라진다
//