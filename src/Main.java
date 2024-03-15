import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o CEP que deseja pesquisar:");
        String cep = scanner.next();

        try{
            BuscaCEP buscaCEP = new BuscaCEP();
            Endereco enderecoJson = buscaCEP.buscaEndereco(cep);
            MostraEndereco endereco = new MostraEndereco(enderecoJson);
            System.out.println(endereco);
            GeradorDeArquivos geradorDeArquivos = new GeradorDeArquivos();
            geradorDeArquivos.geraArquivo(enderecoJson);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }


    }
}
