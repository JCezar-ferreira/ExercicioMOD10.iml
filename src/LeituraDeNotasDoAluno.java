public class LeituraDeNotasDoAluno {
        public static void main(String args[]) {
            int num1 = 6;
            int num2 = 7;
            int num3 = 8;
            int num4 = 9;
            int num5 = 4;

            int num6 = (num1 + num2 + num3 + num4)/num5;
            System.out.println(num6);
            if (num6 >= 7) {
                System.out.println("Aluno Aprovado");
        } else if (num6 <= 5) {
                System.out.println("Aluno em Recuperação");
            } else if (num6 < 5) {
                System.out.println("Aluno Reprovado");
            }
        }
    }