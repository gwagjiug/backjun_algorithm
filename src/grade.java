import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumNumxScore = 0; //학점과 과목 평점의 곱을 누적해서 합산할 변수
        double sumNum = 0; //학점을 누적해서 합산할 변수

        for (int i = 0; i < 20; i++) { //for 루프는 20번 반복되고 입력을 20번 받음
            String line = scanner.nextLine(); //한 줄의 입력을 받아 line 변수에 저장
            String[] parts = line.split(" "); //받아온 줄을 공백을 기준으로 분리하여 parts 배열에 저장
            String object = parts[0]; //첫번째 인덱스에는 학문명을 저장
            double num = Double.parseDouble(parts[1]); //parts 배열의 두 번재 요소 즉, 학점을 문자열에서 숫자로 변환하여 num 변수에 저장
            String alphabet = parts[2]; //배열의 세번째 요소 등급을 문자열로 저장
            double score = 0; //과목 평점을 나타내는 변수


            //전공평점은 전공 과목별 (학점 X 과목평점)의 합을 학점의 총합으로 나눈 값
            //즉 , 과목별 (num(학점) X 해당 (등급) score ) / sumNum 으로 나눈 것

            if (!(alphabet.equals("P"))) { //만약 등급 즉 alphabet이 "P"라면 Pass 이므로 제외 함
                switch (alphabet) {
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                    default:
                        break;
                }

                sumNumxScore += (num * score);
                sumNum += num;
            }
            //문제의 조건인 20줄 동안 for문이 반복하면서 switch 문도 20번 반복하게 되고
            //그 동안 모든 입력에 대해서 split으로 과목명 , 학점 , 등급을 구분하게 되고
            //등급을 기준으로 score 값을 받아오고 , 해당 과목의 학점을 sumNum에 계속해서 더해간다
            //(score * num) = sumNumxScore 에 저장하고 전제 학점인 sumNum과 마지막에 나누어서 출력


            //전공평점은 전공 과목별 (학점 X 과목평점)의 합을 학점의 총합으로 나눈 값
            //즉 , 과목별 (num(학점) X 해당 (등급) score ) / sumNum 으로 나눈 것
        }
        System.out.printf("%.6f", sumNumxScore / sumNum);
        scanner.close();
    }
}
