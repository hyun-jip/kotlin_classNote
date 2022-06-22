// 1. 변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않은 경우에는 false가 되는 변수 c를 선언한다
//   단 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안된다

var A: Int = 3
var B: Int = 4

var C : Boolean = A == B
println(C)
// ** 자료형이 다르면 비교연산자를 사용할 수 없다.

// 2. 정수형 변수 A를 선언하고, 변수 B를 선언 한다 이때 변수 B는 A의 두배가 되어야 한다
var A: Int = 3

var B: Int = 2*A

println(B)

//3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오
//   (90점 이상 A학점, 80~89점은 B학점, 70~79점은 C학점, 그렇지 않으면 F학점)

fun scorer(score: Int): Char{
if (score >= 90) return 'A'
else if (score >= 80) return 'B'
else if (score >= 70) return 'C'
else return 'F'}

var scoreResult : Int = scorer(85)
println(scoreResult)

//4. 학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수(정수)를 반환하는 함수를 만드시오
//(시험 문제는 총 20문제이고 만점은 100점)

fun counter(answer: Int) : Int {
    return answer * 5
}
var counterResult : Int = counter(16)
println(counterResult)

//5. nullable 정수형 두개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다
//이때 인수중에 null 이 있으면 0으로 취급하여 합을 구한다

fun adder(A: Int?, B: Int?) : Int?{
    // 함수에서 받은 인자는 val 이다.
//    if(A == null) return  B
//    if(B == null) return  A
//    return  A + B
    val first: Int? = if(A == null) 0 else A
    val second: Int? = if(B == null) 0 else B
    return first + second
}

var resultA = adder(10, 4)
var resultB = adder(200, null)

println(resultA)
println(resultB)