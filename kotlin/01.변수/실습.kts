// 주석 작성은 슬래시 두개
// 주석 단축키는 cntl + /

// 1. var 변수 선언하기

var changeYes = 100
// 코틀린은 변수 생성 시 꼭 초기화를 같이 해야한다.
println(changeYes)

changeYes = 200

println(changeYes)


// 2. val 변수 선언하기

val CHANGE_NO = 100
println(CHANGE_NO)
// 실행 불가 -> CHANGE_NO = 200
// val은 값 재할당 불가함

val SCHOOL_NAME = "학교"
println(SCHOOL_NAME)