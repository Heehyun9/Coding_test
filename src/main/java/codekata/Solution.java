package codekata;

//프로그래머스 코딩테스트 입문(레벨1)

class Solution {

    /* 두수의 차 구하기
    입력 : num1, num2(int) 출력: num1 - num2(answer로 리턴)*/

    public int solution1(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    /* 두 수의 곱 구하기
    입력 : num1, num2 / 출력 : num1 * num2(answer)
    */
    public int solution2(int num1, int num2) {
        int answer = num1*num2;
        return answer;
    }

    /* 몫 구하기
    입력 : num1, num2(int) / 출력 : num1/num2(answer)
    */
    public int solution3(int num1, int num2) {
        int answer = num1/num2;
        return answer;
    }

    /* 나이 출력
    입력: 2022년 기준 선생님의 나이 age
    출력 : 선생님의 출생 연도
     */
    public int solution4(int age) {
        int answer = 0;
        answer = 2022 - age +1;
        return answer;
    }

    /* 숫자 비교하기
    입력 : num1, num2(int)
    출력 : 두수가 같으면 1, 다르면 - 1
     */
    public int solution5(int num1, int num2) {
        int answer = 0;
        answer = (num1 == num2 ? 1 : -1);
        return answer;
    }

    /* 두 수의 합 구하기
    입력 : num1, num2(int)
    출력 : num1+ num2
     */
    public int solution6(int num1, int num2) {
        int answer  = num1 + num2;
        return answer;
    }

    /* 두 수의 나눗셈
    입력 : num1, num2(int)
    출력 : (num1 / num2) * 1000 한 후 정수부분만 return
     */
    public int solution7(int num1, int num2){
        int answer = (int)(num1 / num2) * 1000;
        return answer;
    }

    /* 두 수의 나눗셈
    입력 : num1, num2
    출력 : num1을 num2로 나눈 값에 1000을 곱한 후 정수부분을  return
    유의 : double 형 변환 대신 * 1.0 사용 / 정수부분 return 위해 int 강제 형변환 사용
     */
    public int solution8(int num1, int num2) {
        int answer = (int)(1.0 * num1 / num2 * 1000);
        return answer;
    }


    /* 각도기
    입력 : angle(int)
    출력 : 0<angle<90 = 1 , angle ==90 = 2 , 90<angle<180 = 3, angle==180 = 4
     */
    public int solution9(int angle) {
        int answer = (angle == 180)? 4 : (angle == 90) ? 2 : (angle < 90) ? 1 : 3;
        return answer;
    }
}

