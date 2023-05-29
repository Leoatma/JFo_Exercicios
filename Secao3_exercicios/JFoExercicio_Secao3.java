import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Locale;


public class JFoExercicio_Secao3 {
  
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    JOptionPane.showMessageDialog(null, "Olá! Bem vindo(a), vamos imaginar como você estará daqui a alguns anos? ", "Você tem 01 Convite!", 2);

    String nome = JOptionPane.showInputDialog("Pra começar, por favor digite seu nome");
    int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a sua idade"));
    double rendaAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é a sua renda atual, em R$?"));


    String campoAtuacao = JOptionPane.showInputDialog(null, nome + ", qual área deseja seguir sua carreira?", "Carreira", 3);
    String linguagemInteresse = JOptionPane.showInputDialog(null, "Nesta, em qual linguagem planeja se especializar?", "Carreira", 3);
    double salarioDesejado = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o seu salario pretendido, R$: ?", "Carreira", 3));
    String cidadePretendida = JOptionPane.showInputDialog(null, "Em que cidade gostaria de estar vivendo?", "Carreira", 3);
    int tempobjetivo = Integer.parseInt(JOptionPane.showInputDialog(null, "Em quanto tempo, em anos, você espera alcançar este objetivo?", "Carreira", 3));

    int idadeFuturo = idade + tempobjetivo;
    double proporcaoAumentoRenda = ((salarioDesejado - rendaAtual) / rendaAtual) * 100;
    DecimalFormat formatador = new DecimalFormat("###,##");

    JOptionPane.showMessageDialog(null,nome + ", aos " + idadeFuturo
            + " anos, você estará trabalhando em " + cidadePretendida + ", e sendo reconhecido como um excelente profissional de "
            + campoAtuacao + ".");
    JOptionPane.showMessageDialog(null, "Como referência no domínio da linguagem " + linguagemInteresse
            + ", a sua renda aumentará significativamente, sofrendo um aumento de "
            + formatador.format(proporcaoAumentoRenda) + "% em comparação com a sua renda atual.");

    String feedback = JOptionPane.showInputDialog(null,"Esta previsão corresponde ao que você esperava? \nS-(Sim)/N-(Não).", "FeedBack",1).toUpperCase();

    if (feedback.equals("S")) {
      JOptionPane.showMessageDialog(null, "Que bom que gostou, " + nome + "!! Com paciência e esforço você chegará lá!!");
    } else {
      JOptionPane.showMessageDialog(null, "Pelo visto, você ainda não tem clareza. Tudo bem, " + nome + ". Persista e em breve mais clareza você terá.", null, 0);
    }
  }
}