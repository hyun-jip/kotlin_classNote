import kotlin.contracts.contract

//계산기1
//- 사칙연산에 대응하는 4개의 함수 구현
//        - 연산이 한번 이루어 질 때 마다 출력을 해야 한다
//(사칙 연산에 대응하는 4개의 함수에서 출력을 하면 안된다)
//

//class Calculator{
//    var result : Int = 0
//        set(value){
//            field = value
//            println("중간 계산 값: " + field)
//        }
//
//
//    fun sum(inputNumber: Int) {
//        result += inputNumber
//    }
//
//    fun minus(inputNumber: Int) {
//        result -= inputNumber
//    }
//
//    fun multiply(inputNumber: Int) {
//        result *= inputNumber
//    }
//
//    fun devide(inputNumber: Int) {
//        result /= inputNumber
//    }
//}
//
//val cal2 = Calculator()
//cal2.sum(3)
//cal2.minus(1)
//cal2.multiply(5)


//계산기2
//- 사칙연산을 할 수 있는 1개의 함수 구현
//        ex) calculater.calculate('+', 10)
//ex) calculater.calculate('-', 50)
//- 초기값을 할당 할 수 있어야 하며 초기 값을 할당 하지 않은 경우에는 0 을 기본값으로 사용한다
//        - 불가능한 연산을 요청한 경우 "잘못된 연산 입니다"를 출력 한다
//

//class Calculator constructor(val initialValue: Int = 0){
//
//    var result: Int
//
//    init{
//        this.result = initialValue
//    }
//
//    var initNumber : Int = 0
//
//    fun calculate(giho: Char, number: Int){
//        when(giho){
//            '+'-> this.result += number
//            '-'-> this.result -= number
//            '*'-> this.result *= number
//            '/'-> this.result /= number
//            else -> println("잘못된 연산 입니다")
//        }
//    }
//}
//
//val cal2 = Calculator()
//cal2.calculate('+', 3)
//cal2.calculate('+', 3)
//cal2.calculate('+', 3)
//cal2.calculate('+', 3)
//println(cal2.result)
//        계산기3
//- 사칙연산을 할 수 있는 1개의 함수 구현
//        - 한번에 여러가지의 연산을 입력 받을 수 있어야 한다
//        - ex> 더하기3 더하기5 나누기10 곱하기2지
//        - ex> calculater.calculate(더하기3, 더하기5, 빼기2, 나누기5)

class Calculator {

    fun calculate(){

    }


    fun _calculate(giho: Char, number: Int){
        when(giho){
            '+'-> this.result += number
            '-'-> this.result -= number
            '*'-> this.result *= number
            '/'-> this.result /= number
            else -> println("잘못된 연산 입니다")
        }
}}