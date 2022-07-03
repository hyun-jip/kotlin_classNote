// 1. 주어진 문자를 n번 반복해서 출력하는 함수를 만들어 보자
//
//val a = "문자"
//val n = 3
//for (value in 1..n){
//    println(a)
//}

// 2. 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자
//
//val number = 10
//var sum = 0
//
//for (value in 1..number) {
//    sum = sum + value
//}
//
//println(sum)
//


// 3. 1부터 100까지의 수중에서 7의 배수의 합을 구하는 함수를 만드시오
//var sum = 0
//for (value in 1..100){
//    if (value % 7 == 0){
//        sum = sum + value
//    }
//}
//
//println(sum)

//4. 100 보다 작은 숫자를 넣어주면, 1씩 증가를 시키고 100 이 되면 종료되는 함수를 만드시오

//fun A(inputNumber: Int): Int{
//    var number = inputNumber
//        while(true){
//            if(number == 100){
//                return number
//            }
//           number += 1
//    }
//}
//A(20)


// 5. 시험 성적 리스트 [70,71,72,77,78,79,80,82,90,99]
//   와 동일한 크기의 배열을 만들고, 합격이면 true, 불합격이면 false를 담는 함수를 만드시오
//   (80점 이상 부터 합격, 정답 예시 (False,False,...))
//
//fun B(inputArray: List<Int>):BooleanArray{
//    val resultArray = BooleanArray(inputArray.size,{false})
//    inputArray.forEachIndexed{index, score ->
//        if(score >= 80){
//            resultArray[index] = true
//        }
//    }
//    return resultArray
//}
//
//val result = B(listOf<Int>(70,71,72,77,78,79,80,82,90,99))
//result.forEach { println(it) }

// 6. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오
//   -> [[3,3],[1,5],...]
//
//fun C(): List<List<Int>>{
//    val resultList = mutableListOf<List<Int>>()
//    for (i in 1..6){
//        for (j in 1..6){
//            if(i + j== 6){
//                val temp = listOf<Int>(i,j)
//                resultList.add(temp)
//
//            }
//        }
//    }
//    return resultList
//}
//
//C()

//7. 배부르기 위해서 먹어야하는 총 밥먹기 횟수, 현재 밥먹은 횟수, 두개를 받는 함수를 만드시오
//        함수는 "밥을 먹었다" 한번 출력을 할때 마다 밥을 1회 먹은 것으로 간주를 하고,
//배가 부를 때까지 밥을 먹여야 한다
//        배가 부를 경우에는 "배가 부르다" 를 출력한다
//배가 아무리 불러도 최소 한번은 무조건먹는다
//fun eat(3,2):{}
//->"밥을 먹었다"
//->"배가 부르다"
//
//fun E(sum:Int, now: Int) {
//    var nowvar = now
//    do{
//        println("밥을 먹었다")
//        nowvar++
//    }while (sum < now)
//    println("배가 부르다")
//}
//
//E(5, 2)

//8. 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두개의 병사
//        그룹을 합쳐주는 함수를 만드시오
//fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 2)
//-> [["A", "B", "D", "E"], ["A", "B"]]
//
//(합수 실행이 어려운 조건을 만나면 null을 리턴해야한다)
//fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 100)
//-> null
//
//fun F(groupA: List<String>, groupB: List<String>, n: Int): List<List<String>>?{
//    if(groupA.size < n || groupB.size < n) return null
//
//    val reGroupA = mutableListOf<String>()
//    val reGroupB = mutableListOf<String>()
//    for ((index, value) in groupA.withIndex()){
//        if (index != n) reGroupA.add(value)
//    }
//    for ((index, value) in groupB.withIndex()){
//        if (index != n) reGroupB.add(value)
//    }
//    val sumGroup = listOf<List<String>>(reGroupA,reGroupB)
//    return sumGroup
//}
//
//println(F(
//    groupA = listOf<String>("A","B","C","D","E"),
//    groupB = listOf<String>("A", "B", "C"), 2
//))


//9. 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오
//fun abc(3)
//->[3,6,9,12,15,18,21,24,27]

//fun G(dan: Int): List<Int>{
//    var result = mutableListOf<Int>()
//    for(i in 1..9){
//       result.add(i * dan)
//    }
//    return result
//}
//
//G(3)

//10. 숫자 리스트 두개를 넣어주면 짝수 홀수로 분리된 Map을 만드는 함수를 만드시오
//(Map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수" 한다)

//fun H (listA: List<Int>, listB : List<Int>): Map<String,List<Int>>{
//    val result = mutableMapOf<String,List<Int>>()
//    val total = mutableListOf<Int>()
//    total.addAll(listA)
//    total.addAll(listB)
//
//    val evenNumber = mutableListOf<Int>()
//    val oddNumber = mutableListOf<Int>()
//    total.forEach{
//        number ->
//        if(number % 2 == 0) evenNumber.add(number)
//        else oddNumber.add(number)
//        }
//        result.put("짝수", evenNumber)
//        result.put("홀수", oddNumber)
//        return result
//}
//
//println(H(listOf<Int>(1,2,3,4,5), listOf<Int>(6,7,8,9,10)))